package funtec.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import funtec.academiadigital.entity.AvaliacaoFisica;

public interface AvaliacaoFisicaRepository extends JpaRepository <AvaliacaoFisica, Long> {

}
