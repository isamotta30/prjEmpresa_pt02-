package com.PrjEmpresa.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PrjEmpresa.PrjEmpresa.entities.Departamento;
import com.PrjEmpresa.PrjEmpresa.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")

public class DepartamentoControler {
	private final DepartamentoService departamentoService;

	@Autowired
	public DepartamentoControler(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	@PostMapping
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamento(departamento);
	}
	@GetMapping("/{depcodigo}")
	public Departamento getDepartamento(@PathVariable Long depcodigo) {
		return departamentoService.getDepartamentoBydepcodigo(depcodigo);
	}
	@GetMapping
	public List<Departamento> getAllDepartamento(){
		return departamentoService.getAllDepartamento();
	}
	@DeleteMapping("/{depcodigo}")
	public void deleteDepartamento(@PathVariable Long depcodigo) {
		departamentoService.deleteDepartamento(depcodigo);
	}
}
