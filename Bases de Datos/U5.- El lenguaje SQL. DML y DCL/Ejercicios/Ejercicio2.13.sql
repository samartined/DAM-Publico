-- 13.	Encuentra el producto más caro en cada categoría.

SELECT p.idProducto, p.nombre, p.precio, p.idCategoria
FROM PRODUCTOS p
JOIN (
SELECT idCategoria, MAX(precio) AS max_precio
FROM PRODUCTOS
GROUP BY idCategoria
) AS max_precios ON p.idCategoria = max_precios.idCategoria AND p.precio = max_precios.max_precio;

-- ESTO ES LO MISMO QUE:

SELECT p.idProducto, p.nombre, p.precio, p.idCategoria
FROM PRODUCTOS p
WHERE (p.idCategoria, p.precio) IN (
    SELECT idCategoria, MAX(precio) AS max_precio
    FROM PRODUCTOS
    GROUP BY idCategoria
);