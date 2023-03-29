package com.ista.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "ciclo")
@Data
public class Ciclo {
	@Id
	private Long  id_ciclo;
	 
	private String nombre;
	
	private String descripcion;
	
	private List<Carrera> listCarrera;
	
	private List<Asignatura> listAsignatura;
}
