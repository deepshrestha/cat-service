package com.cibt.catserviceapp.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_categories")
public class Category extends GenericEntity {

    @JoinColumn(name="parent_id", nullable=true)
    @ManyToOne(fetch=FetchType.EAGER)
    private Category parent;
    @Column(name="category_name")
    private String categoryName;
    @Column(name="status")
    private Boolean status;
    @Column(name="created_at", insertable=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="updated_at", nullable=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Category() {
    }

    public Category(String categoryName, Boolean status, Date createdAt, Date updatedAt, Category parent) {
        this.categoryName = categoryName;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.parent = parent;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }
    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
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
     * @return the updateAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * @param updateAt the updateAt to set
     */
    public void setUpdatedAt(Date updateAt) {
        this.updatedAt = updateAt;
    }
    /**
     * @return the parent
     */
    public Category getParent() {
        return parent;
    }
    /**
     * @param parent the parent to set
     */
    public void setParent(Category parent) {
        this.parent = parent;
    }


}