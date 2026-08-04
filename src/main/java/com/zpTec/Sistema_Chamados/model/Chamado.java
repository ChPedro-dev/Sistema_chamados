package com.zpTec.Sistema_Chamados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_chamado")
public class Chamado {

    @Id
    private Long id;
    private String titulo;
    private String descricao;

	@Enumerated(EnumType.STRING)
    private StatusChamado status = StatusChamado.ABERTO;

    @ManyToOne
    @JoinColumn(name = "usuario_criador_id")
    private Usuario usuarioCriador;

    @ManyToOne
    @JoinColumn(name = "usuario_encarregado_id")
    private Usuario usuarioEncarregado;


    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public StatusChamado getStatus() {
		return status;
	}
	public void setStatus(StatusChamado status) {
		this.status = status;
	}
	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}
	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}
	public Usuario getUsuarioEncarregado() {
		return usuarioEncarregado;
	}
	public void setUsuarioEncarregado(Usuario usuarioEncarregado) {
		this.usuarioEncarregado = usuarioEncarregado;
	}



}
