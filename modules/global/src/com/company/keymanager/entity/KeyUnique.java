package com.company.keymanager.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "KEYMANAGER_KEY_ADD")
@Entity(name = "keymanager_KeyAdd")
public class KeyUnique extends StandardEntity {
    private static final long serialVersionUID = 5383432834083017250L;

    @Column(name = "UNIQUE_NUMBER")
    private String uniqueNumber;

    @Column(name = "IS_ISSUED")
    private Boolean isIssued = false;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "keyUnique")
    private List<KeyIssued> keyIssued;

    @Column(name = "DATE_ADDED")
    private LocalDate dateAdded;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KEY_ID")
    private Key key;

    @Column(name = "NUM_ISSUED")
    private Integer numIssued;

    public void setNumIssued(Integer numIssued) {
        this.numIssued = numIssued;
    }

    public Integer getNumIssued() {
        return numIssued;
    }

    public Boolean getIsIssued() {
        return isIssued;
    }
    public void setIsIssued (Boolean i) {this.isIssued = i;}
    public List<KeyIssued> getKeyIssued() {
        return keyIssued;
    }

    public void setKeyIssued(List<KeyIssued> keyIssued) {
        this.keyIssued = keyIssued;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }
}