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
	CONSTRAINT cliente_pkey PRIMARY KEY (id),
	CONSTRAINT usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);