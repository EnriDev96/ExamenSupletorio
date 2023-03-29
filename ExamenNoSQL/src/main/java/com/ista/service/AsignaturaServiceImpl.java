package com.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.model.Asignatura;
import com.ista.repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Long> implements AsignaturaService{
	@Autowired
	AsignaturaRepository AsignaturaRepository;
	@Override
	public CrudRepository<Asignatura, Long> getDao() {
		return AsignaturaRepository;
	}

}
