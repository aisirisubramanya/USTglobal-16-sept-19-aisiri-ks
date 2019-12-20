package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagementsystem.dto.OrderBean;

@Repository
public class OrderDaoImpl implements OrderDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public List<OrderBean> getAll() {
		String jpql="from OrderBean";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<OrderBean> query=manager.createQuery(jpql,OrderBean.class);
			List<OrderBean> o=query.getResultList();
			return o;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public OrderBean getById(int oid) {
		EntityManager manager=factory.createEntityManager();
		try {
			OrderBean o=manager.find(OrderBean.class, oid);
			return o;
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean addOrder(OrderBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
			
		}catch (Exception e) {
			return false;
		}
	}

}
