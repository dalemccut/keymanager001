package com.company.keymanager.web.screens.keyissued;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.components.DateField;
import com.company.keymanager.entity.KeyIssued;
import java.time.LocalDate;
import javax.inject.Inject;
@UiController("keymanager_KeyIssued.edit")
@UiDescriptor("key-issued-edit.xml")
@EditedEntityContainer("keyIssuedDc")
@LoadDataBeforeShow
public class KeyIssuedEdit extends StandardEditor<KeyIssued> {

    @Inject
    private DateField<LocalDate> dateReturnedField;

    public KeyIssuedEdit() {
    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        if (((KeyIssued)this.getEditedEntity()).getDateIssued() != null) {
            this.dateReturnedField.setEditable(true);

        }

    }


}