package com.company.keymanager.web.screens.location;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Location;

@UiController("keymanager_Location.browse")
@UiDescriptor("location-browse.xml")
@LookupComponent("locationsTable")
@LoadDataBeforeShow
public class LocationBrowse extends StandardLookup<Location> {
}