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
