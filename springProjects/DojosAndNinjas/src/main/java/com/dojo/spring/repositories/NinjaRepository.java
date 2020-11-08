package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojo.spring.model.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	List<Ninja> findAllByDojoId(Long idDojo);

}
