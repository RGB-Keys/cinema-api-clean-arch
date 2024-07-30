CREATE SEQUENCE IF NOT EXISTS id_movie_seq
     INCREMENT 1
     MINVALUE 1
     MAXVALUE 99999999999
     START 1
     CACHE 1;

CREATE TABLE movies(
    id_movie                    INTEGER         NOT NULL    DEFAULT NEXTVAL('id_movie_seq') PRIMARY KEY,
    title                       VARCHAR(255)    NOT NULL,
    genre                       VARCHAR(50)     NOT NULL,
    classification              VARCHAR(10)     NOT NULL,
    duration                    VARCHAR(5)      NOT NULL,
    synopsis                    VARCHAR(255)    NOT NULL,
    idiom                       VARCHAR(30)     NOT NULL
)