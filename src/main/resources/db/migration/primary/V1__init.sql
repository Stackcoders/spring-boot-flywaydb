CREATE TABLE users (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


use flywaydemo;

CREATE TABLE address (
  addrID bigint(20) NOT NULL AUTO_INCREMENT,
  doorNo varchar(100) NOT NULL,
  line1 varchar(50) NOT NULL,
  line2 varchar(50) DEFAULT NULL,
  city varchar(50) DEFAULT NULL,
  state varchar(50) DEFAULT NULL,
  pincode varchar(50) DEFAULT NULL,
  country varchar(50) DEFAULT NULL,
  PRIMARY KEY (addrID)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;