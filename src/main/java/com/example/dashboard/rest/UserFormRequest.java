package com.example.dashboard.rest;

import java.time.LocalDate;

import com.example.dashboard.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;

public class UserFormRequest {

	private Long id;
	private String usuario;
	private String senha;
	private String nome;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro;
	private String acessoToken;

	public UserFormRequest() {
		super();
	}

	public UserFormRequest(Long id, String usuario, String senha, LocalDate dataCadastro, String acessoToken) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
		this.acessoToken = acessoToken;
	}

	public UserFormRequest(Long id, String usuario, String senha, String nome, LocalDate dataCadastro,
			String acessoToken) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.acessoToken = acessoToken;
	}

	public User toModel() {
		return new User(id, usuario, senha, nome, acessoToken);
	}

	public static UserFormRequest fromModel(User user) {
		return new UserFormRequest(user.getId(), user.getUsuario(), user.getSenha(), user.getDataCadastro(), user.getAcessoToken());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

	public String getAcessoToken() {
		return acessoToken;
	}

	public void setAcessoToken(String acessoToken) {
		this.acessoToken = acessoToken;
	}

	@Override
	public String toString() {
		return "UserFormRequest [id=" + id + ", usuario=" + usuario + ", senha=" + senha + "]";
	}

}
