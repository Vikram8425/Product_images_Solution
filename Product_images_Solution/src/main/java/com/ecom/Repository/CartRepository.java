package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Model.Cart;
import com.ecom.Model.User;

public interface CartRepository extends JpaRepository<Cart,Integer> {
	 Cart findByUser(User user);

}
