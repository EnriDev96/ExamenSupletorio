package com.ista.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Periodo;

public interface PeriodoRepository extends MongoRepository<Periodo, Long>{

}
