# Atividade 3 - Farmácia do Bem
create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categorias(
id INT,
nome VARCHAR(45),
responsavel VARCHAR(45),
primary key (id)
);

create table tb_produto(
id INT auto_increment,
nome VARCHAR(45),
valor DOUBLE,
generico BOOLEAN,
receita BOOLEAN,
id_categoria INT,
PRIMARY KEY (id),
FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id)
);

insert into tb_categorias (id, nome, responsavel)
values
(1, "Remédio", "Miguel Mendes"),
(2, "Higiene", "Bruno Mendes"),
(3, "Alimentos", "Barbara Mendes"),
(4, "Suplementos", "Ana Boñas");

insert into tb_produto (nome, valor, generico, receita, id_categoria)
values
("Aspirina", 1.99, true, false, 1),
("Lenço", 2.99, false, false, 2),
("Farinha de Ouro", 99.99, false, false, 3),
("Rivotras", 129.99, true, true, 1);

select a.id, b.nome
from tb_categorias as a
inner join tb_produto as b
on a.id = b.id_categoria;

select * from tb_produto
where id_categoria = 1;
