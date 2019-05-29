package com.example.entity.order;

/**
 * Created by Administrator on 2019/2/24 0024.
 */

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "transport")
public class Transport {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "odd_numbers")
    private Integer oddNumber;
    @Column(name = "freight")
    private Integer freight;
}
