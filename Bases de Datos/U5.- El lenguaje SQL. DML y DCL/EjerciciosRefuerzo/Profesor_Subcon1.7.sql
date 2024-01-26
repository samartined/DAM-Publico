-- 7. Encuentra el nombre del cliente que ha gastado más dinero en total.

SELECT c.idCliente as id, c.nombre as nombre, c.apellido as apellido, p.total as total_gastado
from clientes as c
join pedidos as p on c.idCliente = p.idCliente
where p.total in (select max(total)
from pedidos);