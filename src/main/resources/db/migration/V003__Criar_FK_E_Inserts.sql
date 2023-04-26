--CHAVES ESTRANGEIRAS E INSERTS


Alter table contaspagar add constraint Fk_contaspagar FOREIGN KEY(idcliente) references cliente(id);


insert into cliente(nomecliente) values ('Gabriel');
insert into cliente(nomecliente) values ('Mirella');
insert into cliente(nomecliente) values ('Sarah');

insert into contaspagar(data,datavencimento,idcliente,valor) values('2021-11-23 22:10:13','2022-03-25 22:10:13',1,19.3);
insert into contaspagar(data,datavencimento,idcliente,valor) values('2022-11-23 22:10:13','2024-12-12 12:10:13',2,156.3);
