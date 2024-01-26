-- 14.	Obtén el total de ventas por mes y año.

SELECT YEAR(fecha) AS años, MONTH(fecha) AS meses, SUM(total) AS ventas_totales
FROM PEDIDOS
GROUP BY años, meses
ORDER BY años, meses;

-- NO LO HE PODIDO RESOLVER SOLO