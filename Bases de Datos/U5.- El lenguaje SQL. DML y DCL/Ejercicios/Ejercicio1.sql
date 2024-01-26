
use pedidos;
-- Categorias
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Electrónica', 'Productos electrónicos y dispositivos');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Ropa', 'Ropa y accesorios');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Juguetes', 'Juguetes y juegos para niños y adultos');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Libros', 'Libros de diferentes géneros, incluidos ficción, no ficción, educativos y más.');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Juguetes', 'Juguetes y juegos para niños y adultos');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Hogar', 'Artículos para el hogar');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Deportes', 'Productos y accesorios relacionados con deportes y actividades al aire libre.');
INSERT INTO CATEGORIAS (nombre, descripcion) VALUES ('Electrónica', 'Productos electrónicos y dispositivos');
-- Clientes
INSERT INTO CLIENTES (nombre, apellido, email, telefono, direccion) VALUES ('Juan', 'Pérez', 'juan.perez@email.com', '+1234567890', 'Calle 123, Ciudad A');
INSERT INTO CLIENTES (nombre, apellido, email, telefono, direccion) VALUES ('María', 'González', 'maria.gonzalez@email.com', '+2345678901', 'Avenida 456, Ciudad B');
INSERT INTO CLIENTES (nombre, apellido, email, telefono, direccion) VALUES ('Carlos', 'Ramírez', 'carlos.ramirez@email.com', '+3456789012', 'Calle 789, Ciudad C');
INSERT INTO CLIENTES (nombre, apellido, email, telefono, direccion) VALUES ('Ana', 'Rodríguez', 'ana.rodriguez@email.com', '+4567890123', 'Avenida 321, Ciudad D');
INSERT INTO CLIENTES (nombre, apellido, email, telefono, direccion) VALUES ('Pedro', 'López', 'pedro.lopez@email.com', '+5678901234', 'Calle 654, Ciudad E');
-- Productos
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Camiseta Marvel', 'Camiseta con estampado de personajes de Marvel', 19.99, 2);
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Taza de café de Friends', 'Taza de café con el logo de Central Perk de la serie Friends', 12.99, 5);
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Póster Pulp Fiction', 'Póster de la icónica película Pulp Fiction de Quentin Tarantino', 14.99, 3);
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Funko Pop de Star Wars', 'Figura coleccionable Funko Pop de un personaje de Star Wars', 24.99, 3);
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Libro de cocina de películas', 'Libro de cocina con recetas inspiradas en películas famosas', 29.99, 4);
INSERT INTO PRODUCTOS (nombre, descripcion, precio, idCategoria) VALUES ('Peluche de Toy Story', 'Peluche de un personaje de la película animada Toy Story', 34.99, 3);