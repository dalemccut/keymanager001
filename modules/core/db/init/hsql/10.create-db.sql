-- begin KEYMANAGER_ROOM
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
)^
-- end KEYMANAGER_ROOM
-- begin KEYMANAGER_KEY_TYPE
create table KEYMANAGER_KEY_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255) not null,
    --
    primary key (ID)
)^
-- end KEYMANAGER_KEY_TYPE
-- begin KEYMANAGER_DOOR
create table KEYMANAGER_DOOR (
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
    DOOR_TYPE_ID varchar(36),
    DESCRIPTION varchar(1000),
    ROOM_ID varchar(36),
    --
    primary key (ID)
)^
-- end KEYMANAGER_DOOR
-- begin KEYMANAGER_LOCATION
create table KEYMANAGER_LOCATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(500) not null,
    --
    primary key (ID)
)^
-- end KEYMANAGER_LOCATION
-- begin KEYMANAGER_STAFF
create table KEYMANAGER_STAFF (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end KEYMANAGER_STAFF
-- begin KEYMANAGER_BUILDING
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
)^
-- end KEYMANAGER_BUILDING
-- begin KEYMANAGER_KEY
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
    NUMBER_OF_KEYS_ISSUED integer,
    NUMBER_ varchar(255) not null,
    --
    primary key (ID)
)^
-- end KEYMANAGER_KEY
-- begin KEYMANAGER_KEY_ISSUED
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
    DATE_RETURNED date,
    DATE_ISSUED date not null,
    ISSUED_TO_SUPERVISOR_ID varchar(36) not null,
    KEY_UNIQUE_ID varchar(36),
    --
    primary key (ID)
)^
-- end KEYMANAGER_KEY_ISSUED
-- begin KEYMANAGER_KEY_DOOR_LINK
create table KEYMANAGER_KEY_DOOR_LINK (
    DOOR_ID varchar(36) not null,
    KEY_ID varchar(36) not null,
    primary key (DOOR_ID, KEY_ID)
)^
-- end KEYMANAGER_KEY_DOOR_LINK
-- begin KEYMANAGER_DOOR_TYPE
create table KEYMANAGER_DOOR_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DOOR_TYPE_DESC varchar(500) not null,
    --
    primary key (ID)
)^
-- end KEYMANAGER_DOOR_TYPE
-- begin KEYMANAGER_KEY_ADD
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
    IS_ISSUED boolean,
    DATE_ADDED date,
    KEY_ID varchar(36),
    NUM_ISSUED integer,
    --
    primary key (ID)
)^
-- end KEYMANAGER_KEY_ADD
