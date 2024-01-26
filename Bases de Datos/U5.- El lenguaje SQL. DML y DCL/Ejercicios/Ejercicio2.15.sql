-- 15.	Muestra el número de productos por categoría y su precio promedio, pero solo para las categorías con 2 o más productos.

SELECT 
    id, nombreCategoria, precioPromedio
FROM
    (SELECT 
        c.idCategoria AS id,
            c.nombre AS nombreCategoria,
            (SELECT 
                    AVG(precio)
                FROM
                    productos p
                WHERE
                    p.idCategoria = c.idCategoria) AS precioPromedio
    FROM
        categorias c) subconsulta;