package com.mog.rstq.norriv.summerProject.repository;

import com.mog.rstq.norriv.summerProject.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {

    Optional<Person> findById(String id);

    Optional<Person> findByFullName(String fullName);



}
