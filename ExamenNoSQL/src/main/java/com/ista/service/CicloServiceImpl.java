package com.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.model.Ciclo;
import com.ista.repository.CicloRepository;

@Service
public class CicloServiceImpl extends GenericServiceImpl<Ciclo, Long> implements CicloService{
	@Autowired
	CicloRepository CicloRepository;
	@Override
	public CrudRepository<Ciclo, Long> getDao() {
		return CicloRepository;
	}

}
