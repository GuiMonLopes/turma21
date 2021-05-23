create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
salgada boolean,
grande boolean,
primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
sabor varchar (255) not null,
preco decimal,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);


-- Popule esta tabela Categoria com até 5 dados
insert into tb_categoria (salgada, grande) values (true, true);
insert into tb_categoria (salgada, grande) values (true, false);
insert into tb_categoria (salgada, grande) values (false, true);
insert into tb_categoria (salgada, grande) values (false, false);

-- Popule esta tabela pizza com até 8 dados.

