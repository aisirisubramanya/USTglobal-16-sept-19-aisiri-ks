package com.ustglobal.stockmanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagementsystem.dto.OrderBean;
import com.ustglobal.stockmanagementsystem.dto.ProductBean;
import com.ustglobal.stockmanagementsystem.dto.StockResponse;
import com.ustglobal.stockmanagementsystem.service.OrderService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping(path="/addorder",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addEmployee(@RequestBody OrderBean bean) {
		StockResponse response=new StockResponse();
		if(service.addOrder(bean)) {
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
	
	@GetMapping(path="/get-allorder",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getAll(){
		StockResponse response=new StockResponse();
		List<OrderBean> beans=service.getAll();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setOrderBeans(beans);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/getoid",produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getById(@RequestParam("oid")int oid) {
		StockResponse response=new StockResponse();
		OrderBean bean=service.getById(oid);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setOrderBeans(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
}
