package com.example.entity.order;

import com.example.entity.AuditingEntity;
import com.example.entity.customer.Customer;
import com.example.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/24 0024.
 */
@Data
@Entity
@Table(name = "order")
public class Order extends AuditingEntity implements Serializable{
    @Id
    @Column(name = "code")
    private String code;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "advance_charge_list")
    private String advanceChargeList;
    @Column(name = "purchase_orde_list")
    private String purchaseOrdeList;
    @Column(name = "shipment_list")
    private String shipmentList;
    @OneToOne
    @JoinColumn(name = "transport_id")
    private Transport transport;
    @OneToOne
    @JoinColumn(name = "declare_customs_id")
    private DeclareCustoms declareCustoms;
    @OneToOne
    @JoinColumn(name = "logistics_id")
    private Logistics logistics;
    @Column(name = "payment_term")
    private Integer paymentTerm;
    @Column(name = "price_basis")
    private Integer basisPrice;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "advance_charges")
    private Integer advanceCharges;
    @Column(name = "tail_charges")
    private Integer tailCharges;
}
