package com.vins.university.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by vova on 7/30/2016.
 */
@MappedSuperclass // THIS is needed so all derived classes inherit properties
public abstract class BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    protected int id;

    protected String createdBy;

    public int getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id=").append(id);
        sb.append(", createdBy='").append(createdBy).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
