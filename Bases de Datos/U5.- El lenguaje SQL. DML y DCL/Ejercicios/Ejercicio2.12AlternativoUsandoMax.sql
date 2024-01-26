SELECT idCliente, COUNT(*) AS total_pedidos
FROM PEDIDOS
GROUP BY idCliente
HAVING COUNT(*) = (SELECT MAX(total_pedidos) FROM (SELECT COUNT(*) AS total_pedidos FROM PEDIDOS GROUP BY idCliente) AS subquery);
