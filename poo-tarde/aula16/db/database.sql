CREATE TABLE pet (
    id int NOT NULL AUTO_INCREMENT,
    nome char(100),
    raca varchar(30),
    peso double,
    nascimento date,

    PRIMARY KEY(id)
);

-- Insere um PET

INSERT INTO pet (id, nome, raca, peso, nascimento)
VALUES (1, 'Toto', 'Viralata', 15.6, '2018-09-23');