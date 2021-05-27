package com.acme.taskmanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.taskmanager.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long>{
	
	Optional<Tarefas> findById(Long id);

}
