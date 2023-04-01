package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Model.Order;
import com.ecom.Model.User;

public interface OrderRepository extends JpaRepository<Order,Integer>{
	
	List<Order> findByUser(User user);

}
