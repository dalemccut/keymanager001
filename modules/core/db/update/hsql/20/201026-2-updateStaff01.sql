alter table KEYMANAGER_STAFF add constraint FK_KEYMANAGER_STAFF_ON_KEY foreign key (KEY_ID) references KEYMANAGER_KEY_ISSUED(ID);
create index IDX_KEYMANAGER_STAFF_ON_KEY on KEYMANAGER_STAFF (KEY_ID);
