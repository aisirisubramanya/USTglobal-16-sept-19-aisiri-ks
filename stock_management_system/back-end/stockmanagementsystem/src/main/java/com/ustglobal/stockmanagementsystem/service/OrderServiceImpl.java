package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystem.dao.OrderDAO;
import com.ustglobal.stockmanagementsystem.dto.OrderBean;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDAO dao;
	
	@Override
	public List<OrderBean> getAll() {
		return dao.getAll();
	}

	@Override
	public OrderBean getById(int oid) {
		return dao.getById(oid);
	}

	@Override
	public boolean addOrder(OrderBean bean) {
		return dao.addOrder(bean);
	}

}
