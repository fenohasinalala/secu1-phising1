create extension if not exists "uuid-ossp";

create table if not exists "account" (
    id              varchar
    CONSTRAINT account_pkey primary key
    default uuid_generate_v4(),
    username    varchar,
    password    varchar,
    submit_time timestamp with time zone default now()
    );
