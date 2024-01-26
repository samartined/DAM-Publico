-- 5. Obtén el nombre del cliente y el número de pedidos realizados por cada cliente.

SELECT c.idCliente, c.nombre, c.apellido,
COUNT(p.idPedido) as numero_pedidos
FROM clientes c
RIGHT JOIN pedidos p ON c.idCliente = p.idCliente
group by idCliente, nombre, apellido
ORDER BY numero_pedidos DESC