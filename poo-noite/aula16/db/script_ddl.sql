CREATE TABLE pet (
    id int AUTO_INCREMENT NOT NULL,
    nome char(100),
    raca varchar(30),
    peso double,
    nascimento date,
    PRIMARY KEY(id)
);