-- 18.	Calcula el total gastado en cada categoría de productos por todos los clientes.

SELECT 
    c.nombre AS nombreCategoria, SUM(l.total) AS totalVentas
FROM
    categorias c
        JOIN
    productos p ON c.idCategoria = p.idCategoria
        JOIN
    lineas_pedidos l ON l.idProducto = p.idProducto
GROUP BY nombreCategoria