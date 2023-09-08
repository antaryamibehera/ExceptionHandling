package com.product.services;

import org.springframework.stereotype.Service;

import com.product.entity.Product;
@Service
public interface ProductService {
	public Product findProductById(int pid);
}
