CREATE DATABASE Clinica;

USE Clinica;

CREATE TABLE Endereco(
	id_Endereco INTEGER NOT NULL AUTO_INCREMENT,
	cep VARCHAR(9) NOT NULL,
	Rua VARCHAR(80) NOT NULL,
	Bairro VARCHAR(90) NOT NULL,
	Cidade VARCHAR(100) NOT NULL,
	Complemento VARCHAR(255) NOT NULL,
	Referencia VARCHAR(255) NOT NULL,
	Numero INTEGER NOT NULL,
	PRIMARY KEY(id_Endereco));

CREATE TABLE Cliente(
	id_Cliente INTEGER NOT NULL,
	Nome VARCHAR(80) NOT NULL,
	cpf VARCHAR(14) NOT NULL,
	rg VARCHAR(13) NOT NULL,
	telefone VARCHAR(14) NOT NULL,
	celular VARCHAR(14) NOT NULL,
	tipo_sanguineo VARCHAR(2) NOT NULL,
	idade INTEGER NOT NULL,
	dataNascimento DATE NOT NULL,
	alergias VARCHAR(255) NOT NULL,
	observacoes VARCHAR(255) NOT NULL,
	id_Endereco INTEGER,
	CONSTRAINT FOREIGN KEY(id_Endereco) REFERENCES Endereco(id_Endereco),
	PRIMARY KEY(id_Cliente));	

CREATE TABLE Medico(
	matricula INTEGER NOT NULL,
	nome VARCHAR(80) NOT NULL,
	telefone VARCHAR(14) NOT NULL,
	dataNascimento DATE NOT NULL,
	idade INTEGER NOT NULL,
	formacao VARCHAR(42) NOT NULL,
	areaAtuacao VARCHAR(42) NOT NULL,
	PRIMARY KEY(matricula));
	
CREATE TABLE Consulta(
	id INTEGER NOT NULL,
	medico INTEGER NOT NULL,
	cliente INTEGER NOT NULL,
	dataConsulta DATE NOT NULL,
	listaMedicamentos VARCHAR(255) NOT NULL,
	observacoes VARCHAR(255) NOT NULL,
	PRIMARY KEY(id));