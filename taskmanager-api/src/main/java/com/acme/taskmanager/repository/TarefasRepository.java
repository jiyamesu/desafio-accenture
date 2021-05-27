package com.acme.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.taskmanager.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

}
