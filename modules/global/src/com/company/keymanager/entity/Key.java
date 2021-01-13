package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "KEYMANAGER_KEY")
@Entity(name = "keymanager_Key")
@NamePattern("%s|keytype")
public class Key extends StandardEntity {
    private static final long serialVersionUID = -4733136783946892263L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KEYTYPE_ID")
    private KeyType keytype;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "key")
    private List<KeyUnique> keyUnique;

    @Column(name = "NUMBER_OF_KEYS_ISSUED")
    private Integer numberOfKeysIssued;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    @JoinTable(name = "KEYMANAGER_KEY_DOOR_LINK",
            joinColumns = @JoinColumn(name = "KEY_ID"),
            inverseJoinColumns = @JoinColumn(name = "DOOR_ID"))


    private List<Door> door;

    public List<KeyUnique> getKeyUnique() {
        return keyUnique;
    }

    public void setKeyUnique(List<KeyUnique> keyUnique) {
        this.keyUnique = keyUnique;
    }

    public Integer getNumberOfKeysIssued() {
        return numberOfKeysIssued;
    }

    public void setNumberOfKeysIssued(Integer numberOfKeysIssued) {
        this.numberOfKeysIssued = numberOfKeysIssued;
    }

    public List<Door> getDoor() {
        return door;
    }

    public void setDoor(List<Door> door) {
        this.door = door;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public KeyType getKeytype() {
        return keytype;
    }

    public void setKeytype(KeyType keytype) {
        this.keytype = keytype;
    }
}