package com.example.repository;

import com.example.entity.customer.Customer;

import java.util.List;

/**
 * Created by 一只芬达 on 2019/3/5.
 */
public interface CustomerRepository extends BaseRepository<Customer, Integer> {

    List<Customer> findByIdOrName(Integer id, String name);
}
