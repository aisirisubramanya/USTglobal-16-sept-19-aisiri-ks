package com.ustglobal.springmvcassesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassesment.dao.UserDAO;
import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.UserBean;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public UserBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(UserBean bean) {
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	@Override
	public ProductBean searchProduct(int pid) {
		return dao.searchProduct(pid);
	}

	@Override
	public int orderProduct(OrderBean bean) {
		return dao.orderProduct(bean);
	}
}
