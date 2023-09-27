drop table if exists users;
drop table if exists products;

create table users(
    id int primary key auto_increment),
    firstName varchar(225),
    lastName varchar(225),
    role varchar(225),
    address varchar(225),
    email varchar(225)
);

create table products(
    id int primary key auto_increment,
    name varchar(225),
    price float
);

insert into users (firstName, lastName, role, address, email)
values ('Victoria', 'Trotter', 'manager', '224 lorrel st', 'email@emil.com'),
('Megan', 'Labrecque', 'manager', '223 st st', 'email2@email.com');

insert into products (name, price)
values ('shirt', 20.32),
('soap', 10.45),
('toothpaste', 10.45),
('crocs', 32.99);
