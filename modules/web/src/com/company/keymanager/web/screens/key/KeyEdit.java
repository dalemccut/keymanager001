package com.company.keymanager.web.screens.key;

import com.company.keymanager.entity.KeyIssued;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Key;

import javax.inject.Inject;

@UiController("keymanager_Key.edit")
@UiDescriptor("key-edit.xml")
@EditedEntityContainer("keyDc")
@LoadDataBeforeShow
public class KeyEdit extends StandardEditor<Key> {



}
