
USE mytest;
CREATE TABLE persons
(  per_id INT NOT NULL AUTO_INCREMENT,
   per_name CHAR(50) NOT NULL,
   per_sex CHAR(5) NOT NULL,
   per_adress CHAR(50) NOT NULL,
   PRIMARY KEY(per_id)
)