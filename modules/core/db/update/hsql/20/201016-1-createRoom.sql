create table KEYMANAGER_ROOM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255) not null,
    FLOOR_ varchar(255) not null,
    DESCRIPTION varchar(1000),
    BUILDING_ID varchar(36),
    --
    primary key (ID)
);