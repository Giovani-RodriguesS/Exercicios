CREATE TABLE cursos (
	id_curso SERIAL PRIMARY KEY,
	nome varchar(100),
	area varchar(100)
)
SELECT * FROM cursos
SELECT * FROM turmas
SELECT * FROM alunos
SELECT * FROM aluno_turma

CREATE TABLE turmas (
	id_turma SERIAL PRIMARY KEY,
	professor varchar(100)
)

CREATE TABLE alunos (
	id_aluno SERIAL PRIMARY KEY,
	nome varchar(100),
	data_nascimento date	
)

CREATE TABLE aluno_turma (
	id_aluno int,
	CONSTRAINT fk_aluno FOREIGN KEY (id_aluno) REFERENCES alunos(id_aluno),
	id_turma int,
	CONSTRAINT fk_turma FOREIGN KEY (id_turma) REFERENCES turmas(id_turma)	
)

CREATE TABLE turma_curso (
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES cursos(id_curso),
	id_turma int,
	CONSTRAINT fk_turma FOREIGN KEY (id_turma) REFERENCES turmas(id_turma)	
)

INSERT INTO turmas (professor) 
VALUES 
('Carlos Santos'),
('Juliana Almeida'),
('André Oliveira'),
('Patrícia Silva'),
('Tiago Fernandes'),
('Renata Costa'),
('Rodrigo Pereira'),
('Camila Rodrigues'),
('Lucas Martins'),
('Bruna Souza')

INSERT INTO cursos (nome, area)
VALUES 
('Introdução à Programação', 'Ciência da Computação'),
('Marketing Digital', 'Marketing'),
('Gestão de Projetos', 'Administração'),
('Design Gráfico', 'Design'),
('Economia Financeira', 'Economia'),
('Direito Constitucional', 'Direito'),
('Biologia Molecular', 'Biologia'),
('Inglês Avançado', 'Linguística'),
('Gastronomia Italiana', 'Culinária'),
('Yoga e Meditação', 'Saúde Mental');

INSERT INTO aluno_turma (id_aluno, id_turma)
VALUES 
(10,1),
(3,8),
(6,7),
(5,10),
(1,9),
(9,2),
(8,3),
(7,4),
(6,5),
(5,6),
(4,7),
(3,7),
(2,8),
(1,8),
(1,9);

INSERT INTO turma_curso (id_curso, id_turma)
VALUES 
(10,1),
(3,7),
(6,7),
(5,10),
(1,9),
(9,2),
(8,3),
(7,4),
(6,5),
(5,6),
(4,7),
(3,8),
(2,8),
(1,8),
(1,9);

SELECT * FROM cursos
SELECT * FROM turmas
SELECT * FROM alunos
SELECT * FROM aluno_turma
SELECT * FROM turma_curso

--a. Listar todos os alunos matriculados em uma turma específica.
SELECT nome FROM alunos NATURAL INNER JOIN 
(SELECT * FROM aluno_turma NATURAL INNER JOIN turmas)
WHERE id_turma = 8
 
--b. Encontrar todos os cursos ministrados em uma turma específica.
SELECT cursos.nome FROM cursos NATURAL INNER JOIN 
(SELECT * FROM turma_curso NATURAL INNER JOIN turmas)
WHERE id_turma = 7

--c. Contar o número de alunos em cada turma.
SELECT id_turma, COUNT(id_aluno) AS Num_de_alunos FROM aluno_turma
GROUP BY id_turma ORDER BY Num_de_alunos DESC
