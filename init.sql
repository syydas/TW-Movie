CREATE SCHEMA `tw_movie` DEFAULT CHARACTER SET utf8 ;
USE tw_movie;
SELECT
    *
FROM
    movies;

ALTER table movies ADD PRIMARY KEY (id);