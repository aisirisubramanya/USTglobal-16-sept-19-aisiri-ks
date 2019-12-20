package com.ustglobal.stockmanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stockmanagementsystem.dto.StockResponse;

@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
	public StockResponse getException() {
		StockResponse response=new StockResponse();
		response.setStatusCode(501);
		response.setMessage("error in code");
		response.setDescription("got an exception");
		return response;
	}
}
