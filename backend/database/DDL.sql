CREATE DATABASE baseconhecimento;

USE baseconhecimento;

--DDL--
CREATE TABLE users (
    idUser INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    admin BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE admin (
    idAdmin INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE categories (
    idCategories INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    parentId INT,
    FOREIGN KEY (parentId) REFERENCES categories(idCategories)
);

CREATE TABLE articles (
    idArticle INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    imageUrl VARCHAR(1000) NOT NULL,
    idUser INT NOT NULL,
    idCategoria INT NOT NULL,
    FOREIGN KEY (idUser) REFERENCES users(idUser),
    FOREIGN KEY (idCategoria) REFERENCES categories(idCategories)
);

--DDL--close
