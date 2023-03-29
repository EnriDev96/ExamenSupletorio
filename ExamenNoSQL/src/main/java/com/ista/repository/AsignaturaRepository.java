package com.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Asignatura;

public interface AsignaturaRepository extends MongoRepository<Asignatura, Long>{

}
