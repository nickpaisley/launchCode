--Crete a database called "movie-buff" with 2 tables in it, 'movies' 
--and 'directors'
CREATE TABLE movies(
    movie_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(120),
    year INTEGER,
    director_id INTEGER(120)
);

--Create a table for directors
CREATE TABLE directors(
    director_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    first VARCHAR(120),
    last VARCHAR(120),
    country VARCHAR(120)
);

DROP TABLE movies;

--Created a new 'movies' table that uses Foreign Keys for Director_ID
CREATE TABLE movies(
    movie_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(120),
    year INTEGER,
    diretor_ID INTEGER,
    FOREIGN KEY (director_id) REFERENCES directors(director_id)
)