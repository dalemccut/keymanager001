package com.company.keymanager.web.screens.key;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Key;

@UiController("keymanager_Key.browse")
@UiDescriptor("key-browse.xml")
@LookupComponent("keysTable")
@LoadDataBeforeShow
public class KeyBrowse extends StandardLookup<Key> {
}