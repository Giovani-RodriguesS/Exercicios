CREATE TABLE funcionarios (
	id_func SERIAL PRIMARY KEY,
	nome varchar(100),
	admissao date,
	cargo varchar(50),
	id_depart int,
	CONSTRAINT fk_depart FOREIGN KEY (id_depart) REFERENCES departamentos(id_depart)
)

CREATE TABLE departamentos (
	id_depart SERIAL PRIMARY KEY,
	nome varchar(100),
	gerente varchar(100)
)

INSERT INTO departamentos (nome, gerente)
VALUES ('Recursos Humanos','Valéria'),
		('Manutenção', 'Rodrigo'),
		('Tecnologia da Informação', 'Giovani'),
		('Suporte', 'Vitória' ),
		('Marketing', 'Laís' ),
		('Comercial', 'Luciana' ),
		('Logistica', 'Bruno' )
		
INSERT INTO funcionarios (nome, admissao, cargo, id_depart)
VALUES ('Gabriel', '2023-08-02','Devops',3),
('Vitória', '2010-11-01','Gerente',4),
('João', '2022-10-03','Analista Técnico',4 ),
('Giovani', '2010-02-01','Gerente',3),
('Rodrigo', '2020-02-01','Gerente',2 ),
('Bruno', '2015-12-01' ,'Gerente',7),
('Tomas', '2017-12-30','Mecânico',2 ),
('Luciana', '2015-12-19','Gerente',6 ),
('Laís', '2020-02-01','Gerente',5 ),
('Caio', '2022-08-09','Operador Logístico',7),
('Lucas', '2020-08-19','Administador',1),
('Luana', '2020-12-02','Assistente',5),
('Maria', '2021-08-09','Secretária',6),
('Valéria','2012-01-12', 'Gerente',1)
INSERT INTO funcionarios (nome, admissao, cargo, id_depart)
VALUES('Marcos','2022-01-12', 'Ajudante',1)
	
	
SELECT * FROM departamentos
SELECT * FROM funcionarios

--a. Listar todos os funcionários de um departamento específico.
SELECT funcionarios.nome FROM funcionarios LEFT JOIN departamentos USING(id_depart)
WHERE departamentos.nome = 'Recursos Humanos'

--b. Encontrar o departamento em que um funcionário específico trabalha.
SELECT departamentos.nome, funcionarios.nome FROM departamentos 
LEFT JOIN funcionarios USING (id_depart)
WHERE funcionarios.nome = 'Giovani'
--c. Calcular o número total de funcionários gerenciados por cada gerente.
SELECT gerente, AVG(subordinados) FROM -- Media(total) de func por gerente 
(SELECT id_depart, COUNT(id_func) AS subordinados FROM funcionarios 
WHERE cargo != 'Gerente' GROUP BY id_depart) -- total de func nao gerentes por setor 
NATURAL INNER JOIN departamentos
GROUP BY gerente 