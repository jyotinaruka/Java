package com.dojo.spring.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.dojo.spring.model.Song;
import com.dojo.spring.repositories.LookifyRepository;

@Service
public class LookifyService {

	private final LookifyRepository lookifyRepository;

	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}

	public List<Song> allSongs() {
		return lookifyRepository.findAll();
	}

	public void save(@Valid Song song) {
		lookifyRepository.save(song);
	}

	public void deleteById(Long id) {
		lookifyRepository.deleteById(id);
	}

	public Song findById(Long id) {
		Optional<Song> optional = lookifyRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Song> getTopSongs() {
		return lookifyRepository.findTop10ByOrderByRatingDesc();

	}

	public List<Song> findAllByArtist(String artist) {
		return lookifyRepository.findAllByArtist(artist);
	}

}
