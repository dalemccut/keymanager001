package com.company.keymanager.web.screens.keyunique;

import com.company.keymanager.entity.KeyIssued;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.keymanager.entity.KeyUnique;

import javax.inject.Inject;

@UiController("keymanager_KeyAdd.edit")
@UiDescriptor("key-unique-edit.xml")
@EditedEntityContainer("keyUniqueDc")
@LoadDataBeforeShow
public class KeyUniqueEdit extends StandardEditor<KeyUnique> {

    @Inject
    private CollectionContainer<KeyIssued> keyIssuedDc;

    @Subscribe(id = "keyIssuedDc", target = Target.DATA_CONTAINER)
    protected void onKeysIssuedDcCollectionChange(CollectionContainer.CollectionChangeEvent<KeyIssued> event) {


           Boolean isIssued = false;
           Integer amount = 0;
            for (KeyIssued keyissued : keyIssuedDc.getItems()) {

               if(keyissued.getDateReturned() == null)
                amount = amount +1;

            }

                if ( amount > 0)
                { getEditedEntity().setIsIssued(true);}
                else
                {  getEditedEntity().setIsIssued(false);}

                  getEditedEntity().setNumIssued(amount);


    }





}