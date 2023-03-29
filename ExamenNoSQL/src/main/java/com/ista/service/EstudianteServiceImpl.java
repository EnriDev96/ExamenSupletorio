package com.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.model.Estudiante;
import com.ista.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl extends GenericServiceImpl<Estudiante, Long> implements EstudianteService{
	@Autowired
	EstudianteRepository EstudianteRepository;
	@Override
	public CrudRepository<Estudiante, Long> getDao() {
		return EstudianteRepository;
	}

}
