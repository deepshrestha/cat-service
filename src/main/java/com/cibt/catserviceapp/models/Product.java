package com.cibt.catserviceapp.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_products")
public class Product extends GenericEntity {

    @Column(name="product_name", nullable=false)
    private String productName;
    @Column(name="created_at", insertable=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name="updated_at", nullable=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Product(){}

    public Product(String productName, Date createdAt, Date updatedAt) {
        this.productName = productName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }
    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
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