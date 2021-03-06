-- begin KEYMANAGER_ROOM
alter table KEYMANAGER_ROOM add constraint FK_KEYMANAGER_ROOM_ON_BUILDING foreign key (BUILDING_ID) references KEYMANAGER_BUILDING(ID)^
create index IDX_KEYMANAGER_ROOM_ON_BUILDING on KEYMANAGER_ROOM (BUILDING_ID)^
-- end KEYMANAGER_ROOM
-- begin KEYMANAGER_DOOR
alter table KEYMANAGER_DOOR add constraint FK_KEYMANAGER_DOOR_ON_DOOR_TYPE foreign key (DOOR_TYPE_ID) references KEYMANAGER_DOOR_TYPE(ID)^
alter table KEYMANAGER_DOOR add constraint FK_KEYMANAGER_DOOR_ON_ROOM foreign key (ROOM_ID) references KEYMANAGER_ROOM(ID)^
create index IDX_KEYMANAGER_DOOR_ON_DOOR_TYPE on KEYMANAGER_DOOR (DOOR_TYPE_ID)^
create index IDX_KEYMANAGER_DOOR_ON_ROOM on KEYMANAGER_DOOR (ROOM_ID)^
-- end KEYMANAGER_DOOR
-- begin KEYMANAGER_BUILDING
alter table KEYMANAGER_BUILDING add constraint FK_KEYMANAGER_BUILDING_ON_LOCATION foreign key (LOCATION_ID) references KEYMANAGER_LOCATION(ID)^
create index IDX_KEYMANAGER_BUILDING_ON_LOCATION on KEYMANAGER_BUILDING (LOCATION_ID)^
-- end KEYMANAGER_BUILDING
-- begin KEYMANAGER_KEY
alter table KEYMANAGER_KEY add constraint FK_KEYMANAGER_KEY_ON_KEYTYPE foreign key (KEYTYPE_ID) references KEYMANAGER_KEY_TYPE(ID)^
create index IDX_KEYMANAGER_KEY_ON_KEYTYPE on KEYMANAGER_KEY (KEYTYPE_ID)^
-- end KEYMANAGER_KEY
-- begin KEYMANAGER_KEY_ISSUED
alter table KEYMANAGER_KEY_ISSUED add constraint FK_KEYMANAGER_KEY_ISSUED_ON_STAFF foreign key (STAFF_ID) references KEYMANAGER_STAFF(ID)^
alter table KEYMANAGER_KEY_ISSUED add constraint FK_KEYMANAGER_KEY_ISSUED_ON_ISSUED_TO_SUPERVISOR foreign key (ISSUED_TO_SUPERVISOR_ID) references KEYMANAGER_STAFF(ID)^
alter table KEYMANAGER_KEY_ISSUED add constraint FK_KEYMANAGER_KEY_ISSUED_ON_KEY_UNIQUE foreign key (KEY_UNIQUE_ID) references KEYMANAGER_KEY_ADD(ID)^
create index IDX_KEYMANAGER_KEY_ISSUED_ON_STAFF on KEYMANAGER_KEY_ISSUED (STAFF_ID)^
create index IDX_KEYMANAGER_KEY_ISSUED_ON_ISSUED_TO_SUPERVISOR on KEYMANAGER_KEY_ISSUED (ISSUED_TO_SUPERVISOR_ID)^
create index IDX_KEYMANAGER_KEY_ISSUED_ON_KEY_UNIQUE on KEYMANAGER_KEY_ISSUED (KEY_UNIQUE_ID)^
-- end KEYMANAGER_KEY_ISSUED
-- begin KEYMANAGER_KEY_DOOR_LINK
alter table KEYMANAGER_KEY_DOOR_LINK add constraint FK_KEYDOO_ON_DOOR foreign key (DOOR_ID) references KEYMANAGER_DOOR(ID)^
alter table KEYMANAGER_KEY_DOOR_LINK add constraint FK_KEYDOO_ON_KEY foreign key (KEY_ID) references KEYMANAGER_KEY(ID)^
-- end KEYMANAGER_KEY_DOOR_LINK
-- begin KEYMANAGER_KEY_ADD
alter table KEYMANAGER_KEY_ADD add constraint FK_KEYMANAGER_KEY_ADD_ON_KEY foreign key (KEY_ID) references KEYMANAGER_KEY(ID)^
create index IDX_KEYMANAGER_KEY_ADD_ON_KEY on KEYMANAGER_KEY_ADD (KEY_ID)^
-- end KEYMANAGER_KEY_ADD
