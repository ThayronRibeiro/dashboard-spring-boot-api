package com.example.dashboard.rest;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.dashboard.model.Client;
import com.example.dashboard.model.Receitas;
import com.example.dashboard.model.User;

public class ReceitaFormRequest {

	
	private Long id;
	private Client cliente;
	private User usuario;
	private LocalDate dataCadastro;
	private LocalDate dataEntrega;
	private LocalDate ultimaAlteracao;
	private BigDecimal longeOdEsf;
	private BigDecimal longeOdCil;
	private BigDecimal longeOdEixo;
	private BigDecimal longeOdDnp;
	private BigDecimal longeOdDp;
	private BigDecimal longeOeEsf;
	private BigDecimal longeOeCil;
	private BigDecimal longeOeEixo;
	private BigDecimal longeOeDnp;
	private BigDecimal longeOeDp;
	private BigDecimal pertoOdEsf;
	private BigDecimal pertoOdCil;
	private BigDecimal pertoOdEixo;
	private BigDecimal pertoOdDnp;
	private BigDecimal pertoOdDp;
	private BigDecimal pertoOeEsf;
	private BigDecimal pertoOeCil;
	private BigDecimal pertoOeEixo;
	private BigDecimal pertoOeDnp;
	private BigDecimal pertoOeDp;
	private String descricaoLente;
	private String corLente;
	private Boolean resina;
	private Boolean cristal;
	private Boolean highLife;
	private String observacao;
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
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
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
	public LocalDate getUltimaAlteracao() {
		return ultimaAlteracao;
	}
	public void setUltimaAlteracao(LocalDate ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
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
	public ReceitaFormRequest() {
		super();
	}
	public ReceitaFormRequest(Long id, Client cliente, User usuario, LocalDate dataCadastro, LocalDate dataEntrega, LocalDate ultimaAlteracao,
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
		this.usuario = usuario;
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
	public ReceitaFormRequest(Client cliente, User usuario, LocalDate dataCadastro, LocalDate dataEntrega, LocalDate ultimaAlteracao,
			BigDecimal longeOdEsf, BigDecimal longeOdCil, BigDecimal longeOdEixo, BigDecimal longeOdDnp,
			BigDecimal longeOdDp, BigDecimal longeOeEsf, BigDecimal longeOeCil, BigDecimal longeOeEixo,
			BigDecimal longeOeDnp, BigDecimal longeOeDp, BigDecimal pertoOdEsf, BigDecimal pertoOdCil,
			BigDecimal pertoOdEixo, BigDecimal pertoOdDnp, BigDecimal pertoOdDp, BigDecimal pertoOeEsf,
			BigDecimal pertoOeCil, BigDecimal pertoOeEixo, BigDecimal pertoOeDnp, BigDecimal pertoOeDp,
			String descricaoLente, String corLente, Boolean resina, Boolean cristal, Boolean highLife,
			String observacao) {
		super();
		this.cliente = cliente;
		this.usuario = usuario;
		this.dataCadastro = dataCadastro;
		this.dataEntrega = dataEntrega;
		this.ultimaAlteracao = ultimaAlteracao;
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
	
	public Receitas toModel() {
		return new Receitas(id, cliente, usuario, dataCadastro, dataEntrega, ultimaAlteracao, longeOdEsf, longeOdCil, longeOdEixo,
				longeOdDnp, longeOdDp, longeOeEsf, longeOeCil, longeOeEixo, longeOeDnp, longeOeDp,pertoOdEsf,
				pertoOdCil, pertoOdEixo, pertoOdDnp, pertoOdDp,pertoOeEsf, pertoOeCil, pertoOeEixo,pertoOeDnp, pertoOeDp,
				descricaoLente,corLente,resina,cristal, highLife, observacao);
	}
	
	public static ReceitaFormRequest fromModel(Receitas receita) {
		return new ReceitaFormRequest(receita.getId(), receita.getCliente(), receita.getUser(), receita.getDataCadastro(), receita.getDataEntrega(), receita.getDataAlteracao(), receita.getLongeOdEsf(), receita.getLongeOdCil(), receita.getLongeOdEixo(),
				receita.getLongeOdDnp(), receita.getLongeOdDp(), receita.getLongeOeEsf(), receita.getLongeOeCil(), 
				receita.getLongeOeEixo(), receita.getLongeOeDnp(), receita.getLongeOeDp(),receita.getPertoOdEsf(),
				receita.getPertoOdCil(), receita.getPertoOdEixo(), receita.getPertoOdDnp(), receita.getPertoOdDp(),
				receita.getPertoOeEsf(), receita.getPertoOeCil(), receita.getPertoOeEixo(),receita.getPertoOeDnp(), 
				receita.getPertoOeDp(),receita.getDescricaoLente(),receita.getCorLente(),receita.getResina(),
				receita.getCristal(), receita.getHighLife(), receita.getObservacao()); 
	}
	
	
}
