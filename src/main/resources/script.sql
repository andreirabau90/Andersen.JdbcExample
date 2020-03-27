create table person_set
(
  id   serial      not null
  constraint person_set_pkey
  primary key,
  name varchar(32) not null,
  age  integer     not null
);
