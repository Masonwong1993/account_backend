CREATE DATABASE IF NOT EXISTS users;
USE users;
CREATE TABLE IF NOT EXISTS users(firstname VARCHAR(20), lastname VARCHAR(20), gender VARCHAR(10), email VARCHAR(40), birthdate VARCHAR(20));
INSERT INTO users (firstname, lastname, gender, email, birthdate) VALUES ('huajun', 'wang', 'male', 'masonwong1993@gmail.com','1993-05-19');


