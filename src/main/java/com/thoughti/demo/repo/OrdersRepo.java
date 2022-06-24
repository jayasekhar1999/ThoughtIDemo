package com.thoughti.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughti.demo.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
