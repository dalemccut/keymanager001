create table KEYMANAGER_BUILDING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LOCATION_ID varchar(36) not null,
    NAME varchar(255) not null,
    ADDRESS varchar(255) not null,
    --
    primary key (ID)
);