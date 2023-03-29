package com.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Ciclo;

public interface CicloRepository extends MongoRepository<Ciclo, Long>{

}
