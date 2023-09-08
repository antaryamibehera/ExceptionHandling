package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.services.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	public ProductServiceImpl service;

	@GetMapping("/getProduct")
	public Product getProductById(@RequestParam("pid") int pid) {
		return service.findProductById(pid);
	}
}
