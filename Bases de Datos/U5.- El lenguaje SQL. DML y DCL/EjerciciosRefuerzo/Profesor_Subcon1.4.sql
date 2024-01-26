-- 4. Encuentra el nombre de los clientes que han realizado más de 3 pedidos.

select c.idCliente as id, c.nombre as nombre, c.apellido as apellido,
sum(cantidad) as total_pedidos
from clientes c
join pedidos p on c.idCliente = p.idCliente
join lineas_pedidos l on p.idPedido = l.idPedido
where l.idPedido in (select idPedido
from lineas_pedidos
where cantidad > 3)
group by id, nombre, apellido