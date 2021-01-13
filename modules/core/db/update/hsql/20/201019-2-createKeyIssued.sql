alter table KEYMANAGER_KEY_ISSUED add constraint FK_KEYMANAGER_KEY_ISSUED_ON_STAFF foreign key (STAFF_ID) references KEYMANAGER_STAFF(ID);
alter table KEYMANAGER_KEY_ISSUED add constraint FK_KEYMANAGER_KEY_ISSUED_ON_ISSUED_TO_SUPERVISOR foreign key (ISSUED_TO_SUPERVISOR_ID) references KEYMANAGER_STAFF(ID);
create index IDX_KEYMANAGER_KEY_ISSUED_ON_STAFF on KEYMANAGER_KEY_ISSUED (STAFF_ID);
create index IDX_KEYMANAGER_KEY_ISSUED_ON_ISSUED_TO_SUPERVISOR on KEYMANAGER_KEY_ISSUED (ISSUED_TO_SUPERVISOR_ID);
