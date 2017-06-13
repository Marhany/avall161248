CREATE DATABASE JavaDag


CREATE TABLE cliente(
  id_contato INTEGER NOT NULL,
  nome VARCHAR(100),
  telefone VARCHAR(100),
  idade INTEGER
)


INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (1, 'Paulo', 46, 11657823001)
INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (2, 'Lucas', 20, 46162326523)
INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (3, 'Marcos', 51, 76049325620)
INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (4, 'William', 30, 20562462320)
INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (5, 'Carlos', 29, 84360046723)
INSERT INTO cliente (id_contato, nome, idade, telefone) VALUES (6, 'Jose', 39, 65423897410)