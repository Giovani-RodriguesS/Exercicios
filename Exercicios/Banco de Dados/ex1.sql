CREATE TABLE livros (
	id_livro SERIAL PRIMARY KEY,
	titulo varchar(100),
	isbn varchar(30),
	editora varchar(200),
	ano integer
)
SELECT * FROM livros_autores

CREATE TABLE autores (
	id_autor SERIAL PRIMARY KEY,
	nome varchar(100),
	idade integer
)


CREATE TABLE livros_autores (
	id_autor int,
	CONSTRAINT fk_autor FOREIGN KEY (id_autor) REFERENCES autores(id_autor),
	id_livro int,
	CONSTRAINT fk_livro FOREIGN KEY (id_livro) REFERENCES livros(id_livro)	
)

ALTER TABLE livros (titulo, isbn, editora, ano) 
VALUES 
('Cem Anos de Solidão', 978-3-16-148410-0,'Editora Companhia das Letras' ,2002
),
('1984', 285-3-45-148410-0, 'Editora Record', 1984
),
('O Apanhador no Campo de Centeio', 300-3-16-123563-0, 'Editora Companhia das Letras', 1987
),
('Dom Quixote"', 345-3-16-453864-0,'Editora Intrínseca', 1608
),
('O Senhor dos Anéis', 937-3-44-148410-0,'Editora Record', 1945
),
('Crime e Castigo', 400-3-20-148410-9, 'Editora Globo', 2006
),
('Orgulho e Preconceito', 800-3-77-148410-0,'Editora Intrínseca',1870
),
('O Sol é para Todos', 878-3-16-999086-0,'Editora Globo',2008
),
('A Revolução dos Bichos',718-4-10-148410-9,'Editora Rocco',1987
),
('O Pequeno Príncipe',908-3-06-346871-0,'Editora Rocco', 1980
 )
insert into autores (nome, idade) 
VALUES ('Gabriel García Márquez',39),
('George Orwell',59),
('Miguel de Cervantes',27),
('Jane Austen',45),
('Santo Agostinho',34),
('J.D. Salinger',49),
('J.R.R. Tolkien',50),
('Antoine de Saint-Exupéry',51),
('Fiódor Dostoiévski',53),
('Harper Lee',60)

insert into livros_autores (id_autor, id_livro)
VALUES (1,7),
(2,6),
(3,5),
(4,4),
(5,5),
(6,3),
(7,2),
(8,1),
(9,1),
(10,3),

(1,3),
(2,4),
(3,5),
(4,6),
(5,7),
(6,1),
(7,2),
(8,3),
(9,4),
(10,9)

SELECT * FROM livros
SELECT * FROM livros_autores
SELECT * FROM autores

--a. Listar todos os livros e seus autores.
SELECT titulo, nome FROM (SELECT * FROM autores NATURAL INNER JOIN livros_autores)
NATURAL INNER JOIN livros 

--b. Encontrar todos os livros escritos por um autor específico.
SELECT titulo FROM (SELECT * FROM livros NATURAL INNER JOIN livros_autores)
NATURAL INNER JOIN autores
WHERE nome = 'George Orwell'
--c. Encontrar todos os autores que escreveram um livro específico.
SELECT nome FROM (SELECT * FROM livros NATURAL INNER JOIN livros_autores)
NATURAL INNER JOIN autores
WHERE titulo = 'Cem Anos de Solidão'