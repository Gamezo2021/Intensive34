CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(50) NOT NULL,
                                     surname VARCHAR(50) NOT NULL,
                                     middle_name VARCHAR(50),
                                     number VARCHAR(15) NOT NULL,
                                     email VARCHAR(100) NOT NULL,
                                     order_id BIGINT REFERENCES orders(id));

CREATE TABLE IF NOT EXISTS orders (
                                          id SERIAL PRIMARY KEY,
                                          name VARCHAR(200) NOT NULL,
                                          amount decimal not null);

