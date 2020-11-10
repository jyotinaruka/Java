package com.dojo.spring.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dojo.spring.model.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findAll();	

}
