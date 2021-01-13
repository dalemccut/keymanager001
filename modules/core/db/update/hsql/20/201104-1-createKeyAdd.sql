create table KEYMANAGER_KEY_ADD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    UNIQUE_NUMBER varchar(255),
    DATE_ADDED date,
    --
    primary key (ID)
);