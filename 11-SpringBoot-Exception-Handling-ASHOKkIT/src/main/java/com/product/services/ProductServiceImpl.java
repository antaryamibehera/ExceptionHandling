package com.product.services;

import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exception.NoProductFoundException;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProductById(int pid) {
		if (pid == 101) {
			return new Product(101, "Keyboard", 800.00);
		}
		throw new NoProductFoundException("No product found");
	}

}
