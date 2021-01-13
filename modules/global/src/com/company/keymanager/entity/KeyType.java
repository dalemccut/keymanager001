package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "KEYMANAGER_KEY_TYPE")
@Entity(name = "keymanager_KeyType")
@NamePattern("%s|type")
public class KeyType extends StandardEntity {
    private static final long serialVersionUID = -358124824116934678L;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}