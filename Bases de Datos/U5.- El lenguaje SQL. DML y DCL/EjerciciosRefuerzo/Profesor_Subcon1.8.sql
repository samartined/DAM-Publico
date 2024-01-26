-- 8. Encuentra el nombre de la categoría con la menor cantidad de productos.
USE pedidos;

SELECT 
    id, nombreCategoria, cantidadProductos
FROM
    (SELECT 
        c.idCategoria AS id,
            c.nombre AS nombreCategoria,
            (SELECT 
                    COUNT(*)
                FROM
                    productos p
                WHERE
                    p.idCategoria = c.idCategoria) AS cantidadProductos
    FROM
        categorias c) subconsulta
WHERE
    cantidadProductos = (SELECT 
            MIN(totalProductos)
        FROM
            (SELECT 
                COUNT(*) AS totalProductos
            FROM
                productos
            GROUP BY idCategoria) subconsulta2);
