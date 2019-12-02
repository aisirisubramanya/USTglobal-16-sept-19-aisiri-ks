package com.ustglobal.springmvcassesment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="order")
public class OrderBean {
	
	@GeneratedValue
	@Id
	@Column
	private int oid;
	
	@Column
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uid",nullable = false)
	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid",nullable = false)
	private ProductBean productBean;

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}
	
}
