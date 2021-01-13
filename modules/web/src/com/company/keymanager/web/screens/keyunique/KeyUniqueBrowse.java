package com.company.keymanager.web.screens.keyunique;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.KeyUnique;

@UiController("keymanager_KeyAdd.browse")
@UiDescriptor("key-unique-browse.xml")
@LookupComponent("keyUniquesTable")
@LoadDataBeforeShow
public class KeyUniqueBrowse extends StandardLookup<KeyUnique> {
}