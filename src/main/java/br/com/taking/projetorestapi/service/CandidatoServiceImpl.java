package br.com.taking.projetorestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.projetorestapi.model.Candidato;
import br.com.taking.projetorestapi.repository.CandidatoRepository;

@Service
public class CandidatoServiceImpl implements CandidatoService {
	
	@Autowired
	private CandidatoRepository repository;

	@Override
	public List<Candidato> listar() {
		return repository.findAll();
	}

	@Override
	public Candidato incluir(Candidato candidato) {
	 return repository.save(candidato);
	}

	@Override
	public Candidato obterPorId(int id) {
	      Optional<Candidato> result = repository.findById(id);
	      
	      if(result.isPresent()) {
	    	  return result.get();
	      }else {
	    	  return null;
	      }
	}

	

	@Override
	public Candidato atualizar(int id, Candidato newCandidato) {
		Optional<Candidato> resultBd = repository.findById(id);
		if(resultBd.isPresent()) {
			Candidato candidatoBD = resultBd.get();
			candidatoBD.setData_nascimento(newCandidato.getData_nascimento());
			candidatoBD.setEmail(newCandidato.getEmail());
			candidatoBD.setId(newCandidato.getId());
			candidatoBD.setNome(newCandidato.getNome());
			candidatoBD.setTelefone(newCandidato.getTelefone());
		return	repository.save(candidatoBD);
		}else {
			return null;
		}
	}

	@Override
	public Boolean deletar(int id) {
		Optional<Candidato> result = repository.findById(id);
		if(result.isPresent()) {
			repository.delete(result.get());
			return true;
		}else{
			return false;
		}
	}
}
