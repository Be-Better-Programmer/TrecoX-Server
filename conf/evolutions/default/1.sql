-- !Ups
CREATE TABLE demo (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(65) NOT NULL,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- !Downs
DROP TABLE demo;