package com.ustglobal.springmvcassesment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.UserBean;

@Repository
public class UserDaoImpl implements UserDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public UserBean login(int id, String password) {
		String jpql="from UserBean where id=:id and password=:pass";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			UserBean bean=(UserBean) query.getSingleResult();
			return bean;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int register(UserBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();

			return bean.getId();
		}
		catch (Exception e) {
			e.printStackTrace();

			return -1;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean bean=manager.find(UserBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public ProductBean searchProduct(int pid) {
		EntityManager manager=factory.createEntityManager();
		return manager.find(ProductBean.class, pid);
	}

	@Override
	public UserBean products(int id) {
		EntityManager manager=factory.createEntityManager();
		return manager.find(UserBean.class, id);
	}

}
