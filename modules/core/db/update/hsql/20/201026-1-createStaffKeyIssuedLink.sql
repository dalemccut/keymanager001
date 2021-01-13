create table KEYMANAGER_STAFF_KEY_ISSUED_LINK (
    KEY_ISSUED_ID varchar(36) not null,
    STAFF_ID varchar(36) not null,
    primary key (KEY_ISSUED_ID, STAFF_ID)
);
