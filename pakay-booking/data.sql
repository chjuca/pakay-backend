DROP TABLE IF EXISTS booking;
CREATE TABLE booking(
	id serial PRIMARY KEY, 
	description VARCHAR(255),
	price float);