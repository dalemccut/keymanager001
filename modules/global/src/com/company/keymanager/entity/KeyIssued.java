package com.company.keymanager.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@PublishEntityChangedEvents
@Table(name = "KEYMANAGER_KEY_ISSUED")
@Entity(name = "keymanager_KeyIssued")
public class KeyIssued extends StandardEntity {
    private static final long serialVersionUID = 2381329750239253618L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STAFF_ID")
    private Staff staff;

    @Column(name = "DATE_RETURNED")
    private LocalDate dateReturned;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_ISSUED", nullable = false)
    private Date dateIssued;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ISSUED_TO_SUPERVISOR_ID")
    private Staff supervisor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KEY_UNIQUE_ID")
    private KeyUnique keyUnique;

    public KeyUnique getKeyUnique() {
        return keyUnique;
    }

    public void setKeyUnique(KeyUnique keyUnique) {
        this.keyUnique = keyUnique;
    }

    public LocalDate getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(LocalDate dateReturned) {
        this.dateReturned = dateReturned;
    }

    public Staff getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Staff supervisor) {
        this.supervisor = supervisor;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}