package com.rainbow.cloud.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by caihongli on 2017/5/19.
 */
@MappedSuperclass
@Deprecated
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(columnDefinition = " timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
    protected Date createdAt = new Date();
    @Column(columnDefinition = " timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    protected Date updatedAt = new Date();

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
                '}';
    }
}
