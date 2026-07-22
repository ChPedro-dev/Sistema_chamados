package com.zpTec.Sistema_Chamados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "tb_chamado")
@Data
public class Chamado {

    @Id
    private Long id;
    private String titulo;
    private String descricao;



}
