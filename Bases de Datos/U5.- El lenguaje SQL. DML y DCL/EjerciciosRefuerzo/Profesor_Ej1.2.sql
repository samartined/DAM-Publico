-- 2. Encuentra el nombre y el precio promedio de los productos en cada categoría.

SELECT c.nombre,
AVG(precio) as precio_medio
FROM productos p
JOIN categorias c ON p.idCategoria = c.idCategoria
GROUP BY nombre