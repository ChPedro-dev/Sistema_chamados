package com.zpTec.Sistema_Chamados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpTec.Sistema_Chamados.model.StatusChamado;
import com.zpTec.Sistema_Chamados.service.ChamadoService;


@RestController
@RequestMapping("/api/chamado")
public class ChamadoController{

    public final ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService){
        this.chamadoService = chamadoService;
    }


    @GetMapping
    public void listarChamados(){


    }

    @PostMapping("/novo")
    public void criarChamado(){


    }

    @PutMapping("atualizar/{id}")
    public void atualizarStatusChamado(@PathVariable Long id, @RequestBody StatusChamado statusChamado) {    
         
        chamadoService.atualizarStatusChamado(id,statusChamado);
    }




}
