package com.example.dashboard.model;

import java.math.BigDecimal;
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
@Table(name = "receita", uniqueConstraints = {
		@UniqueConstraint(name = "receita_id_constraint", columnNames = { "id" }) })
public class Receitas {

	@Id
	@SequenceGenerator(name = "receita_id_seq", sequenceName = "receita_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receita_id_seq")
	private Long id;

	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
	private Client cliente;

	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "usuario_id", referencedColumnName = "id", nullable = false)
	private User user;

	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@Column(name = "data_entrega")
	private LocalDate dataEntrega;

	@Column(name = "longe_od_esf")
	private BigDecimal longeOdEsf;

	@Column(name = "longe_od_cil")
	private BigDecimal longeOdCil;

	@Column(name = "longe_od_eixo")
	private BigDecimal longeOdEixo;

	@Column(name = "longe_od_dnp")
	private BigDecimal longeOdDnp;

	@Column(name = "longe_od_dp")
	private BigDecimal longeOdDp;

	@Column(name = "longe_oe_esf")
	private BigDecimal longeOeEsf;

	@Column(name = "longe_oe_cil")
	private BigDecimal longeOeCil;

	@Column(name = "longe_oe_eixo")
	private BigDecimal longeOeEixo;

	@Column(name = "longe_oe_dnp")
	private BigDecimal longeOeDnp;

	@Column(name = "longe_oe_dp")
	private BigDecimal longeOeDp;

	@Column(name = "perto_od_esf")
	private BigDecimal pertoOdEsf;

	@Column(name = "perto_od_cil")
	private BigDecimal pertoOdCil;

	@Column(name = "perto_od_eixo")
	private BigDecimal pertoOdEixo;

	@Column(name = "perto_od_dnp")
	private BigDecimal pertoOdDnp;

	@Column(name = "perto_od_dp")
	private BigDecimal pertoOdDp;

	@Column(name = "perto_oe_esf")
	private BigDecimal pertoOeEsf;

	@Column(name = "perto_oe_cil")
	private BigDecimal pertoOeCil;

	@Column(name = "perto_oe_eixo")
	private BigDecimal pertoOeEixo;

	@Column(name = "perto_oe_dnp")
	private BigDecimal pertoOeDnp;

	@Column(name = "perto_oe_dp")
	private BigDecimal pertoOeDp;

	@Column(name = "descricao_lente")
	private String descricaoLente;

	@Column(name = "cor_lente")
	private String corLente;

	@Column
	private Boolean resina;

	@Column
	private Boolean cristal;

	@Column(name = "high_life")
	private Boolean highLife;

	@Column
	private String observacao;
	
	@Column(name = "ultima_alteracao")
	private LocalDate dataAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getLongeOdEsf() {
		return longeOdEsf;
	}

	public void setLongeOdEsf(BigDecimal longeOdEsf) {
		this.longeOdEsf = longeOdEsf;
	}

	public BigDecimal getLongeOdCil() {
		return longeOdCil;
	}

	public void setLongeOdCil(BigDecimal longeOdCil) {
		this.longeOdCil = longeOdCil;
	}

	public BigDecimal getLongeOdEixo() {
		return longeOdEixo;
	}

	public void setLongeOdEixo(BigDecimal longeOdEixo) {
		this.longeOdEixo = longeOdEixo;
	}

	public BigDecimal getLongeOdDnp() {
		return longeOdDnp;
	}

	public void setLongeOdDnp(BigDecimal longeOdDnp) {
		this.longeOdDnp = longeOdDnp;
	}

	public BigDecimal getLongeOdDp() {
		return longeOdDp;
	}

	public void setLongeOdDp(BigDecimal longeOdDp) {
		this.longeOdDp = longeOdDp;
	}

	public BigDecimal getLongeOeEsf() {
		return longeOeEsf;
	}

	public void setLongeOeEsf(BigDecimal longeOeEsf) {
		this.longeOeEsf = longeOeEsf;
	}

	public BigDecimal getLongeOeCil() {
		return longeOeCil;
	}

	public void setLongeOeCil(BigDecimal longeOeCil) {
		this.longeOeCil = longeOeCil;
	}

	public BigDecimal getLongeOeEixo() {
		return longeOeEixo;
	}

	public void setLongeOeEixo(BigDecimal longeOeEixo) {
		this.longeOeEixo = longeOeEixo;
	}

	public BigDecimal getLongeOeDnp() {
		return longeOeDnp;
	}

	public void setLongeOeDnp(BigDecimal longeOeDnp) {
		this.longeOeDnp = longeOeDnp;
	}

	public BigDecimal getLongeOeDp() {
		return longeOeDp;
	}

	public void setLongeOeDp(BigDecimal longeOeDp) {
		this.longeOeDp = longeOeDp;
	}

	public BigDecimal getPertoOdEsf() {
		return pertoOdEsf;
	}

	public void setPertoOdEsf(BigDecimal pertoOdEsf) {
		this.pertoOdEsf = pertoOdEsf;
	}

	public BigDecimal getPertoOdCil() {
		return pertoOdCil;
	}

	public void setPertoOdCil(BigDecimal pertoOdCil) {
		this.pertoOdCil = pertoOdCil;
	}

	public BigDecimal getPertoOdEixo() {
		return pertoOdEixo;
	}

	public void setPertoOdEixo(BigDecimal pertoOdEixo) {
		this.pertoOdEixo = pertoOdEixo;
	}

	public BigDecimal getPertoOdDnp() {
		return pertoOdDnp;
	}

	public void setPertoOdDnp(BigDecimal pertoOdDnp) {
		this.pertoOdDnp = pertoOdDnp;
	}

	public BigDecimal getPertoOdDp() {
		return pertoOdDp;
	}

	public void setPertoOdDp(BigDecimal pertoOdDp) {
		this.pertoOdDp = pertoOdDp;
	}

	public BigDecimal getPertoOeEsf() {
		return pertoOeEsf;
	}

	public void setPertoOeEsf(BigDecimal pertoOeEsf) {
		this.pertoOeEsf = pertoOeEsf;
	}

	public BigDecimal getPertoOeCil() {
		return pertoOeCil;
	}

	public void setPertoOeCil(BigDecimal pertoOeCil) {
		this.pertoOeCil = pertoOeCil;
	}

	public BigDecimal getPertoOeEixo() {
		return pertoOeEixo;
	}

	public void setPertoOeEixo(BigDecimal pertoOeEixo) {
		this.pertoOeEixo = pertoOeEixo;
	}

	public BigDecimal getPertoOeDnp() {
		return pertoOeDnp;
	}

	public void setPertoOeDnp(BigDecimal pertoOeDnp) {
		this.pertoOeDnp = pertoOeDnp;
	}

	public BigDecimal getPertoOeDp() {
		return pertoOeDp;
	}

	public void setPertoOeDp(BigDecimal pertoOeDp) {
		this.pertoOeDp = pertoOeDp;
	}

	public String getDescricaoLente() {
		return descricaoLente;
	}

	public void setDescricaoLente(String descricaoLente) {
		this.descricaoLente = descricaoLente;
	}

	public String getCorLente() {
		return corLente;
	}

	public void setCorLente(String corLente) {
		this.corLente = corLente;
	}

	public Boolean getResina() {
		return resina;
	}

	public void setResina(Boolean resina) {
		this.resina = resina;
	}

	public Boolean getCristal() {
		return cristal;
	}

	public void setCristal(Boolean cristal) {
		this.cristal = cristal;
	}

	public Boolean getHighLife() {
		return highLife;
	}

	public void setHighLife(Boolean highLife) {
		this.highLife = highLife;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	public LocalDate getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDate dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@PrePersist
	public void prePersist() {
		setDataCadastro(LocalDate.now());
	}

	public Receitas() {
		super();
	}

	public Receitas(Long id, Client cliente, User user, LocalDate dataCadastro, LocalDate dataEntrega,
			BigDecimal longeOdEsf, BigDecimal longeOdCil, BigDecimal longeOdEixo, BigDecimal longeOdDnp,
			BigDecimal longeOdDp, BigDecimal longeOeEsf, BigDecimal longeOeCil, BigDecimal longeOeEixo,
			BigDecimal longeOeDnp, BigDecimal longeOeDp, BigDecimal pertoOdEsf, BigDecimal pertoOdCil,
			BigDecimal pertoOdEixo, BigDecimal pertoOdDnp, BigDecimal pertoOdDp, BigDecimal pertoOeEsf,
			BigDecimal pertoOeCil, BigDecimal pertoOeEixo, BigDecimal pertoOeDnp, BigDecimal pertoOeDp,
			String descricaoLente, String corLente, Boolean resina, Boolean cristal, Boolean highLife,
			String observacao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.user = user;
		this.dataCadastro = dataCadastro;
		this.dataEntrega = dataEntrega;
		this.longeOdEsf = longeOdEsf;
		this.longeOdCil = longeOdCil;
		this.longeOdEixo = longeOdEixo;
		this.longeOdDnp = longeOdDnp;
		this.longeOdDp = longeOdDp;
		this.longeOeEsf = longeOeEsf;
		this.longeOeCil = longeOeCil;
		this.longeOeEixo = longeOeEixo;
		this.longeOeDnp = longeOeDnp;
		this.longeOeDp = longeOeDp;
		this.pertoOdEsf = pertoOdEsf;
		this.pertoOdCil = pertoOdCil;
		this.pertoOdEixo = pertoOdEixo;
		this.pertoOdDnp = pertoOdDnp;
		this.pertoOdDp = pertoOdDp;
		this.pertoOeEsf = pertoOeEsf;
		this.pertoOeCil = pertoOeCil;
		this.pertoOeEixo = pertoOeEixo;
		this.pertoOeDnp = pertoOeDnp;
		this.pertoOeDp = pertoOeDp;
		this.descricaoLente = descricaoLente;
		this.corLente = corLente;
		this.resina = resina;
		this.cristal = cristal;
		this.highLife = highLife;
		this.observacao = observacao;
	}

	public Receitas(Client cliente, User user, LocalDate dataCadastro, LocalDate dataEntrega, BigDecimal longeOdEsf,
			BigDecimal longeOdCil, BigDecimal longeOdEixo, BigDecimal longeOdDnp, BigDecimal longeOdDp,
			BigDecimal longeOeEsf, BigDecimal longeOeCil, BigDecimal longeOeEixo, BigDecimal longeOeDnp,
			BigDecimal longeOeDp, BigDecimal pertoOdEsf, BigDecimal pertoOdCil, BigDecimal pertoOdEixo,
			BigDecimal pertoOdDnp, BigDecimal pertoOdDp, BigDecimal pertoOeEsf, BigDecimal pertoOeCil,
			BigDecimal pertoOeEixo, BigDecimal pertoOeDnp, BigDecimal pertoOeDp, String descricaoLente, String corLente,
			Boolean resina, Boolean cristal, Boolean highLife, String observacao) {
		super();
		this.cliente = cliente;
		this.user = user;
		this.dataCadastro = dataCadastro;
		this.dataEntrega = dataEntrega;
		this.longeOdEsf = longeOdEsf;
		this.longeOdCil = longeOdCil;
		this.longeOdEixo = longeOdEixo;
		this.longeOdDnp = longeOdDnp;
		this.longeOdDp = longeOdDp;
		this.longeOeEsf = longeOeEsf;
		this.longeOeCil = longeOeCil;
		this.longeOeEixo = longeOeEixo;
		this.longeOeDnp = longeOeDnp;
		this.longeOeDp = longeOeDp;
		this.pertoOdEsf = pertoOdEsf;
		this.pertoOdCil = pertoOdCil;
		this.pertoOdEixo = pertoOdEixo;
		this.pertoOdDnp = pertoOdDnp;
		this.pertoOdDp = pertoOdDp;
		this.pertoOeEsf = pertoOeEsf;
		this.pertoOeCil = pertoOeCil;
		this.pertoOeEixo = pertoOeEixo;
		this.pertoOeDnp = pertoOeDnp;
		this.pertoOeDp = pertoOeDp;
		this.descricaoLente = descricaoLente;
		this.corLente = corLente;
		this.resina = resina;
		this.cristal = cristal;
		this.highLife = highLife;
		this.observacao = observacao;
	}

	public Receitas(Long id, Client cliente, User user, LocalDate dataCadastro, LocalDate dataEntrega,
			BigDecimal longeOdEsf, BigDecimal longeOdCil, BigDecimal longeOdEixo, BigDecimal longeOdDnp,
			BigDecimal longeOdDp, BigDecimal longeOeEsf, BigDecimal longeOeCil, BigDecimal longeOeEixo,
			BigDecimal longeOeDnp, BigDecimal longeOeDp, BigDecimal pertoOdEsf, BigDecimal pertoOdCil,
			BigDecimal pertoOdEixo, BigDecimal pertoOdDnp, BigDecimal pertoOdDp, BigDecimal pertoOeEsf,
			BigDecimal pertoOeCil, BigDecimal pertoOeEixo, BigDecimal pertoOeDnp, BigDecimal pertoOeDp,
			String descricaoLente, String corLente, Boolean resina, Boolean cristal, Boolean highLife,
			String observacao, LocalDate dataAlteracao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.user = user;
		this.dataCadastro = dataCadastro;
		this.dataEntrega = dataEntrega;
		this.longeOdEsf = longeOdEsf;
		this.longeOdCil = longeOdCil;
		this.longeOdEixo = longeOdEixo;
		this.longeOdDnp = longeOdDnp;
		this.longeOdDp = longeOdDp;
		this.longeOeEsf = longeOeEsf;
		this.longeOeCil = longeOeCil;
		this.longeOeEixo = longeOeEixo;
		this.longeOeDnp = longeOeDnp;
		this.longeOeDp = longeOeDp;
		this.pertoOdEsf = pertoOdEsf;
		this.pertoOdCil = pertoOdCil;
		this.pertoOdEixo = pertoOdEixo;
		this.pertoOdDnp = pertoOdDnp;
		this.pertoOdDp = pertoOdDp;
		this.pertoOeEsf = pertoOeEsf;
		this.pertoOeCil = pertoOeCil;
		this.pertoOeEixo = pertoOeEixo;
		this.pertoOeDnp = pertoOeDnp;
		this.pertoOeDp = pertoOeDp;
		this.descricaoLente = descricaoLente;
		this.corLente = corLente;
		this.resina = resina;
		this.cristal = cristal;
		this.highLife = highLife;
		this.observacao = observacao;
		this.dataAlteracao = dataAlteracao;
	}

	public Receitas(Long id, Client cliente, User user, LocalDate dataCadastro, LocalDate dataEntrega, LocalDate dataAlteracao,
			BigDecimal longeOdEsf, BigDecimal longeOdCil, BigDecimal longeOdEixo, BigDecimal longeOdDnp,
			BigDecimal longeOdDp, BigDecimal longeOeEsf, BigDecimal longeOeCil, BigDecimal longeOeEixo,
			BigDecimal longeOeDnp, BigDecimal longeOeDp, BigDecimal pertoOdEsf, BigDecimal pertoOdCil,
			BigDecimal pertoOdEixo, BigDecimal pertoOdDnp, BigDecimal pertoOdDp, BigDecimal pertoOeEsf,
			BigDecimal pertoOeCil, BigDecimal pertoOeEixo, BigDecimal pertoOeDnp, BigDecimal pertoOeDp,
			String descricaoLente, String corLente, Boolean resina, Boolean cristal, Boolean highLife,
			String observacao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.user = user;
		this.dataCadastro = dataCadastro;
		this.dataEntrega = dataEntrega;
		this.dataAlteracao = dataAlteracao;
		this.longeOdEsf = longeOdEsf;
		this.longeOdCil = longeOdCil;
		this.longeOdEixo = longeOdEixo;
		this.longeOdDnp = longeOdDnp;
		this.longeOdDp = longeOdDp;
		this.longeOeEsf = longeOeEsf;
		this.longeOeCil = longeOeCil;
		this.longeOeEixo = longeOeEixo;
		this.longeOeDnp = longeOeDnp;
		this.longeOeDp = longeOeDp;
		this.pertoOdEsf = pertoOdEsf;
		this.pertoOdCil = pertoOdCil;
		this.pertoOdEixo = pertoOdEixo;
		this.pertoOdDnp = pertoOdDnp;
		this.pertoOdDp = pertoOdDp;
		this.pertoOeEsf = pertoOeEsf;
		this.pertoOeCil = pertoOeCil;
		this.pertoOeEixo = pertoOeEixo;
		this.pertoOeDnp = pertoOeDnp;
		this.pertoOeDp = pertoOeDp;
		this.descricaoLente = descricaoLente;
		this.corLente = corLente;
		this.resina = resina;
		this.cristal = cristal;
		this.highLife = highLife;
		this.observacao = observacao;		
	}
	
	
	
	
	

}
