package com.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, Long>{

}
