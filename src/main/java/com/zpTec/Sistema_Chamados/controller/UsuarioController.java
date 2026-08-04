package com.zpTec.Sistema_Chamados.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpTec.Sistema_Chamados.dto.usuario.CadastrarUsuarioDto;
import com.zpTec.Sistema_Chamados.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping("/novo")
    public void CadastrarUsuario(@RequestBody CadastrarUsuarioDto dto) {
        
        service.cadastrarUsuario(dto);

    }
    



    
}
