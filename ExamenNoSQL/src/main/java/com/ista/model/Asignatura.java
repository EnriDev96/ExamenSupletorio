package com.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "asignatura")
@Data
public class Asignatura {
	@Id
	private Long  id_asignatura;
	 
	private String nombre;
	
	private int n_horas;
	
	private int n_horas_practicas;
	
	private int n_horas_autonomas;
	
}
