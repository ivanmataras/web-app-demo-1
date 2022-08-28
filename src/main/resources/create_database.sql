create
database "SalesDB"
    with owner postgres;
create table customer
(
    id      integer     not null
        constraint id
            primary key,
    name    varchar(45) not null,
    email   varchar(45) not null,
    address varchar(45) not null
);

alter table customer
    owner to postgres;
