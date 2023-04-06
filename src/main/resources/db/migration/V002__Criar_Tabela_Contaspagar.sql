Create Table contaspagar(
  id int not null primary key auto_increment,
  data date,
  datavencimento date,
  idcliente int not null,
  valor  decimal(12,2)
);


