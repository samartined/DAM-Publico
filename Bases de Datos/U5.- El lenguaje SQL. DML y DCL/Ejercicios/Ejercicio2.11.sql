-- 11.	Encuentra el precio promedio de los productos por categoría.

SELECT p.idCategoria, c.nombre,
AVG(p.precio) AS average_precio
FROM productos p
JOIN categorias c ON p.idCategoria = c.idCategoria
GROUP BY idCategoria
order by idCategoria;