-- 10.	Obtén el total de pedidos por cada cliente.

SELECT p.idCliente, c.nombre, c.apellido,
COUNT(*) AS total_pedidos
FROM pedidos p
JOIN clientes c ON p.idCliente = c.idCliente
GROUP BY idCliente;