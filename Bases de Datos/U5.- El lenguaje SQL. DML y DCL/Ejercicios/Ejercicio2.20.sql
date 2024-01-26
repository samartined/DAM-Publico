-- 20.	Encuentra el mes con las mayores ventas totales. Y el mes con las menores ventas totales. Tiene que aparecer cada información en una fila diferente.

(SELECT 
    MONTH(fecha) AS month,
    YEAR(fecha) AS year,
    SUM(total) AS total
FROM
    pedidos
WHERE
    total = (SELECT 
            MAX(total)
        FROM
            pedidos)
GROUP BY month , year , total
LIMIT 1) UNION (SELECT 
    MONTH(fecha) AS month,
    YEAR(fecha) AS year,
    SUM(total) AS total
FROM
    pedidos
WHERE
    total = (SELECT 
            MIN(total)
        FROM
            pedidos)
GROUP BY month , year , total
LIMIT 1);