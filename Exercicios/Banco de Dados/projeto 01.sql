
--Criando tabelas

-- tabela aluno
CREATE TABLE aluno (
	cpf SERIAL PRIMARY KEY,
	nome varchar(100),
	idade int,
	formado bool
)

-- tabela endereco
CREATE TABLE endereco (
	id_endereco SERIAL PRIMARY KEY,
	logradouro varchar(80),
	cidade varchar(80),
	numero int,
	cpf int UNIQUE,
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)	
)
-- tabela contato
CREATE TABLE contato(
	id_contato SERIAL PRIMARY KEY,
	contato varchar(100),
	cpf int,
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)
)
-- tabela departamento
CREATE TABLE departamento (
	id_depart SERIAL PRIMARY KEY,
	area varchar(60),
	responsavel varchar(60)
)
	
-- tabela curso
CREATE TABLE curso (
	id_curso SERIAL PRIMARY KEY,
	nome varchar(80),
	id_depart int,
	CONSTRAINT fk_depart FOREIGN KEY (id_depart) REFERENCES departamento(id_depart)

)
-- tabela aluno_curso
CREATE TABLE aluno_curso (
	RA SERIAL PRIMARY KEY,
	cpf int,
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf),
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES curso(id_curso)

)
-- tabela disciplina
CREATE TABLE disciplina(
	id_disciplina SERIAL PRIMARY KEY,
	nome varchar(80),
	obrigatorio bool
)
-- tabela disciplina_curso
CREATE TABLE disciplina_curso(
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES curso(id_curso),
	id_disciplina int,
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
)

-- tabela aluno_disciplina
CREATE TABLE aluno_disciplina(
	id_disciplina int,
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina),
	cpf int,
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)
)
