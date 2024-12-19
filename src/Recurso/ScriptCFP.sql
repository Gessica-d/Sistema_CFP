/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Géssica
 * Created: 18 de dez. de 2024
 */

create database Sistema_CPF;
USE Sistema_CPF ;
create table usuario (
id int auto_increment primary key,
nome varchar(100) not null,
senha varchar(100) not null
);
create table categorias(
id int auto_increment primary key,
nome varchar(100) not null,
tipo enum('Receita', 'Despesa') not null
);
create table transacoes(
id int auto_increment primary key,
id_usuario int not null,
id_categoria int not null,
descricao varchar(200),
valor decimal(10, 2) not null,
data date not null,
foreign key (id_usuario) references usuario(id),
foreign key (id_categoria) references categorias(id)
);
SHOW TABLES;