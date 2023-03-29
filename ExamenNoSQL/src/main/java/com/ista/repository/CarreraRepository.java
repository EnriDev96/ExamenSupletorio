package com.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Carrera;

public interface CarreraRepository extends MongoRepository<Carrera, Long>{

}
