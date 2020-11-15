package com.dojo.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.spring.model.Song;
import com.dojo.spring.service.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;
	
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		return "lookify/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = lookifyService.allSongs();
		model.addAttribute("songList",songs);
		return "lookify/dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String addNew(Model model) {
		model.addAttribute("newSong", new Song());
		return "lookify/addNew.jsp";
	}
	
	@RequestMapping(value = "/songs/new", method = RequestMethod.POST)
	public String processNew(@Valid @ModelAttribute("newSong") Song newSong, BindingResult result) {
		if(result.hasErrors()) {
			return "lookify/addNew.jsp";
		} else {
			lookifyService.save(newSong);
			return "redirect:/dashboard";
		}
	}
	@RequestMapping("/songs/{id}")
	public String showSong(@PathVariable("id") Long id, Model model) {
		Song song = lookifyService.findById(id);
		model.addAttribute("song", song);
		return "lookify/song.jsp";
		
	}
	
	@RequestMapping("/songs/{id}/delete")
	public String deleteSong(@PathVariable("id") Long id) {
		lookifyService.deleteById(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/search/topten")
	public String topTen(Model model) {
		List<Song> songs = lookifyService.getTopSongs();
		model.addAttribute("topSongs", songs);
		return "lookify/topTen.jsp";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("artist") String artist, Model model) {
		List<Song> songs = lookifyService.findAllByArtist(artist);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", artist);
		return "lookify/search.jsp";
	}
	
	

}
