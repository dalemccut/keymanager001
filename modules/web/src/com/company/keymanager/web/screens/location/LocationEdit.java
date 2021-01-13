package com.company.keymanager.web.screens.location;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Location;

@UiController("keymanager_Location.edit")
@UiDescriptor("location-edit.xml")
@EditedEntityContainer("locationDc")
@LoadDataBeforeShow
public class LocationEdit extends StandardEditor<Location> {
}