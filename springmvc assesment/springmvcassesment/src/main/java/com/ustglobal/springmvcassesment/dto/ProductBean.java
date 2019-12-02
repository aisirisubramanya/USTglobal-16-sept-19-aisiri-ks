package com.ustglobal.springmvcassesment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class ProductBean {
	
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	@Column
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private List<UserBean> user;
	public List<UserBean> getUser() {
		return user;
	}
	public void setUser(List<UserBean> user) {
		this.user = user;
	}
	
}
