package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2019/2/24 0024.
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(exclude = {"createDate", "lastModifiedDate", "createdBy", "lastModifiedBy"})
@EntityListeners(AuditingEntity.class)
public abstract class AuditingEntity {
    @JsonIgnore
    @Column(name = "CREATED_DATE")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @JsonIgnore
    @Column(name = "LAST_MODIFIED_DATE")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @JsonIgnore
    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;

    @JsonIgnore
    @Column(name = "LAST_MODIFIED_BY")
    @LastModifiedBy
    private String lastModifiedBy;
}
