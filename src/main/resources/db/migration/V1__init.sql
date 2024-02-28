
CREATE TABLE IF NOT EXISTS category(
    id SERIAL,
    description VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS expense(
    id SERIAL,
    description VARCHAR(50),
    spend DECIMAL(10,2),
    category_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(category_id) REFERENCES category(id)
);