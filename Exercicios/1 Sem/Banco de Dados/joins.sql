SELECT * FROM CLIENTS
SELECT * FROM products

SELECT firstname, productname FROM clients INNER JOIN products
USING (idclient) WHERE category = 'eletronicos'

SELECT firstname FROM clients LEFT JOIN products --
USING(idclient) WHERE idproduct IS null

SELECT productname FROM products -- consulta produtos não comprados
WHERE idclient IS null

SELECT firstname, productname FROM products INNER JOIN clients 
USING (idclient)
WHERE idclient = (SELECT idclient FROM clients WHERE firstname = 'Rodrigo')

SELECT firstname, productname FROM products INNER JOIN clients 
USING (idclient)
WHERE brand = 'dell'

