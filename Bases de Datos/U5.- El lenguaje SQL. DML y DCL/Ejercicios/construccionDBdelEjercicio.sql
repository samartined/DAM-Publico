create database pedidos;
use pedidos;
create table clientes (
idCliente int auto_increment primary key,
nombre varchar(255) not null,
apellido varchar(255) not null,
email varchar(255) not null,
telefono varchar(20),
direccion varchar(255)
);

create table categorias (
idCategoria int auto_increment primary key,
nombre varchar(255) not null,
descripcion text
);

create table productos (
idProducto int auto_increment primary key,
nombre varchar(255) not null,
descripcion text,
precio decimal(10,2) not null,
idCategoria int,
foreign key (idCategoria) references categorias (idCategoria)
);

create table pedidos (
idPedido int auto_increment primary key,
idCliente int not null,
fecha datetime not null,
total decimal(10,2),
foreign key (idCliente) references clientes (idCliente)
);

create table lineas_pedidos (
idLineaPedido int,
idPedido int,
idProducto int,
cantidad int not null,
precioUnitario decimal(10,2) not null,
descuento decimal(10,2) not null,
total decimal(10,2) not null,
primary key (idLineaPedido, idPedido, idProducto),
foreign key (idPedido) references pedidos(idPedido),
foreign key(idProducto) references productos(idProducto)
);