package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.OrderBean;

public interface OrderDAO {
	
	public boolean addOrder(OrderBean bean);
	
	public List<OrderBean> getAll();
	
	public OrderBean getById(int oid);
}
