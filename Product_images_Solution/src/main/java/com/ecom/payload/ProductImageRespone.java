package com.ecom.payload;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.ecom.Model.Image;
import com.ecom.Model.Product;

public class ProductImageRespone {
	private ProductDto product;
	private ImageDto productImage;
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public ImageDto getProductImage() {
		return productImage;
	}
	public void setProductImage(ImageDto productImage) {
		this.productImage = productImage;
	}
	
	
}
