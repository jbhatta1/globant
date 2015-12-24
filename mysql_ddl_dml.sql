CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO globant.`user` (id, userid, last_name, first_name, profession, city, `state`, password) 
	VALUES (1, 'user1', 'Smith', 'John', 'IT DEV', 'Burbank', 'CA', 'abc123');
INSERT INTO globant.`user` (id, userid, last_name, first_name, profession, city, `state`, password) 
	VALUES (2, 'user2', 'White', 'Tracy', 'IT Manager', 'Pasadena', 'CA', 'abc123');
INSERT INTO globant.`user` (id, userid, last_name, first_name, profession, city, `state`, password) 
	VALUES (3, 'user3', 'Johnson', 'Bill', 'SUPPORT', 'Nashua', 'NH', 'abc123');
