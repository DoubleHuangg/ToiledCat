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
@Table(name = "declare_customs")
public class DeclareCustoms {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "customs_list")
    private String customsList;
    @Column(name = "invoice")
    private String invoice;
    @Column(name = "contract")
    private String contract;
    @Column(name = "bill")
    private String bill;
}
