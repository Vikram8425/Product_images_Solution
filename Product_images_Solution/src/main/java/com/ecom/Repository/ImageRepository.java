package com.ecom.Repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Model.Image;
import com.ecom.Model.Product;
import com.ecom.Model.Product_images;

public interface ImageRepository extends JpaRepository<Image,Integer> {

	
}
