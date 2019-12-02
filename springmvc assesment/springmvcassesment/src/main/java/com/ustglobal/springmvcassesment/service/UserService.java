package com.ustglobal.springmvcassesment.service;

import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.UserBean;

public interface UserService {
	public UserBean login(int id,String password);
	public int register(UserBean bean);
	public boolean changePassword(int id,String password);
	public ProductBean searchProduct(int pid);
	public int orderProduct(OrderBean bean);
}
