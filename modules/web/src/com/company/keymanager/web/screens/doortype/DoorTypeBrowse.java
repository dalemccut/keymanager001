package com.company.keymanager.web.screens.doortype;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.DoorType;

@UiController("keymanager_DoorType.browse")
@UiDescriptor("door-type-browse.xml")
@LookupComponent("doorTypesTable")
@LoadDataBeforeShow
public class DoorTypeBrowse extends StandardLookup<DoorType> {
}