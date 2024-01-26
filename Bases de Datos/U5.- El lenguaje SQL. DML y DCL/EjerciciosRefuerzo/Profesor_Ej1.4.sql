-- 4. Muestra la cantidad de productos vendidos en cada pedido.

SELECT idPedido,
SUM(cantidad) as cantidad_total
FROM lineas_pedidos
group by idPedido
ORDER BY cantidad_total DESC