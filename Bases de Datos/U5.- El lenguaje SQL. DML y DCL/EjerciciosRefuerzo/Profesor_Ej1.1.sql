-- 1. Obtén el nombre de los clientes que han realizado pedidos después del 01/01/2023.
SELECT p.idCliente, c.nombre, c.apellido,
COUNT(*) as total_pedidos
FROM pedidos p
JOIN clientes c ON p.idCliente = c.idCliente
WHERE fecha >= "2023-01-01"
GROUP BY idCliente;