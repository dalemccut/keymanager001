alter table KEYMANAGER_KEY_ISSUED alter column NUMBER_OF_KEYS_RETURNED rename to NUMBER_OF_KEYS_RETURNED__U40324 ^
alter table KEYMANAGER_KEY_ISSUED alter column NUMBER_OF_KEYS_ISSUED rename to NUMBER_OF_KEYS_ISSUED__U59040 ^
alter table KEYMANAGER_KEY_ISSUED alter column NUMBER_OF_KEYS_ISSUED__U59040 set null ;
