package com.example.dashboard.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario", uniqueConstraints = {
		@UniqueConstraint(name = "usuario_constraint", columnNames = { "usuario" }) })
public class User {

	@Id
	@SequenceGenerator(name = "usuario_id_seq", sequenceName = "usuario_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
	private Long id;

	@Column(length = 255, unique = true)
	private String usuario;
	@Column(length = 255)
	private String senha;
	@Column(length = 255)
	private String nome;
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	@Column(name = "ultima_alteracao")
	private LocalDate dataAlteracao;
	@Column(name = "acesso_token")
	private String acessoToken;

	public User() {
		super();
	}

	public User(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public User(Long id, String usuario, String senha, String nome) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
	}

	public User(Long id, String usuario, String senha, String nome, String acessoToken) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.acessoToken = acessoToken;
	}

	public User(String usuario, String senha, String nome, LocalDate dataCadastro, String acessoToken) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.acessoToken = acessoToken;
	}

	public User(Long id, String usuario, String senha, String nome, LocalDate dataCadastro, String acessoToken) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.acessoToken = acessoToken;
	}

	@PrePersist
	public void prePersist() {
		setDataCadastro(LocalDate.now());
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

	public LocalDate getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDate dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", usuario=" + usuario + ", senha=" + senha + ", nome=" + nome + ", dataCadastro="
				+ dataCadastro + "]";
	}

}
