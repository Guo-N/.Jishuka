create table USER
	(
		ID INT auto_increment,
		ACCOUNT_ID VARCHAR(100),
		NAME VARCHAR(15),
		TOKEN CHAR(36),
		GMT_CREATE BIGINT,
		GMT_MODIFIED BIGINT,
		primary key (ID)
	);