package com.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.model.Carrera;
import com.ista.repository.CarreraRepository;

@Service
public class CarreraServiceImpl extends GenericServiceImpl<Carrera, Long> implements CarreraService{
	@Autowired
	CarreraRepository CarreraRepository;
	@Override
	public CrudRepository<Carrera, Long> getDao() {
		return CarreraRepository;
	}

}
