alter table KEYMANAGER_KEY_ADD add constraint FK_KEYMANAGER_KEY_ADD_ON_KEY foreign key (KEY_ID) references KEYMANAGER_KEY(ID);
create index IDX_KEYMANAGER_KEY_ADD_ON_KEY on KEYMANAGER_KEY_ADD (KEY_ID);
