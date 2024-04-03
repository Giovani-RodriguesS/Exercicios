CREATE TABLE funcionarios (
	id_func SERIAL PRIMARY KEY,
	nome_func varchar(100),
	data_admissao date
)
SELECT * FROM funcionarios_projetos
SELECT * FROM projetos
SELECT * FROM funcionarios

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

INSERT INTO funcionarios (nome_func, data_admissao)
VALUES 
('Valéria', '2023-12-01' ),
('Gabriel', '2023-08-02' ),
('Vitória', '2020-11-01' ),
('João', '2022-10-03' ),
('Giovani', '2023-02-01' ),
('Pedro', '2020-02-01' ),
('Bruno', '2020-12-01' ),
('Tomas', '2013-12-30' ),
('Luciana', '2023-12-19' ),
('Luis', '2023-02-01' )

INSERT INTO projetos (nome_projeto, descricao)
VALUES 
('Mecânica Avançada', 'Soluções industriais' ),
('Automação', 'Soluções industriais' ),
('UrbanRevive', 'Renovando Espaços Urbanos' ),
('GreenWork', 'Floresta a salva' ),
('TechConnect', 'Conectando Comunidades Digitais' ),
('HomeGym', 'Academia caseira' ),
('HealthTrack', 'Melhorando a Saúde' ),
('GreenEdu', 'Educação Verde' ),
('EmpowerYouth','Capacitando Jovens para o Futuro' ),
('ArtForAll', 'Criatividade e a Diversidade' )

INSERT INTO funcionarios_projetos (id_func, id_projeto)
VALUES 
(1,10),
(2,9),
(3,8),
(4,7),
(5,6),
(6,5),
(7,4),
(8,3),
(9,2),
(10,1),
(2,4),
(3,2),
(3,1),
(2,1)

SELECT * FROM projetos
SELECT * FROM funcionarios
SELECT * FROM funcionarios_projetos

 --Listar todos os funcionários associados a um projeto específico.
SELECT nome_func FROM (SELECT * FROM funcionarios NATURAL INNER JOIN funcionarios_projetos)
NATURAL INNER JOIN projetos
WHERE nome_projeto = 'GreenWork'

--b. Encontrar todos os projetos em que um funcionário específico está envolvido.
SELECT nome_projeto FROM (SELECT * FROM projetos NATURAL INNER JOIN funcionarios_projetos)
NATURAL INNER JOIN funcionarios
WHERE nome_func = 'Gabriel'

--c. Calcular a média de funcionários por projeto.
SELECT nome_projeto, AVG(total_de_func) AS media_de_func --media com base no total de id_func por projeto -- 
FROM (SELECT id_projeto, COUNT(id_func) AS total_de_func FROM funcionarios_projetos 
	 GROUP BY id_projeto) NATURAL INNER JOIN projetos 
GROUP BY nome_projeto ORDER BY media_de_func DESC
