-- 17.	Encuentra los tres productos más vendidos (asumiendo la cantidad total de cada línea de pedidos).

SELECT 
    p.idProducto, p.nombre, SUM(total) AS totalVendido
FROM
    productos p
        JOIN
    lineas_pedidos l ON l.idProducto = p.idProducto
GROUP BY idProducto
ORDER BY totalVendido DESC
LIMIT 3;