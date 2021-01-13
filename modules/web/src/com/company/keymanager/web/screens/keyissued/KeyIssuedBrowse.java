package com.company.keymanager.web.screens.keyissued;

import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.KeyIssued;

@UiController("keymanager_KeyIssued.browse")
@UiDescriptor("key-issued-browse.xml")
@LookupComponent("keyIssuedsTable")
@LoadDataBeforeShow
public class KeyIssuedBrowse extends StandardLookup<KeyIssued> {
}