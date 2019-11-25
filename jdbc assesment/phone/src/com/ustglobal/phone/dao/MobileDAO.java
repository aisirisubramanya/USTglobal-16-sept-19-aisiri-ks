package com.ustglobal.phone.dao;

import java.util.List;

import com.ustglobal.phone.dto.MobileBean;

public interface MobileDAO {

	public List<MobileBean> allDetails();
	public MobileBean searchContact(String s);
	
	public int insertContact(MobileBean m);
	public int updateContact(MobileBean m);
	public int deleteContact(MobileBean m);
	
	
}
