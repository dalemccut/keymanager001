package com.company.keymanager.web.screens.doortype;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.DoorType;

@UiController("keymanager_DoorType.edit")
@UiDescriptor("door-type-edit.xml")
@EditedEntityContainer("doorTypeDc")
@LoadDataBeforeShow
public class DoorTypeEdit extends StandardEditor<DoorType> {
}