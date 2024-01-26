-- 12.	Encuentra el cliente que ha realizado más pedidos.

SELECT idCliente, COUNT(*) AS total_pedidos
FROM PEDIDOS
GROUP BY idCliente
ORDER BY total_pedidos DESC
LIMIT 1;
-- No he podido resolverlo solo