--CHAVES ESTRANGEIRAS E INSERTS


Alter table contasreceber add constraint Fk_contascontasreceber FOREIGN KEY(idcliente) references cliente(id);


insert into cliente(nomecliente) values ('Gabriel');
insert into cliente(nomecliente) values ('Mirella');
insert into cliente(nomecliente) values ('Sarah');
insert into cliente(nomecliente) values ('André');
insert into cliente(nomecliente) values ('Giulia');
insert into cliente(nomecliente) values ('Raul');
insert into cliente(nomecliente) values ('João Paulo');

insert into contasreceber(id, dataconta, valor, idcliente) values (1,'2023-05-30',23.12, 1);
insert into contasreceber(id, dataconta, valor, idcliente) values (2,'2022-07-20',30.00, 3);
insert into contasreceber(id, dataconta, valor, idcliente) values (3,'2023-09-12',85.20, 6);
insert into contasreceber(id, dataconta, valor, idcliente) values (4,'2021-04-15',1.85, 5);
insert into contasreceber(id, dataconta, valor, idcliente) values (5,'2022-11-12',55.23, 4);
insert into contasreceber(id, dataconta, valor, idcliente) values (6,'2023-02-20',69.00, 2);
insert into contasreceber(id, dataconta, valor, idcliente) values (7,'2022-01-01',63.52, 7);


