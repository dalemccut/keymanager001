package com.company.keymanager.listeners;
import com.company.keymanager.entity.Key;
import com.company.keymanager.entity.KeyUnique;
import com.company.keymanager.entity.KeyIssued;
import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.entity.contracts.Id;
import javax.inject.Inject;
import java.util.UUID;

@Component("keymanager_KeyIssuedListener")
public class KeyIssuedChangedListener {

    @Inject
    private TransactionalDataManager txDm;

    @EventListener
    private void beforeCommit(EntityChangedEvent<KeyIssued, UUID> event) {
        Key key = null;
        KeyUnique keyunique = null;
        if (event.getType() != EntityChangedEvent.Type.DELETED) {
            key = txDm.load(event.getEntityId())
                    .view("keyIssued-view")
                    .one()
                    .getKeyUnique()
                    .getKey();


            keyunique = txDm.load(event.getEntityId())
                    .view("keyIssued-view")
                    .one()
                    .getKeyUnique();

        } else return;

      /*  } else {
            Id<KeyUnique, UUID> keyUniqueId = event.getChanges().getOldReferenceId("keyUnique") ;


            keyunique = txDm.load(keyUniqueId).optional().orElse(null);
            key = txDm.load(keyUniqueId)
                    .view("keyUnique-view")
                    .one()
                    .getKey();

            if (key == null ) {
                // the key could be deleted
                return;
            }

        }*/

       // add  KeyUnique !



        long count = txDm.load(KeyIssued.class)
                .query("select i from keymanager_KeyIssued i where i.keyUnique = :keyUnique")
                .parameter("keyUnique", keyunique)
                .view("keyIssued-view")
                .list().stream()
                .filter(keyIssued -> Boolean.TRUE.equals( keyIssued.getDateReturned() == null  ))
                .count();

        key.setNumberOfKeysIssued((int) count + key.getNumberOfKeysIssued() );

        txDm.save(key);
    }
}