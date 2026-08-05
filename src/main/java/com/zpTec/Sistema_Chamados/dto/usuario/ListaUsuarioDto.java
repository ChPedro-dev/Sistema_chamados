package com.zpTec.Sistema_Chamados.dto.usuario;

import com.zpTec.Sistema_Chamados.model.Cargo;
import com.zpTec.Sistema_Chamados.model.Usuario;

public record ListaUsuarioDto(

        String nome,
        String sobrenome,
        String email,
        String senha,
        Cargo cargo) {

    public ListaUsuarioDto(Usuario usuario){
        this
        (
            usuario.getNome(),
            usuario.getSobrenome(),
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getCargo()
        );
    }

}
