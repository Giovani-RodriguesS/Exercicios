CREATE TABLE funcionarios (
	id_func SERIAL PRIMARY KEY,
	nome varchar(100),
	admissao date,
	cargo varchar(50)
	gerencia boolean
	id_depart int,
	CONSTRAINT fk_depart FOREIGN KEY (id_depart) REFERENCES departamentos(id_depart)
)
CREATE TABLE departamentos (
	id_depart SERIAL PRIMARY KEY,
	nome varchar(100),
	gerente varchar(100)
)
