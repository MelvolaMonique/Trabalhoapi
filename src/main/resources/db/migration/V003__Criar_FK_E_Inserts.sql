--CHAVES ESTRANGEIRAS E INSERTS


Alter table contasreceber add constraint Fk_contascontasreceber FOREIGN KEY(idcliente) references cliente(id);


insert into cliente(nomecliente) values ('Gabriel');
insert into cliente(nomecliente) values ('Mirella');
insert into cliente(nomecliente) values ('Sarah');
insert into cliente(nomecliente) values ('André');
insert into cliente(nomecliente) values ('Giulia');
