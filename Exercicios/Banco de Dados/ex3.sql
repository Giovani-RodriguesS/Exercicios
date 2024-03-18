CREATE TABLE funcionarios (
	id_func SERIAL PRIMARY KEY,
	nome_func varchar(100),
	data_admissao date
)
SELECT * FROM funcionarios_projetos

CREATE TABLE projetos (
	id_projeto SERIAL PRIMARY KEY,
	nome_projeto varchar(200),
	descricao text
)


CREATE TABLE funcionarios_projetos (
	id_func int,
	CONSTRAINT fk_func FOREIGN KEY (id_func) REFERENCES funcionarios(id_func),
	id_projeto int,
	CONSTRAINT fk_proj FOREIGN KEY (id_projeto) REFERENCES projetos(id_projeto)	
)