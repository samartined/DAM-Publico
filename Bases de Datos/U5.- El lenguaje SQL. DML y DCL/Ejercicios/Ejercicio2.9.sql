-- 9.	Muestra todos los productos que pertenecen a la categoría con el nombre 'Juguetes'.
SELECT p.*
FROM productos p
JOIN categorias c ON p.idCategoria = c.idCategoria
WHERE c.nombre = 'Juguetes';