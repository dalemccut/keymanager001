package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "KEYMANAGER_LOCATION")
@Entity(name = "keymanager_Location")
@NamePattern("%s|description")
public class Location extends StandardEntity {
    private static final long serialVersionUID = -4413105893793631868L;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false, length = 500)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}