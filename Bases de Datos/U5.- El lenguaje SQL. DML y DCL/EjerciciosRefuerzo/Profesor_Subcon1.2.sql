-- 2. Encuentra el nombre y el precio de los productos que se han vendido en pedidos con un descuento superior al 10%.

select distinct nombre, precio
from productos
where precio in (select precioUnitario
from lineas_pedidos
where descuento > (precioUnitario - (precioUnitario * 10 / 100)));