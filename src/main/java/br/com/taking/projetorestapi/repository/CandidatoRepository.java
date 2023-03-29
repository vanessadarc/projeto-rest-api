package br.com.taking.projetorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.taking.projetorestapi.model.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{

}
