package com.unifametro.apirestful.entities;

import java.io.Serializable;
import java.time.Instant;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Instant bihtDate;
	private Double income;	

}
