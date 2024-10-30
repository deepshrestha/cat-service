package com.cibt.catserviceapp.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_brands")
public class Brand extends GenericEntity {

    @Column(name = "brand_name", nullable = false)
    private String name;
    @Column(name = "status", nullable = false)
    private Boolean status;
    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Brand() {}

    public Brand(int id, String name, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}