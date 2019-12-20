package com.ustglobal.stockmanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagementsystem.dto.ProductBean;
import com.ustglobal.stockmanagementsystem.dto.StockResponse;
import com.ustglobal.stockmanagementsystem.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path="/addproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody ProductBean bean) {
		StockResponse response=new StockResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added to the db");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not added to the db");
		}
		return response;
	}
	
	@PutMapping(path="/updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse updateProduct(@RequestBody ProductBean bean) {
		StockResponse response=new StockResponse();
		if(service.update(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data modified in the db");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not modified in the db");
		}
		return response;
	}
	
	@DeleteMapping(path="/delete/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse deleteEmployee(@PathVariable("pid")int pid) {
		StockResponse response=new StockResponse();
		if(service.deleteById(pid)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data deleted from the db");
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not deleted from the db");
		}
		return response;
	}
	
	@GetMapping(path="/getname",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getByName(@RequestParam("pname")String pname) {
		StockResponse response=new StockResponse();
		ProductBean bean=service.getByName(pname);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProductBeans(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/getcategory",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getByCategory(@RequestParam("category")String category) {
		StockResponse response=new StockResponse();
		List<ProductBean> bean=service.getByCategory(category);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProductBeans(bean);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/getcompany",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getByCompany(@RequestParam("company")String company) {
		StockResponse response=new StockResponse();
		List<ProductBean> bean=service.getByCompany(company);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProductBeans(bean);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/get-allproduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getAll(){
		StockResponse response=new StockResponse();
		List<ProductBean> beans=service.getAll();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProductBeans(beans);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}

}
