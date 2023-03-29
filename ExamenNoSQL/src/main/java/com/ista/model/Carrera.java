package com.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "carrera")
@Data
public class Carrera {
	@Id
	private Long  id_carrera;
	 
	private String nombre;
	
	private String descripcion;

	private List<Periodo> listPeriodo;
}
