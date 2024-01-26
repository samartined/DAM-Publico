	-- 5. Obtén el nombre de las categorías de productos que tienen un precio promedio superior a 75.

select nombre 
from categorias
where idCategoria in (select idCategoria
from productos
group by idCategoria
having avg(precio) > avg(precio) * 75 / 100);