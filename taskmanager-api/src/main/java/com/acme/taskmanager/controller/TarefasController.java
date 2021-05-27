package com.acme.taskmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.taskmanager.model.Tarefas;
import com.acme.taskmanager.repository.TarefasRepository;

@RestController
@RequestMapping(value = "/api")
public class TarefasController {

	@Autowired
	TarefasRepository repository;

	@GetMapping("/tarefas")
	public List<Tarefas> listaTarefas() {
		return repository.findAll();
	}
	
	@GetMapping("/tarefa/{id}")
	public Optional<Tarefas> listaTarefa(@PathVariable (value = "id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/tarefa")
	public Tarefas salvaTarefa(@RequestBody Tarefas tr) {
		return repository.save(tr); 
	}

}
