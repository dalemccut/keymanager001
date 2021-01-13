alter table KEYMANAGER_STAFF alter column KEY_ID rename to KEY_ID__U69887 ^
alter table KEYMANAGER_STAFF drop constraint FK_KEYMANAGER_STAFF_ON_KEY ;
drop index IDX_KEYMANAGER_STAFF_ON_KEY ;
