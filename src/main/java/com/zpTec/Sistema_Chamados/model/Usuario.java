package com.zpTec.Sistema_Chamados.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_usuario")
public class Usuario{

    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;







}
