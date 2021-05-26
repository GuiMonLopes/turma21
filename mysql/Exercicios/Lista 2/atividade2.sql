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

select * from tb_categoria;
-- Popule esta tabela pizza com até 8 dados.
insert into tb_pizza (sabor,preco, categoria_id) values ("Mussarela", 40.00, 1);
insert into tb_pizza (sabor,preco, categoria_id) values ("Mussarela", 40.00, 2);
insert into tb_pizza (sabor,preco, categoria_id) values ("Calabreza", 40.00, 1);
insert into tb_pizza (sabor,preco, categoria_id) values ("Calabreza", 40.00, 2);
insert into tb_pizza (sabor,preco, categoria_id) values ("Portuguesa", 40.00, 1);
insert into tb_pizza (sabor,preco, categoria_id) values ("Portuguesa", 40.00, 2);
insert into tb_pizza (sabor,preco, categoria_id) values ("Prestigio", 40.00, 3);
insert into tb_pizza (sabor,preco, categoria_id) values ("Prestigio", 40.00, 4);
select * from tb_pizza;

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_pizza where preco >45.00;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza where preco <60.00 and preco >25.00;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where tb_pizza.sabor like "%C%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_categoria inner join tb_pizza on tb_pizza.categoria_id = tb_categoria.id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select tb_pizza.sabor, tb_categoria.salgada
from tb_categoria
inner join tb_pizza on tb_pizza.categoria_id = tb_categoria.id where tb_categoria.salgada = false;
