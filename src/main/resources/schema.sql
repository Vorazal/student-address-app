create table addresses
(
    address_id int auto_increment
        primary key,
        country varchar(20) not null,
    city varchar(20) not null,
    street varchar(30) not null
);

create table students
(
    student_id int auto_increment
        primary key,
    first_name varchar(15) not null,
    last_name varchar(15) not null,
    age int not null,
    hobby varchar(30),
    address_id int not null,
    constraint student_address_address_id_fk
        foreign key (address_id) references addresses (address_id)
);
