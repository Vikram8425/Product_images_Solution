package com.ecom.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Product_images {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productImageid;
	@ManyToOne(fetch = FetchType.EAGER)
	private Product product;
	@ManyToOne
	private Image productImage;
	public int getProductImageid() {
		return productImageid;
	}
	public void setProductImageid(int productImageid) {
		this.productImageid = productImageid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Image getProductImage() {
		return productImage;
	}
	public void setProductImage(Image productImage) {
		this.productImage = productImage;
	}
}
