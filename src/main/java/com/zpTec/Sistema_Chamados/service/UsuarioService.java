package com.zpTec.Sistema_Chamados.service;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.zpTec.Sistema_Chamados.dto.usuario.CadastrarUsuarioDto;
import com.zpTec.Sistema_Chamados.model.Usuario;
import com.zpTec.Sistema_Chamados.repository.UsuarioRepository;

public class UsuarioService {

    public final UsuarioRepository repository;
    private PasswordEncoder passwordEncoder;


    public UsuarioService(UsuarioRepository repository,PasswordEncoder passwordEncoder){
       this.repository = repository;
       this.passwordEncoder = passwordEncoder;
       
    }

    public void cadastrarUsuario(CadastrarUsuarioDto dto) {
        
        repository.save(new Usuario
            (
                dto.nome(),
                dto.sobrenome(),
                dto.email(),
                passwordEncoder.encode(dto.senha())
            ));
        
    }

}
