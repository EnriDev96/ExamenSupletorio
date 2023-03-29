package com.ista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.model.Periodo;
import com.ista.repository.PeriodoRepository;

@Service
public class PeriodoServiceImpl extends GenericServiceImpl<Periodo, Long> implements PeriodoService{
	@Autowired
	PeriodoRepository base1Repository;
	@Override
	public CrudRepository<Periodo, Long> getDao() {
		return base1Repository;
	}

}
