package com.company.keymanager.web.screens.staff;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.Staff;

@UiController("keymanager_Staff.edit")
@UiDescriptor("staff-edit.xml")
@EditedEntityContainer("staffDc")
@LoadDataBeforeShow
public class StaffEdit extends StandardEditor<Staff> {
}