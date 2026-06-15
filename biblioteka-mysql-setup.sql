-- MySQL setup for Biblioteka project
-- Run this file with: mysql -u root -p < biblioteka-mysql-setup.sql

CREATE DATABASE IF NOT EXISTS biblioteka
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_unicode_ci;

USE biblioteka;

CREATE TABLE IF NOT EXISTS usuarios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  email VARCHAR(255),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS livros (
  id BIGINT NOT NULL AUTO_INCREMENT,
  autor_nome VARCHAR(255),
  preco_valor DECIMAL(38,2),
  titulo_nome VARCHAR(255),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Sample data
INSERT INTO usuarios (nome, email) VALUES
('Administrador', 'admin@biblioteka.com');

INSERT INTO livros (autor_nome, preco_valor, titulo_nome) VALUES
('Exemplo Autor', 49.90, 'Livro Exemplo');
