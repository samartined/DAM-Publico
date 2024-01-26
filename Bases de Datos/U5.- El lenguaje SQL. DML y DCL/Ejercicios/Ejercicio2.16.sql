-- 16.	Encuentra el cliente con el mayor gasto total en todos sus pedidos, incluyendo sus datos personales y el total gastado.

SELECT 
    c.*,
    (SELECT 
            SUM(total)
        FROM
            pedidos p
        WHERE
            p.idCliente = c.idCliente) AS totalGastado
FROM
    clientes c
        JOIN
    pedidos p ON p.idCliente = c.idCliente
WHERE
    p.total IN (SELECT 
            MAX(total)
        FROM
            pedidos p);