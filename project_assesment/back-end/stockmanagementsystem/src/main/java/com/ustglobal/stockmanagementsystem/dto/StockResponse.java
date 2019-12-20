package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

public class StockResponse {
	
	private int statusCode;
	
	private String message;
	
	private String description;
	
	private List<ProductBean> productBeans;
	
	private List<OrderBean> orderBeans;

	public List<OrderBean> getOrderBeans() {
		return orderBeans;
	}

	public void setOrderBeans(List<OrderBean> orderBeans) {
		this.orderBeans = orderBeans;
	}

	public List<ProductBean> getProductBeans() {
		return productBeans;
	}

	public void setProductBeans(List<ProductBean> productBeans) {
		this.productBeans = productBeans;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
