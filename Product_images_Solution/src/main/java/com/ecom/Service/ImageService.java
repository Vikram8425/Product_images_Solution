package com.ecom.Service;

import java.util.List;

import com.ecom.Model.Product_images;
import com.ecom.payload.ImageDto;
import com.ecom.payload.ProductImageRespone;


public interface ImageService {
	
 public ImageDto addImage(String imageName) ;
	
 public Product_images addImageToProduct(int pid,int imgId);
 
 public List< ProductImageRespone> downloadImage(int pid);
	
	

}
