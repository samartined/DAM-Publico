-- 3. Obtén el total de ventas (suma de los totales de los pedidos) para cada cliente.

SELECT c.idCliente, c.nombre as nombre_cliente, c.apellido as apellido,
SUM(p.total) as total_ventas
FROM clientes c
JOIN pedidos p ON c.idCliente = p.idPedido
GROUP BY c.idCliente, c.nombre
ORDER BY total_ventas DESC;
