
CREATE TABLE IF NOT EXISTS category(
    id SERIAL,
    description VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS expense(
    id SERIAL,
    description VARCHAR(50),
    value DECIMAL(10,2),
    catogory_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(catogory_id) REFERENCES category(id)
);