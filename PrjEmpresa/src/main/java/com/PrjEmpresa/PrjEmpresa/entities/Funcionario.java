package com.PrjEmpresa.PrjEmpresa.entities;

import java.time.LocalDate;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long funcodigo;
	
	@Column(name = "funnome")
	private String funnome;
	
	@Column(name = "funnascimento")
	  private LocalDate funnascimento;
	
	@Column( name = "funsalario")
	private Double funsalario;
	
	@ManyToOne
	private Departamento departamento;

     public Departamento getDepartamento() {
	return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
     public Long getfuncodigo() {
    	 return funcodigo;
     }
     public void setfuncondigo(Long funcodigo) {
    	 this.funcodigo = funcodigo;
     }
     public String getfunnome() {
    	 return funnome;
     }
     public void setfunnome(String funnome) {
    	 this.funnome = funnome;
     }
     public LocalDate  getfunnascimento() {
    	 return funnascimento;
     }
     public void setfunnascimento(LocalDate funnascimento) {
    	 this.funnascimento = funnascimento;
     }
     public Double  getfunsalario() {
    	 return funsalario;
     }
     public void setfunsalario(Double funsalario) {
    	 this.funsalario = funsalario;
     }
     
}
