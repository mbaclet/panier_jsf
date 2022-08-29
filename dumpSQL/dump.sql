

CREATE DATABASE IF NOT EXISTS `panier`;
USE `panier`;



DROP TABLE IF EXISTS `article` ;
CREATE TABLE `article`(
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `nom` TEXT  ,
    `description` TEXT,
    `prix` DOUBLE,
    `quantity` INTEGER
);



INSERT INTO article(nom,`description`,prix,quantity) VALUES ('Pomme','Golden',0.99,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Pomme','Royale gala',0.49,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Peche','Peche blanche',0.39,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Peche','Peche jaune',0.49,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Abricot','Abricot origine Espagne',0.89,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Banane','Banane de Madagascar',0.19,1);

INSERT INTO article(nom,description,prix,quantity) VALUES ('Kiwi','Kiwi jaune',0.99,1);

