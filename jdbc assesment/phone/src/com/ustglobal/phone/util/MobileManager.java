package com.ustglobal.phone.util;

import com.ustglobal.phone.dao.MobileDAO;
import com.ustglobal.phone.dao.MobileDAOImpl;

public class MobileManager {

	private MobileManager() {
		
	}
	
	public static MobileDAO getInstance() {
		return new MobileDAOImpl();
	}
	
}
