package com.ecom.Service.Imp;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Exception.ResourceNotFoundException;
import com.ecom.Model.Image;
import com.ecom.Model.Product;
import com.ecom.Model.Product_images;
import com.ecom.Repository.ImageRepository;
import com.ecom.Repository.ProductImageRepository;
import com.ecom.Repository.ProductRepository;
import com.ecom.Service.ImageService;
import com.ecom.payload.ImageDto;
import com.ecom.payload.ProductDto;
import com.ecom.payload.ProductImageRespone;
@Service
public class ImageServiceImp implements ImageService {
	@Autowired
	private ImageRepository imageRepo;
	@Autowired
    private ModelMapper modelMapper;
	@Autowired
	private ProductImageRepository productImgRepo;
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	
	public ImageDto addImage(String imageName) {
		 ImageDto imgDto=new ImageDto();
		 imgDto.setImageName(imageName);
		Image image= this.modelMapper.map(imgDto,Image.class);
		 Image save = this.imageRepo.save(image);
		ImageDto imagedto = this.modelMapper.map(save,ImageDto.class);
		return imagedto;
	}
	
	@Override
	public Product_images addImageToProduct(int pid, int imgId) {
		    Product product = this.productRepo.findById(pid).orElseThrow(()->new ResourceNotFoundException("Product not found by this productId"));
		    Image img = this.imageRepo.findById(imgId).orElseThrow(()->new ResourceNotFoundException("Image Not Fount By id"));  
		     Product_images pi=new Product_images();
		     pi.setProduct(product);
		     pi.setProductImage(img);
		    Product_images save = this.productImgRepo.save(pi);
		     
		    return save;
	}

	@Override
	public List<ProductImageRespone> downloadImage(int pid) {
		Product product = this.productRepo.findById(pid).orElseThrow(()->new ResourceNotFoundException("Product not Found by this id"));
		List<Product_images> findByProduct = this.productImgRepo.findByProduct(product);
		    	
		    	AtomicReference<Integer>count= new AtomicReference<>(0);
		     List<ProductImageRespone> collect = findByProduct.stream().map((e)->{
		    	  ProductImageRespone productresponse=new ProductImageRespone();
		    	  if(count.get()==0) {
		    	  productresponse.setProduct(this.modelMapper.map(e.getProduct(),ProductDto.class));
		    	  count.set(1);
		    	  }
		    	  productresponse.setProductImage(this.modelMapper.map(e.getProductImage(),ImageDto.class));
		    	  return productresponse;
		      }).collect(Collectors.toList());
		     
		findByProduct.stream().forEach((e)->{
			System.out.println("*********************");
			System.out.println(e.getProductImageid());
			System.out.println(e.getProductImage().getImageName());
			System.out.println("*********************");
		});
		
		return collect;
	}
	
	

}
