package com.dojo.spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojo.spring.model.License;

public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findTopByOrderByNumberDesc();
}
