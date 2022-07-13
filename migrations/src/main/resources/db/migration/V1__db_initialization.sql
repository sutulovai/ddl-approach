create table if not exists users
(
    id        uuid        not null primary key,
    user_name varchar(64) not null,
    email     varchar(128)
);
