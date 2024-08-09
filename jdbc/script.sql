CREATE SCHEMA jdbcdb;

CREATE TABLE jdbcdb.pessoas (
	id_pessoa INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(65) NOT NULL,
    profissao VARCHAR(45) NOT NULL,
    data_nascimento DATE NOT NULL,
    PRIMARY KEY(id_pessoa));
