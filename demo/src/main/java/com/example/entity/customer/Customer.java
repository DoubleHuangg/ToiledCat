package com.example.entity.customer;

import com.example.entity.AuditingEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/24 0024.
 */
@Data
@Entity
@Table(name = "customer")
public class Customer extends AuditingEntity implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "company")
    private String company;
    @Column(name = "region")
    private String region;
    @Column(name = "email")
    private String email;
}
