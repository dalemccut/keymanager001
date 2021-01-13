create table KEYMANAGER_STAFF_KEY_LINK (
    STAFF_ID varchar(36) not null,
    KEY_ID varchar(36) not null,
    primary key (STAFF_ID, KEY_ID)
);
