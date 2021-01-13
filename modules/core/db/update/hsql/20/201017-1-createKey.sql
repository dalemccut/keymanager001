create table KEYMANAGER_KEY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    KEYTYPE_ID varchar(36) not null,
    NUMBER_ varchar(255) not null,
    TAG_NUMBER varchar(255) not null,
    --
    primary key (ID)
);