package com.sky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.domain.Product;
import com.sky.service.ProductService;

public class ProductController {
	@Autowired
private ProductService productService;
	
@RequestMapping(value = "/product", method = RequestMethod.GET,produces = "application/json")
public @ResponseBody List<Product> getProduct(){
	return productService.getProducts();
}
@RequestMapping(value = "/product", method = RequestMethod.POST,consumes = "application/json",produces = "application/jsonS")
public @ResponseBody Product addProduct(@RequestBody Product product) {
	System.out.println(product);
	productService.addProduct(product);
	return product;
	
	
	
}
}
