package br.com.taking.projetorestapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="candidato")
public class Candidato {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name = "data_nascimento")
	private String data_nascimento;
	
	@Column(name = "email")
	private String email;
	
	@Column (name="telefone")
	private String telefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	

}
