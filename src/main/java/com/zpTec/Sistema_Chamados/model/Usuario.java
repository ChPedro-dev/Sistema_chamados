package com.zpTec.Sistema_Chamados.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private Cargo cargo;

	@JsonIgnore
	@OneToMany(mappedBy = "usuarioCriador", cascade = CascadeType.ALL)
	private List<Chamado> chamadosCriados;

	@JsonIgnore
	@OneToMany(mappedBy = "usuarioEncarregado", cascade = CascadeType.ALL)
	private List<Chamado> chamadosEncarregados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Chamado> getChamadosCriados() {
		return chamadosCriados;
	}

	public void setChamadosCriados(List<Chamado> chamadosCriados) {
		this.chamadosCriados = chamadosCriados;
	}

	public List<Chamado> getChamadosEncarregados() {
		return chamadosEncarregados;
	}

	public void setChamadosEncarregados(List<Chamado> chamadosEncarregados) {
		this.chamadosEncarregados = chamadosEncarregados;
	}

}
