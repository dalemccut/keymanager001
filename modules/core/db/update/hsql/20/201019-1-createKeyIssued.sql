create table KEYMANAGER_KEY_ISSUED (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STAFF_ID varchar(36) not null,
    DATE_ISSUED date not null,
    NUMBER_OF_KEYS_ISSUED integer not null,
    ISSUED_TO_SUPERVISOR_ID varchar(36) not null,
    --
    primary key (ID)
);