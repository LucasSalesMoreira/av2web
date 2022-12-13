create database av2_dev_web_db;

create table post (
	id varchar(36) primary key,
    title varchar(15),
    body varchar(150),
    author varchar(50),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);