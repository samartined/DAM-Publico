-- 1. Obtén el nombre y el correo electrónico de todos los clientes cuyos correos electrónicos no aparezcan en ningún pedido.

select nombre, email 
from clientes
where idCliente not in (select c.idCliente
from clientes c
join pedidos p on c.idCliente = p.idCliente)