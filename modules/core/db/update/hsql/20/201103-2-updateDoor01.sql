alter table KEYMANAGER_DOOR add constraint FK_KEYMANAGER_DOOR_ON_DOOR_TYPE foreign key (DOOR_TYPE_ID) references KEYMANAGER_DOOR_TYPE(ID);
create index IDX_KEYMANAGER_DOOR_ON_DOOR_TYPE on KEYMANAGER_DOOR (DOOR_TYPE_ID);