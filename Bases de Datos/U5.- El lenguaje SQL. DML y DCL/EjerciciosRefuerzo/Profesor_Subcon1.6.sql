-- 6. Obtén la lista de clientes que han realizado pedidos, mostrando sus nombres y correos

select idCliente, nombre, apellido, email
from clientes
where idCliente in (select idCliente
from pedidos);