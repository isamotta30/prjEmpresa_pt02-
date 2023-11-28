package com.PrjEmpresa.PrjEmpresa.services;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PrjEmpresa.PrjEmpresa.entities.Funcionario;
import com.PrjEmpresa.PrjEmpresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository = null;
	
	
	@Autowired
	private FuncionarioRepository FuncionarioRepository;

	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}

	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> getFuncionariosByFunnomeAproximado(String funnome) {
        return funcionarioRepository.findByNomeContaining(funnome);
    }

	public boolean deleteFuncionario(Long id) {
		java.util.Optional<Funcionario> funcionarioExistente = funcionarioRepository.findById(id);
		if (((java.util.Optional<Funcionario>) funcionarioExistente).isPresent()) {
			funcionarioRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Funcionario updateFuncionario(Long funcodigo, Funcionario novoFuncionario) {
		Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(funcodigo);
		if (funcionarioOptional.isPresent()) {
			Funcionario funcionarioExistente = funcionarioOptional.get();
			funcionarioExistente.setfunnome(novoFuncionario.getfuncodigo());
			funcionarioExistente.setfunnascimento(novoFuncionario.getfunnascimento());
			funcionarioExistente.setfunsalario(novoFuncionario.getfunsalario());

			
			if (novoFuncionario.getDepartamento() != null) {
				funcionarioExistente.setDepartamento(novoFuncionario.getDepartamento());
			}		
			return funcionarioRepository.save(funcionarioExistente);
		} else {
			return null; 
		}
	}

	public FuncionarioRepository getFuncionarioRepository() {
		return FuncionarioRepository;
	}

	public void setFuncionarioRepository(FuncionarioRepository funcionarioRepository) {
		FuncionarioRepository = funcionarioRepository;
	}
}