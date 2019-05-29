package com.example.entity.order;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2019/2/24 0024.
 */
@Data
@Entity
@Table(name = "logistics")
public class Logistics {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "odd_numbers")
    private Integer oddNumber;
    @Column(name = "voucher")
    private String voucher;
}
