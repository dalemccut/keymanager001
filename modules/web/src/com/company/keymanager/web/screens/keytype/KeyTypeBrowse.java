package com.company.keymanager.web.screens.keytype;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.KeyType;

@UiController("keymanager_KeyType.browse")
@UiDescriptor("key-type-browse.xml")
@LookupComponent("keyTypesTable")
@LoadDataBeforeShow
public class KeyTypeBrowse extends StandardLookup<KeyType> {
}