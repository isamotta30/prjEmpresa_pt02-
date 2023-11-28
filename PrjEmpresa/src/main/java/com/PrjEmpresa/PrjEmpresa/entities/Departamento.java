package com.PrjEmpresa.PrjEmpresa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_departamento")
public class Departamento {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long depcodigo;


@Column (name = "depnome")
private String depnome;


public Long getdepcodigo() {
	return depcodigo;
}
public void setdepcodigo(Long depcodigo) {
	this.depcodigo = depcodigo;
}
public String getdepnome() {
	return depnome;
}
public void setdepnome(String depnome) {
	this.depnome = depnome;
}
	}


