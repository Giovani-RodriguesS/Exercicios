
--Criando tabelas

-- tabela aluno
CREATE TABLE aluno (
	cpf varchar(14) PRIMARY KEY,
	nome varchar(100),
	idade int,
	formado bool,
	logradouro varchar(70),
	cidade varchar(50),
	numero int
)
-- inserir dados na tabela aluno
INSERT INTO aluno (cpf,nome, idade, formado, logradouro, cidade, numero) 
VALUES 
('555.555.555-55','João', 25, false, 'Rua das Flores', 'São Paulo', 123),
('555.000.555-00','Maria', 22, true, 'Avenida Principal', 'Rio de Janeiro', 456),
('555.555.000-99','Pedro', 20, false, 'Rua da Paz', 'Belo Horizonte', 789),
('777.445.125-55','Ana', 23, true, 'Rua do Campo', 'Brasília', 101),
('456.341.500-01','Mariana', 24, true, 'Avenida Central', 'Salvador', 111);

SELECT * FROM ALUNO

-- tabela contato
CREATE TABLE contato(
	id_contato SERIAL PRIMARY KEY,
	contato varchar(100),
	cpf varchar(14),
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)
)
-- inserir dados na tabela contato
INSERT INTO contato (contato, cpf) 
VALUES 
('joao@gmail.com', '555.555.555-55'),
('maria@hotmail.com', '555.000.555-00'),
('pedro@yahoo.com', '555.555.000-99'),
('ana@gmail.com', '777.445.125-55'),
('15-99234-2301', '777.445.125-55'),
('11-991498253', '555.555.000-99'),
('mariana@hotmail.com', '456.341.500-01');

SELECT * FROM contato


-- tabela departamento
CREATE TABLE departamento (
	id_depart SERIAL PRIMARY KEY,
	area varchar(60),
	responsavel varchar(60)
)

-- inserir dados na tabela departamento
INSERT INTO departamento (area, responsavel) 
VALUES 
('Saúde', 'Cainan'),
('Tecnologia', 'André'),
('Engenharia', 'Gabriel'),
('Humanas', 'Ariane');

SELECT * FROM departamento

-- tabela curso
CREATE TABLE curso (
	id_curso SERIAL PRIMARY KEY,
	nome varchar(80),
	id_depart int,
	CONSTRAINT fk_depart FOREIGN KEY (id_depart) REFERENCES departamento(id_depart)

)
-- inserir dados em curso
INSERT INTO curso (nome, id_depart) 
VALUES 
('Ciência da Computação', 2),
('Engenharia Elétrica', 3),
('Ciências Humanas', 4),
('Medicina', 1),
('Análise e Desenvolvimento de Sistemas', 2);

SELECT * FROM curso
-----------------------
-- tabela aluno_curso
CREATE TABLE aluno_curso (
	RA SERIAL PRIMARY KEY,
	cpf varchar(14),
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf),
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES curso(id_curso)

)
-------------------------

-- tabela disciplina
CREATE TABLE disciplina(
	id_disciplina SERIAL PRIMARY KEY,
	nome varchar(80),
	obrigatorio bool
)
-- inserir na tabela disciplina
INSERT INTO disciplina (nome, obrigatorio) 
VALUES 
('Álgebra', true),
('Anatomia', true),
('História', false),
('Programação', true),
('Algoritmos', true),
('Matemática', true),
('Empreendedorismo', false),
('Sustentabilidade', false),
('Filosofia', false);

SELECT * FROM DISCIPLINA

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
	cpf varchar(14),
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)
)
