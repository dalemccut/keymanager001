alter table KEYMANAGER_ROOM add constraint FK_KEYMANAGER_ROOM_ON_BUILDING foreign key (BUILDING_ID) references KEYMANAGER_BUILDING(ID);
create index IDX_KEYMANAGER_ROOM_ON_BUILDING on KEYMANAGER_ROOM (BUILDING_ID);
