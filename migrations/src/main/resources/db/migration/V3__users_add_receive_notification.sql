alter table users
    add column if not exists receive_notifications boolean;

-- It's not a really safe with huge amount of data but good for the example
update users
set users.receive_notifications = email is not null;

alter table users
    alter column receive_notifications set not null;
