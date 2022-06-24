package com.thoughti.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughti.demo.model.Item;
import com.thoughti.demo.model.Orders;

public interface ItemsRepo extends JpaRepository<Item, Integer>{


}
