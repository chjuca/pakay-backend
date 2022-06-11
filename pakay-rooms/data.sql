DROP TABLE IF EXISTS room;    
CREATE TABLE room(
	id serial PRIMARY KEY, 
    title VARCHAR(100),
	description VARCHAR(255),
	type VARCHAR(50),
	state_cleanliness VARCHAR(255),
	num_beds INTEGER,
	photos VARCHAR[],
    minibar BOOLEAN NOT NULL,
	price float);