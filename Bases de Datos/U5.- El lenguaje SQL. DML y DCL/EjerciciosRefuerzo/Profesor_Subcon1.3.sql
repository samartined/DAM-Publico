-- 3. Obtén el nombre de las categorías que no tienen ningún producto asociado.

select nombre as categorias_sin_productos
from categorias
where idCategoria not in (select idCategoria
from productos);