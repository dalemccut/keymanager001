package com.company.keymanager.web.screens.keytype;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.KeyType;

@UiController("keymanager_KeyType.edit")
@UiDescriptor("key-type-edit.xml")
@EditedEntityContainer("keyTypeDc")
@LoadDataBeforeShow
public class KeyTypeEdit extends StandardEditor<KeyType> {
}