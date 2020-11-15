package com.dojo.spring.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.spring.model.Song;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findAllByArtist(String artist);
	List<Song> findTop10ByOrderByRatingDesc();

}
