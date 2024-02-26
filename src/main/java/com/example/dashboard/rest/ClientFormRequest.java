package com.example.dashboard.rest;

import java.time.LocalDate;

import com.example.dashboard.model.Client;
import com.example.dashboard.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientFormRequest {
	
	private Long id;
	private String nome;
	private String email;
	private User user;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro;
		
	
	public ClientFormRequest() {
		super();
	}
	

	public ClientFormRequest(String nome, String email, User user, LocalDate dataCadastro) {
		super();
		this.nome = nome;
		this.email = email;
		this.user = user;
		this.dataCadastro = dataCadastro;
	}


	public ClientFormRequest(Long id, String nome, String email, User user, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.user = user;
		this.dataCadastro = dataCadastro;
	}



	public Client toModel() {
		return new Client(id, nome, email, user, dataCadastro);
	}

	public static ClientFormRequest fromModel(Client client) {
		return new ClientFormRequest(client.getId(), client.getNome(), client.getEmail(), client.getUser(), client.getDataCadastro());
	}
		
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	@Override
	public String toString() {
		return "ClientFormRequest [id=" + id + ", nome=" + nome + ", email=" + email + ", user=" + user
				+ ", dataCadastro=" + dataCadastro + "]";
	}


	

}
