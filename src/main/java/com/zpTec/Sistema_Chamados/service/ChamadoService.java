package com.zpTec.Sistema_Chamados.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zpTec.Sistema_Chamados.dto.chamado.CadastrarChamadoDto;
import com.zpTec.Sistema_Chamados.model.Chamado;
import com.zpTec.Sistema_Chamados.model.StatusChamado;
import com.zpTec.Sistema_Chamados.repository.ChamadoRepository;
import com.zpTec.Sistema_Chamados.repository.UsuarioRepository;

import jakarta.transaction.Transactional;


@Service
public class ChamadoService{

    public final ChamadoRepository chamadoRepository;

    public ChamadoService(ChamadoRepository chamadoRepository) {
        this.chamadoRepository = chamadoRepository;
    }

    @Transactional
    public void atualizarStatusChamado(Long idChamado, StatusChamado novoStatus){

        Optional<Chamado> chamadoOptional = chamadoRepository.findById(idChamado);

        if(chamadoOptional.isPresent()){

            Chamado chamado = chamadoOptional.get();
            chamado.setStatus(novoStatus);
        }


    }


    public void novoChamado(CadastrarChamadoDto dto){

        chamadoRepository.save(new Chamado(dto.titulo(),dto.descricao(),));

    }



}
