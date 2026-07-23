package com.zpTec.Sistema_Chamados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chamado")
public class ChamadoController{

    @GetMapping
    public void listarChamados(){


    }

    @PostMapping("/novo")
    public void criarChamado(){



    }




}
