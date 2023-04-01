package com.ecom.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String imageName;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Product_images>product_image1=new HashSet<>();
    
	public Set<Product_images> getProduct_image1() {
		return product_image1;
	}
	public void setProduct_image1(Set<Product_images> product_image1) {
		this.product_image1 = product_image1;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Set<Product_images> getProduct_image() {
		return product_image1;
	}
	public void setProduct_image(Set<Product_images> product_image) {
		this.product_image1 = product_image;
	}
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY,mappedBy ="productImage")
	private Set<Product_images> product_image=new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
