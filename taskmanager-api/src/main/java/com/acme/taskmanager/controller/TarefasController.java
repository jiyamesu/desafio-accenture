package com.acme.taskmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public List<Tarefas> listaTodos() {
		return repository.findAll();
	}

	@GetMapping("/tarefa/{id}")
	public Optional<Tarefas> lista(@PathVariable(value = "id") Long id) {
		return repository.findById(id);
	}

	@PostMapping("/tarefa")
	public Tarefas salva(@RequestBody Tarefas tr) {
		return repository.save(tr);
	}
	
	@DeleteMapping("/tarefa")
	public void deleta(@RequestBody Tarefas tr) {
		repository.delete(tr);
	}
	
	@PutMapping("/tarefa")
	public Tarefas atualiza(@RequestBody Tarefas tr) {
		return repository.save(tr);
	}

}
