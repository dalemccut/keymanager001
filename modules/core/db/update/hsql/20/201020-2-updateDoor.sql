alter table KEYMANAGER_DOOR alter column KEY_ID rename to KEY_ID__U40186 ^
alter table KEYMANAGER_DOOR drop constraint FK_KEYMANAGER_DOOR_ON_KEY ;
drop index IDX_KEYMANAGER_DOOR_ON_KEY ;
