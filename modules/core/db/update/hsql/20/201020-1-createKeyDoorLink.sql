create table KEYMANAGER_KEY_DOOR_LINK (
    DOOR_ID varchar(36) not null,
    KEY_ID varchar(36) not null,
    primary key (DOOR_ID, KEY_ID)
);
