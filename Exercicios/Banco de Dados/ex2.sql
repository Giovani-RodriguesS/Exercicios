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
	professor varchar(100),
	id_curso int,
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES cursos(id_curso)	
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


INSERT INTO turmas (professor, id_curso) 
VALUES 
('Carlos Santos', 1),
('Juliana Almeida', 2),
('André Oliveira', 3),
('Patrícia Silva', 4),
('Tiago Fernandes', 5),
('Renata Costa', 6),
('Rodrigo Pereira', 7),
('Camila Rodrigues', 8),
('Lucas Martins', 9),
('Bruna Souza', 10)

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
(10,1),
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
