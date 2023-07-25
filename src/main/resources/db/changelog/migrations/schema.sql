--changeset ya:1
create table persons(
                        name varchar(255) not null,
                        surname varchar(255) not null,
                        age int not null,
                        phone_Number varchar(255) not null,
                        city varchar(255) not null
                    );

insert into persons(name, surname, age, phone_number, city) values
    ('Петя', 'Петров', '25', '8-967-201-62-88', 'Moscow');
insert into persons(name, surname, age, phone_number, city) values
    ('Катя', 'Петрова2', '35', '8-967-201-62-78', 'Moscow');
insert into persons(name, surname, age, phone_number, city) values
    ('Таня', 'Буянова', '35', '8-967-201-63-78', 'Spb');
insert into persons(name, surname, age, phone_number, city) values
    ('Женя', 'Буянов', '41', '8-965-201-63-78', 'Moscow');
--rollback
