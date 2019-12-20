package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderBean {

	@GeneratedValue
	@Id
	@Column
	private int oid;
	
	@Column
	private double total_price;
	
	@Column
	private double gst_price;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "order")
	private List<ProductBean> product;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	
	
	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getGst_price() {
		return gst_price;
	}

	public void setGst_price(double gst_price) {
		this.gst_price = gst_price;
	}

	public List<ProductBean> getProduct() {
		return product;
	}

	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}

}
