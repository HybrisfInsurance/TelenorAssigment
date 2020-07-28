package com.telenor.app.product.filtering.productfiltering.model;

public class Product {
	
	private String type;
	private Integer min_price;
	private Integer max_price;
	private String city;
	
	private String properties;
	private Integer price;
	private String store_address;
	
	public Product() {
		
	}
	
	public Product(String type, String properties, Integer price, String store_address, String city) {
		super();
		this.type = type;
		this.properties = properties;
		this.price = price;
		this.store_address = store_address;
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getMin_price() {
		return min_price;
	}
	public void setMin_price(Integer min_price) {
		this.min_price = min_price;
	}
	public Integer getMax_price() {
		return max_price;
	}
	public void setMax_price(Integer max_price) {
		this.max_price = max_price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStore_address() {
		return store_address;
	}
	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", properties=" + properties + ", price=" + price + ", store_address="
				+ store_address + "]";
	}
	
	
	

}
