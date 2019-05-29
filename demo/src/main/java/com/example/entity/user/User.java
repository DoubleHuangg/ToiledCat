package com.example.entity.user;

import com.example.entity.AuditingEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/23 0023.
 */
@Data
@Entity
@Table(name = "user")
public class User extends AuditingEntity implements Serializable{

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "department")
    private String department;
    @Column(name = "phone")
    private String phone;

}
