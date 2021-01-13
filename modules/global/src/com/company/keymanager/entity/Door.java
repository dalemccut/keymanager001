package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "KEYMANAGER_DOOR")
@Entity(name = "keymanager_Door")
@NamePattern("%s|description")
public class Door extends StandardEntity {
    private static final long serialVersionUID = -4557644492046644342L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOOR_TYPE_ID")
    private DoorType doorType;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @JoinTable(name = "KEYMANAGER_KEY_DOOR_LINK",
            joinColumns = @JoinColumn(name = "DOOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "KEY_ID"))
    @ManyToMany
    private List<Key> keys;

    public DoorType getDoorType() {
        return doorType;
    }

    public void setDoorType(DoorType doorType) {
        this.doorType = doorType;
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}