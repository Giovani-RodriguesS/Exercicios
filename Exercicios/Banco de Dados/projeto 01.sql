
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
-- inserir na tabela disciplina_curso
INSERT INTO disciplina_curso (id_curso, id_disciplina) 
VALUES (1,1),(1,4),(1,5),
(1,6),(2,1),(2,6),
(2,7),(3,3),(3,9),
(3,8),(4,2),(4,3),
(5,4),(5,5),(5,7)

SELECT * FROM disciplina_curso


-- tabela aluno_disciplina
CREATE TABLE aluno_disciplina(
	id_disciplina int,
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina),
	cpf varchar(14),
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf)
)
-- inserir na tabela aluno_disciplina
INSERT INTO aluno_disciplina (id_disciplina, cpf) 
VALUES (1, '555.555.555-55'),
(4, '555.555.555-55'),
(5, '555.555.555-55'),
(6, '555.555.555-55'),
(2, '555.000.555-00'),
(1, '555.555.000-99'),
(6, '555.555.000-99'),
(7, '555.555.000-99'),
(2, '777.445.125-55'),
(3, '777.445.125-55'),
(8, '777.445.125-55'),
(9, '777.445.125-55'),
(3, '456.341.500-01'),
(9, '456.341.500-01')

SELECT * FROM aluno_disciplina

-- tabela aluno_curso
CREATE TABLE aluno_curso (
	RA varchar(12) PRIMARY KEY,
	cpf varchar(14),
	CONSTRAINT cpf FOREIGN KEY (cpf) REFERENCES aluno(cpf),
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
)
SELECT * FROM aluno_curso
-- inserir na tabela aluno_curso
INSERT INTO aluno_curso (RA, cpf, id_curso) 
VALUES ('1234567865x','555.555.555-55', 1),
('55310018730y','555.555.000-99', 2),
('92000615120x','555.000.555-00', 4),
('123644990800','456.341.500-01', 3),
('122231447645','777.445.125-55', 4),
('000123475321','777.445.125-55', 3),
('87653482909x','555.555.555-55', 5)


SELECT * FROM aluno
SELECT * FROM disciplina
SELECT * FROM disciplina_curso
SELECT * FROM disciplina_aluno
SELECT * FROM aluno_curso
SELECT * FROM departamento
SELECT * FROM contato
SELECT * FROM curso


-- Querys
SELECT aluno.nome, curso.nome FROM 
(SELECT * FROM aluno NATURAL INNER JOIN aluno_curso)
NATURAL INNER JOIN curso
WHERE nome = 'Pedro' 

SELECT * FROM aluno
INNER JOIN aluno_curso ON aluno.cpf = aluno_curso.cpf
INNER JOIN curso ON aluno_curso.id_curso = curso.id_curso
WHERE aluno.nome = 'Pedro';


--Dado o RA ou o Nome do Aluno, buscar no BD todos os demais dados do aluno.
--Dado o nome de um departamento, exibir o nome de todos os cursos associados a ele.
--Dado o nome de uma disciplina, exibir a qual ou quais cursos ela pertence.

--Dado o CPF de um aluno, exibir quais disciplinas ele está cursando.

--Filtrar todos os alunos matriculados em um determinado curso.
SELECT nome FROM aluno 
WHERE
--Filtrar todos os alunos matriculados em determinada disciplina.
SELECT nome AS nome_disciplina, nome_aluno FROM 
(SELECT nome AS nome_aluno 
FROM aluno NATURAL INNER JOIN aluno_disciplina 
WHERE id_disciplina = (SELECT id_disciplina FROM disciplina WHERE nome = 'Álgebra'))	
NATURAL INNER JOIN disciplina
WHERE nome = 'Álgebra'

--filtrar alunos formados
SELECT nome FROM aluno
WHERE formado = true

--filtrar alunos ativos
SELECT nome FROM aluno
WHERE formado = false

--Quantidade de alunos ativos por curso
SELECT nome AS nome_curso, aluno_ativo 
FROM (SELECT id_curso, COUNT(cpf) AS aluno_ativo FROM 
	  aluno NATURAL INNER JOIN aluno_curso WHERE formado = false GROUP BY id_curso) -- total de aluno por curso
NATURAL INNER JOIN curso

--Quantidade de alunos ativos por disciplina.
SELECT nome AS nome_disciplina, aluno_ativo 
FROM (SELECT id_disciplina, COUNT(cpf) AS aluno_ativo FROM 
	  aluno NATURAL INNER JOIN aluno_disciplina WHERE formado = false GROUP BY id_disciplina) -- total de aluno por disciplina
NATURAL INNER JOIN disciplina
