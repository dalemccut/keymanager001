package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "KEYMANAGER_DOOR_TYPE")
@Entity(name = "keymanager_DoorType")
@NamePattern("%s|doorTypeDesc")
public class DoorType extends StandardEntity {
    private static final long serialVersionUID = 3177580956216726747L;

    @NotNull
    @Column(name = "DOOR_TYPE_DESC", nullable = false, length = 500)
    private String doorTypeDesc;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "doorType")
    private Door door;

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public String getDoorTypeDesc() {
        return doorTypeDesc;
    }

    public void setDoorTypeDesc(String doorTypeDesc) {
        this.doorTypeDesc = doorTypeDesc;
    }
}