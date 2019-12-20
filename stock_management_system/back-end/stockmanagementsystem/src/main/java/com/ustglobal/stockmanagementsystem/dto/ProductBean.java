package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class ProductBean {
	
	@GeneratedValue
	@Id
	@Column
	private int pid;
	
	@Column(unique = true)
	private String pname;
	
	@Column
	private String category;
	
	@Column
	private String company;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="product_order",joinColumns = @JoinColumn(name="pid"),inverseJoinColumns = @JoinColumn(name="oid"))
	private List<OrderBean> order;

	public List<OrderBean> getOrder() {
		return order;
	}

	public void setOrder(List<OrderBean> order) {
		this.order = order;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
