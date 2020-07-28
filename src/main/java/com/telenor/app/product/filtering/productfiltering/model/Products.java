package com.telenor.app.product.filtering.productfiltering.model;

import java.util.ArrayList;
import java.util.List;

public class Products {
	    private List<Product> productList;
	    
	    public List<Product> getProductList() {
	        if(productList == null) {
	        	productList = new ArrayList<>();
	        }
	        return productList;
	    }
	 
	    public void setEmployeeList(List<Product> productList) {
	        this.productList = productList;
	    }
	}

