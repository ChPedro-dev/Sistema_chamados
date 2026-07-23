package com.zpTec.Sistema_Chamados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zpTec.Sistema_Chamados.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado,Long> {







}
