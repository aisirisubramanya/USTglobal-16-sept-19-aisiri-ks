package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystem.dao.ProductDAO;
import com.ustglobal.stockmanagementsystem.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean update(ProductBean bean) {
		return dao.update(bean);
	}

	@Override
	public boolean deleteById(int pid) {
		return dao.deleteById(pid);
	}

	@Override
	public ProductBean getByName(String pname) {
		return dao.getByName(pname);
	}

	@Override
	public List<ProductBean> getByCategory(String category) {
		return dao.getByCategory(category);
	}

	@Override
	public List<ProductBean> getByCompany(String company) {
		return dao.getByCompany(company);
	}

	@Override
	public List<ProductBean> getAll() {
		return dao.getAll();
	}
	
	
}
