alter table KEYMANAGER_KEY_ISSUED alter column KEY_ID rename to KEY_ID__U27415 ^
alter table KEYMANAGER_KEY_ISSUED drop constraint FK_KEYMANAGER_KEY_ISSUED_ON_KEY ;
drop index IDX_KEYMANAGER_KEY_ISSUED_ON_KEY ;
alter table KEYMANAGER_KEY_ISSUED add column KEY_UNIQUE_ID varchar(36) ;
