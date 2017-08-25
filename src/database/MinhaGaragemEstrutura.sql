
# Apagar o banco de dados
DROP DATABASE IF EXISTS minha_garagem;

# Criar o banco de dados
CREATE DATABASE IF NOT EXISTS minha_garagem;

USE minha_garagem;
DROP TABLE IF EXISTS carros;
CREATE TABLE IF NOT EXISTS carros (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(255),
    placa VARCHAR(8),
    chassi VARCHAR(50),
    quilometragem FLOAT,
    potencia FLOAT,
    data_compra DATE,
    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,
    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,
    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,
    renavam INT,
    descricao TEXT
);

DROP TABLE IF EXISTS categorias;
CREATE TABLE IF NOT EXISTS categorias(
 id INTEGER PRIMARY KEY AUTO_INCREMENT,
 nome VARCHAR(150) UNIQUE NOT NULL, # não permite ser vazio e é único
 descricao TEXT,
 ativo BOOLEAN DEFAULT TRUE # vai conter o valor de false caso não for passado nada no INSERT
);


CREATE TABLE IF NOT EXISTS avioes(
id INTEGER PRIMARY KEY AUTO_INCREMENT,

id_categoria INTEGER NOT NULL,
FOREIGN KEY (id_categoria) REFERENCES categorias(id)

nome VARCHAR(100) NOT NULL UNIQUE

);

INSERT INTO categorias (nome) VALUES
("Baixa"),
("Média"),
("Alta");

INSERT INTO avioes (id_categoria, nome) VALUES
(1, "Tecoteco"),
(2, "Air Bus A320"),
(3, "Air Bus 777"),
(4, "Air Bus 747");



