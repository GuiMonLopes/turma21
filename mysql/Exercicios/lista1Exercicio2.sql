-- Criando o banco de dados
create database db_ecommerce;

-- Acessando o banco de dados
use db_ecommerce;

-- Criando a tabela produtos
create table tb_produtosEcommerce(
id bigint(20) auto_increment,
nome varchar (255) not null,
preco decimal(10,2),
marca varchar(255) not null,
departamento varchar(255),
primary key(id)
);

-- Incluindo os produtos na tabela produtos
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Bolsa",1200.25, "Armani","Acessorios");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Bolsa",200, "LouisVuitton","Acessorios");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Calça",500.80, "Armani","Vestuario");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Calça",150.63, "Levis","Vestuario");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Camisa",600.25, "Calvin Klein","Vestuario");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Camisa",190.25, "M. Office","Vestuario");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Tenis",600, "Nike","Calçados");
insert into tb_produtosEcommerce (nome, preco, marca, departamento) values ("Tenis",150, "Adidas","Calçados");

select * from tb_produtosEcommerce;

 -- Select para produtos maiores que R$ 500.00
 
 select * from tb_produtosEcommerce where preco >500;

 -- Select para produtos menores que R$ 500.00
select * from tb_produtosEcommerce where preco <500;

-- Atualizando as informações
update tb_produtosEcommerce set nome = "Camisa", preco = 200.62, marca = "Levis", departamento = "Vestuario" where id =1;


