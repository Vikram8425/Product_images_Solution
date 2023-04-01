package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Model.Product;
import com.ecom.Model.Product_images;

public interface ProductImageRepository extends JpaRepository<Product_images,Integer> {
   List<Product_images>findByProduct(Product product);
}
