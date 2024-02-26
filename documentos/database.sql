CREATE DATABASE db;

CREATE TABLE usuario (
	id bigserial NOT NULL,
	usuario varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	nome varchar(255) NULL,
	data_cadastro date NULL,
	CONSTRAINT usuario_constraint UNIQUE (usuario),
	CONSTRAINT usuario_pkey PRIMARY KEY (id)
);

CREATE TABLE cliente (
	id bigserial NOT NULL,
	nome varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	usuario_id int4 NULL,
	data_cadastro date NULL,
	ultima_alteracao date NULL,
	CONSTRAINT cliente_pkey PRIMARY KEY (id),
	CONSTRAINT usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE receita (
	id bigserial NOT NULL,
	data_cadastro date NULL,
	data_entrega date NULL,
	usuario_id int4 NOT NULL,
	cliente_id int4 NOT NULL,
	ultima_alteracao date NULL,
	longe_od_esf numeric(12,4),
	longe_od_cil numeric(12,4),
	longe_od_eixo numeric(12,4),
	longe_od_dnp numeric(12,4),
	longe_od_dp numeric(12,4),
	longe_oe_esf numeric(12,4),
	longe_oe_cil numeric(12,4),
	longe_oe_eixo numeric(12,4),
	longe_oe_dnp numeric(12,4),
	longe_oe_dp numeric(12,4),
	perto_od_esf numeric(12,4),
	perto_od_cil numeric(12,4),
	perto_od_eixo numeric(12,4),
	perto_od_dnp numeric(12,4),
	perto_od_dp numeric(12,4),
	perto_oe_esf numeric(12,4),
	perto_oe_cil numeric(12,4),
	perto_oe_eixo numeric(12,4),
	perto_oe_dnp numeric(12,4),
	perto_oe_dp numeric(12,4),
	descricao_lente character varying(80),
	cor_lente character varying(15),
	resina boolean,
	cristal boolean,
	high_life boolean,
	observacao character varying(120),
	CONSTRAINT receita_pkey PRIMARY KEY (id),
	CONSTRAINT usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id),
	CONSTRAINT cliente_id FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);