package com.acme.taskmanager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tarefas")
public class Tarefas implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	Para anotações de coluna no banco:
//	@Column(name = "EST_CD_ESTABELECIMENTO", precision = 4, scale = 0)

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tarefa")
	private Long id;
	
	@Column(name = "data_tarefa")
	private Date data;
	
	@Column(name = "descricao_tarefa", length = 100)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
