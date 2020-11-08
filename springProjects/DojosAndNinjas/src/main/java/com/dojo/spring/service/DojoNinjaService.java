package com.dojo.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojo.spring.model.Dojo;
import com.dojo.spring.model.Ninja;
import com.dojo.spring.repositories.DojoRepository;
import com.dojo.spring.repositories.NinjaRepository;


@Service
public class DojoNinjaService {
	
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public DojoNinjaService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return dojoRepository.findAll();
	}
	
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	public List<Ninja> getAllNinjasForDojo(Long idDojo) {
		return ninjaRepository.findAllByDojoId(idDojo);
	}	

}
