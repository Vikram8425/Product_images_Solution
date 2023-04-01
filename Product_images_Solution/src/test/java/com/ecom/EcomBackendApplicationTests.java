package com.ecom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecom.Model.Category;
import com.ecom.Model.Image;
import com.ecom.Model.Product;
import com.ecom.Model.Product_images;
import com.ecom.Repository.CategoryRepository;
import com.ecom.Repository.ProductRepository;
import com.ecom.Service.CategoryService;
import com.ecom.Service.ProductService;
import com.ecom.payload.CategoryDto;
import com.ecom.payload.ProductDto;

@SpringBootTest
@RunWith(SpringRunner.class)
class EcomBackendApplicationTests {
	
	@Autowired
	private CategoryService catService;
	@MockBean
	private CategoryRepository catRepo;
	@MockBean
	private ProductRepository pRepo;
	@MockBean
    private ProductService pService;
	@Autowired
	private ModelMapper mapper;
	@Test
    public void getByid() {
		
//		List<Category> l=new ArrayList<>();
//		Category cat=new Category();
//		  cat.setCategoryId(1);
//		  cat.setTitle("mobile");
//		  l.add(cat);
//   	when(catRepo.findAll()).thenReturn(l);
//   	assertEquals(1,catService.getAllCategory().size());

		
////    	Product p=new Product(1,"productName", "productDesc",122 ,true,
////    			21,true,"String imageName",cat);
//    	Product product=new Product();
//    	product.setCategory(cat);
//    	product.setImageName("vicky");
//    	product.setLive(false);
//    	product.setProductDesc("Bad Product");
//    	product.setProductId(1);
//    	//Set<Product_images> image=new HashSet<>();
//    	//Product_images pimage=new Product_images();
//    	//pimage.setProduct(product);
//    	//Image i=new Image();
//    	//i.setId(1);
//    	//i.setImageName("profile");
//    	//pimage.setProductImage(i);
//    	//pimage.setProductImageid(1);
//    	//product.setProductImage(image);
//    	product.setProductName("Ball");
//    	product.setProductPrize(21.21);
//    	product.setProductQuantity(12);
//    	product.setStock(false);
//    	ProductDto map = this.mapper.map(product,ProductDto.class);
//    	when(pRepo.save(product)).thenReturn(product);
//    	assertEquals(map,pService.createProduct(map,cat.getCategoryId()));
    	
		
		
		//List<Category> l=new ArrayList<>();
		Category cat=new Category();
		  cat.setCategoryId(1);
		  cat.setTitle("mobile");
		   
		  
		
		  CategoryDto map = this.mapper.map(cat,CategoryDto.class);
		  
   //	when(catRepo.save(cat)).thenReturn(saveCategory);
   	//System.out.print(map.getTitle());
   	//assertEquals(cat,catService.Create(map));

		
    }
}
