-- Cross Join
SELECT * FROM clients, products

-- Inner Join (relaciona PK/FK)
SELECT firstname, productname FROM clients INNER JOIN products
ON clients.idclient = products.idclient
WHERE firstname = 'Rodrigo'

SELECT * FROM clients INNER JOIN products
USING (idclient)

SELECT * FROM clients
NATURAL INNER JOIN products