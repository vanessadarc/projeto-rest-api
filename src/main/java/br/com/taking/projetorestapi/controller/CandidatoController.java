package br.com.taking.projetorestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.taking.projetorestapi.model.Candidato;
import br.com.taking.projetorestapi.service.CandidatoService;

@RestController
public class CandidatoController {
	
	@Autowired
	private CandidatoService service;
	
	
	@RequestMapping(value="/candidato", method = RequestMethod.GET)
	public List<Candidato> GET(){
		
		return service.listar();
	}

	@RequestMapping(value= "/candidato", method = RequestMethod.POST)
	public Candidato Post(@RequestBody Candidato candidato) {
		return service.incluir(candidato);
	}
	
	@RequestMapping(value="/candidato/{id}", method = RequestMethod.GET)
	public ResponseEntity<Candidato> GetById(@PathVariable(value= "id") int id){
		Candidato candidato = service.obterPorId(id);
		if(candidato != null) {
			return new ResponseEntity<Candidato>(candidato, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value= "/candidato/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Candidato> Put(
			@PathVariable(value ="id") int id,
			@RequestBody Candidato candidato){
		Candidato candidatoAtualizado = service.atualizar(id, candidato);
		if(candidatoAtualizado != null) {
			return new ResponseEntity<Candidato> (candidatoAtualizado, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
	