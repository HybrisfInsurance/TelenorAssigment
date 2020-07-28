package com.telenor.app.product.filtering.productfiltering;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;

import com.telenor.app.product.filtering.productfiltering.model.Product;
import com.telenor.app.product.filtering.productfiltering.model.Products;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductfilteringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetAllProducts() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/product", HttpMethod.GET, entity,
				String.class);
		Assert.assertNotNull(response.getBody());
	}

	@Test
	public void testGetUserById() {
		Products product = restTemplate.getForObject(getRootUrl() + "/product?type=subscription&max_price=1000&city=Stockholm", Products.class);
		System.out.println(product.getProductList());
		Assert.assertNotNull(product);
	}
}
