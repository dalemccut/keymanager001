package com.company.keymanager.web.screens.staff;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Staff;

@UiController("keymanager_Staff.browse")
@UiDescriptor("staff-browse.xml")
@LookupComponent("staffsTable")
@LoadDataBeforeShow
public class StaffBrowse extends StandardLookup<Staff> {
}