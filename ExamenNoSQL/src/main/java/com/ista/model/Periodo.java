package com.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "periodo")
@Data
public class Periodo {
	@Id
	private Long  id_periodo;
	 
	private String periodo;
	
	private int year;
	
}
