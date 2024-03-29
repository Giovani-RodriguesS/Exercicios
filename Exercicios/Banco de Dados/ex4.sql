SELECT * FROM pacientes
SELECT * FROM medicos
SELECT * FROM registro_medico

CREATE TABLE pacientes (
	id_paciente SERIAL PRIMARY KEY,
	nome varchar(100),
	data_nascimento date
)

CREATE TABLE medicos (
	id_medico SERIAL PRIMARY KEY,
	nome varchar(100),
	especializacao varchar(100)
	)
CREATE TABLE registro_medico (
	id_registro SERIAL PRIMARY KEY,
	data date,
	id_paciente int,
	CONSTRAINT fk_paciente FOREIGN KEY (id_paciente) REFERENCES pacientes(id_paciente),
	id_medico int,
	CONSTRAINT fk_medico FOREIGN KEY (id_medico) REFERENCES medicos(id_medico)
)
INSERT INTO pacientes (nome, data_nascimento)
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

INSERT INTO medicos (nome, especializacao)
VALUES
('Dra. Lívia', 'Pediatria' ),
('Dr. Miguel', 'Cirurgia Bariátrica' ),
('Dra. Maria', 'Cardiologia' ),
('Dr. Alexander Fleming', 'Psiquiatria' ),
('Dr. Drauzio Varella', 'Psiquiatria' ),
('Dr. Carlos Chagas', 'Oftalmologia' ),
('Dra. Patrícia Era Bath', 'Ortopedia' ),
('Dr. Oswaldo Cruz', 'Oftalmologia' ),
('Dra. Zilda Arns', 'Pediatria' ),
('Dr. José Eduardo Souza', 'Anestesiologia' )

INSERT INTO registro_medico (data, id_paciente, id_medico)
VALUES 
('2040-12-11',1,2),
('2040-01-21',1,3),
('2040-08-04',2,1),
('2040-09-12',3,4),
('2040-04-24',4,5),
('2040-07-01',5,6),
('2040-01-08',6,6),
('2040-12-12',7,7),
('2040-11-13',8,9),
('2040-10-03',9,8),
('2040-04-06',10,10),
('2040-01-06',5,5)


SELECT * FROM pacientes
SELECT * FROM medicos
SELECT * FROM registro_medico

--a. Listar todos os pacientes de um médico específico.
SELECT pacientes.nome FROM pacientes NATURAL INNER JOIN registro_medico
WHERE  id_medico = (SELECT id_medico FROM medicos WHERE nome = 'Dra. Lívia')

--b. Encontrar todos os médicos de um paciente específico.
SELECT medicos.nome FROM medicos NATURAL INNER JOIN registro_medico
WHERE  id_paciente = (SELECT id_paciente FROM pacientes WHERE nome = 'Valéria')

--c. Contar o número médio de pacientes por médico.

