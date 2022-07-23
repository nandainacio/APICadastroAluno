package com.cadastroaluno.cadastroaluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroaluno.cadastroaluno.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
