package br.com.taking.projetorestapi.service;

import java.util.List;

import br.com.taking.projetorestapi.model.Candidato;

public interface CandidatoService {
	
	List<Candidato> listar();
	
	Candidato incluir(Candidato candidato);
	
	Candidato obterPorId(int id);
	
	Candidato atualizar(int id, Candidato newCandidato);

}
