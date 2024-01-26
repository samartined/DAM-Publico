-- 19.	Muestra los clientes que han comprado productos de al menos tres categorías diferentes.

SELECT 
    clientes.idCliente,
    clientes.nombre,
    clientes.apellido,
    COUNT(DISTINCT productos.idCategoria) AS num_categorias
FROM
    clientes
        JOIN
    pedidos ON pedidos.idCliente = clientes.idCliente
        JOIN
    lineas_pedidos ON lineas_pedidos.idPedido = pedidos.idPedido
        JOIN
    productos ON productos.idProducto = lineas_pedidos.idProducto
GROUP BY clientes.idCliente
HAVING num_categorias >= 3;
    