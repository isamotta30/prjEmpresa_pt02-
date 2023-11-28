package com.PrjEmpresa.PrjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PrjEmpresa.PrjEmpresa.entities.Departamento;
import com.PrjEmpresa.PrjEmpresa.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
	private final DepartamentoRepository departamentoRepository;
	
	@Autowired
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}
	
	public Departamento saveDepartamento (Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	public Departamento getDepartamentoBydepcodigo(Long depcodigo) {
	return departamentoRepository.findById(depcodigo).orElse(null);
	}
	public List<Departamento> getAllDepartamento(){
		return departamentoRepository.findAll();
		}
	public void deleteDepartamento(Long depcodigo) {
		departamentoRepository.deleteById(depcodigo);
	}
	


	}


