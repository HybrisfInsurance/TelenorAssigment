package com.telenor.app.product.filtering.productfiltering.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telenor.app.product.filtering.productfiltering.dao.ProductDAO;
import com.telenor.app.product.filtering.productfiltering.model.Product;
import com.telenor.app.product.filtering.productfiltering.model.Products;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
	@Autowired
	private ProductDAO productDao;

	@GetMapping(path = "/", produces = "application/json")
	public Products getEmployees(@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "max_price", required = false) String max_price,
			@RequestParam(value = "min_price", required = false) String min_price,
			@RequestParam(value = "city", required = false) String city) {
		Products allProduct = productDao.getAllProducts();
		List<Product> allProducts = productDao.getAllProducts().getProductList();
		List<Product> typeFilteredProducts = new ArrayList<Product>();
		List<Product> priceFilteredProducts = new ArrayList<Product>();
		List<Product> cityFilteredProducts = new ArrayList<Product>();
		List<Product> finalFilteredProducts = new ArrayList<Product>();
		if (type != null) {
			for (Product product : allProducts) {
				if (type.equals(product.getType())) {
					typeFilteredProducts.add(product);
				}
			}
		}
		if (max_price != null || min_price != null) {
			if (max_price != null && min_price != null) {
				Integer max_amount = Integer.parseInt(max_price);
				Integer min_amount = Integer.parseInt(min_price);
				for (Product product : allProducts) {
					if (max_amount > product.getPrice() && min_amount < product.getPrice()) {
						priceFilteredProducts.add(product);
					}
				}
			} else if (max_price != null) {
				Integer max_amount = Integer.parseInt(max_price);
				for (Product product : allProducts) {
					if (max_amount > product.getPrice()) {
						priceFilteredProducts.add(product);
					}
				}
			} else {
				Integer min_amount = Integer.parseInt(min_price);
				for (Product product : allProducts) {
					if (min_amount < product.getPrice()) {
						priceFilteredProducts.add(product);
					}
				}
			}
		}

		if (city != null) {
			for (Product product : allProducts) {
				if (city.equals(product.getCity())) {
					cityFilteredProducts.add(product);
				}
			}
		}
		finalFilteredProducts = validateParams(typeFilteredProducts, priceFilteredProducts, cityFilteredProducts);
		if (finalFilteredProducts != null) {
			allProduct.setEmployeeList(finalFilteredProducts);
		} else {
			allProduct.setEmployeeList(allProducts);
		}
		return allProduct;
	}

	public List<Product> validateParams(List<Product> typeFilteredProducts, List<Product> priceFilteredProducts,
			List<Product> cityFilteredProducts) {
		int typeSize = typeFilteredProducts.size();
		int priceSize = priceFilteredProducts.size();
		int citySize = cityFilteredProducts.size();

		if (typeSize > 0 && priceSize > 0 && citySize > 0) {
			typeFilteredProducts.retainAll(priceFilteredProducts);
			typeFilteredProducts.retainAll(cityFilteredProducts);
			return typeFilteredProducts;
		} else if (typeSize == 0 && priceSize > 0 && citySize > 0) {
			priceFilteredProducts.retainAll(cityFilteredProducts);
			return priceFilteredProducts;
		} else if (typeSize > 0 && priceSize == 0 && citySize > 0) {
			typeFilteredProducts.retainAll(cityFilteredProducts);
			return typeFilteredProducts;
		} else if (typeSize > 0 && priceSize > 0 && citySize == 0) {
			typeFilteredProducts.retainAll(priceFilteredProducts);
			return typeFilteredProducts;
		} else if (typeSize == 0 && priceSize == 0 && citySize == 0) {
			return null;
		} else if (typeSize == 0 && priceSize == 0 && citySize > 0) {
			return cityFilteredProducts;
		} else if (typeSize > 0 && priceSize == 0 && citySize == 0) {
			return typeFilteredProducts;
		} else if (typeSize == 0 && priceSize > 0 && citySize == 0) {
			return priceFilteredProducts;
		}
		return null;
	}

}