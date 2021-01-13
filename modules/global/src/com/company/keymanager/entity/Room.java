package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "KEYMANAGER_ROOM")
@Entity(name = "keymanager_Room")
@NamePattern("%s|description")
public class Room extends StandardEntity {
    private static final long serialVersionUID = -3267260135644011570L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "room")
    private List<Door> door;

    @NotNull
    @Column(name = "FLOOR_", nullable = false)
    private String floor;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUILDING_ID")
    private Building building;

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<Door> getDoor() {
        return door;
    }

    public void setDoor(List<Door> door) {
        this.door = door;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}