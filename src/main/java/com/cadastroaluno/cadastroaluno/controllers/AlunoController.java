package com.cadastroaluno.cadastroaluno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroaluno.cadastroaluno.entities.Aluno;
import com.cadastroaluno.cadastroaluno.repositories.AlunoRepository;


@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public List<Aluno> getAlunos(){
		List<Aluno> listarAlunos = repository.findAll();
		return listarAlunos;
	}
	
	@GetMapping(value ="/{id}")
	public Aluno getAluno(@PathVariable Long id) {
		Aluno alunoId = repository.findById(id).get();
		return alunoId;
	}
}
