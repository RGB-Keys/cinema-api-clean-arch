CREATE SEQUENCE IF NOT EXISTS id_customer_seq
     INCREMENT 1
     MINVALUE 1
     MAXVALUE 99999999999
     START 1
     CACHE 1;

CREATE TABLE customers (
    id_customer                 INTEGER         NOT NULL    DEFAULT NEXTVAL('id_customer_seq') PRIMARY KEY,
    name                        VARCHAR(255)    NOT NULL,
    email                       VARCHAR(100)    NOT NULL    UNIQUE,
    phone                       VARCHAR(14)     NOT NULL,
    cpf                         VARCHAR(11)     NOT NULL    UNIQUE,
    customer_type               VARCHAR(12)     NOT NULL,
    zip_code                    VARCHAR(8)      NOT NULL,
    country                     VARCHAR(50)     NOT NULL,
    state                       VARCHAR(50)     NOT NULL,
    city                        VARCHAR(50)     NOT NULL,
    street                      VARCHAR(50)     NOT NULL,
    neighborhood                VARCHAR(50)     NOT NULL,
    number                      VARCHAR(5)          NULL
)