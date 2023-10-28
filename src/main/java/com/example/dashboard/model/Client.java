package com.example.dashboard.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "cliente", uniqueConstraints = {
		@UniqueConstraint(name = "clientes_constraint", columnNames = { "email" }) })
public class Client {
	
	@Id
	@SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
	private Long id;
	
	@Column(length = 255)
	private String nome;
	
	@Column(length = 255, unique = true)
	private String email;
	
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "usuario_id", referencedColumnName = "id" ,nullable = false)
	private User user;
	
	public Client() {
		super();
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
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


	public Client(Long id, String nome, String email, User user, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.user = user;
		this.dataCadastro = dataCadastro;
	}


	public Client(String nome, String email, User user, LocalDate dataCadastro) {
		super();
		this.nome = nome;
		this.email = email;
		this.user = user;
		this.dataCadastro = dataCadastro;
	}





	
	
	

}
