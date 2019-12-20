package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.ProductBean;

public interface ProductService {
	
	public boolean addProduct(ProductBean bean);
	
	public boolean update(ProductBean bean);
	
	public boolean deleteById(int pid);
	
	public ProductBean getByName(String pname);
	
	public List<ProductBean> getByCategory(String category);
	
	public List<ProductBean> getByCompany(String company);
	
	public List<ProductBean> getAll();
}
