package com.ustglobal.springmvcassesment.dao;

import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.UserBean;

public interface UserDAO {
	public UserBean login(int id,String password);
	public int register(UserBean bean);
	public ProductBean searchProduct(int pid);
	public boolean changePassword(int id,String password);
	public int orderProduct(OrderBean bean);
	public UserBean products(int id);
}
