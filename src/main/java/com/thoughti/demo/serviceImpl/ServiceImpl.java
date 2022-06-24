package com.thoughti.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.thoughti.demo.model.Item;
import com.thoughti.demo.model.Orders;
import com.thoughti.demo.repo.ItemsRepo;
import com.thoughti.demo.repo.OrdersRepo;
import com.thoughti.demo.service.IService;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private OrdersRepo ordersRepo;

	@Autowired
	private ItemsRepo itemsRepo;

	@Override
	public List<Orders> placeOrder(List<Orders> order) {

		for (Orders orders : order) {

			Orders orderObj = (Orders) ordersRepo.save(orders);

			for (Item itemObjs : orders.getItems()) {
				itemObjs.setOrder(orderObj);
				itemsRepo.save(itemObjs);
			}
		}
		return order;
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return ordersRepo.findAll();
	}

	@Override
	public Optional<Orders> getAllOrders(int order_id) {
		// TODO Auto-generated method stub
		return ordersRepo.findById(order_id);
	}

}
