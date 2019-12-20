package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagementsystem.dto.ProductBean;

@Repository
public class ProductDaoImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductBean bean) {
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

	@Override
	public boolean update(ProductBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			ProductBean b=manager.find(ProductBean.class, bean.getPid());
			b.setPname(bean.getPname());
			b.setCategory(bean.getCategory());
			b.setCompany(bean.getCompany());
			b.setQuantity(bean.getQuantity());
			b.setPrice(bean.getPrice());
			transaction.commit();
			return true;
			
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteById(int pid) {
		EntityManager manager=factory.createEntityManager();
		try {
			ProductBean b=manager.find(ProductBean.class,pid);
			manager.remove(b);
			
			return true;
			
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductBean getByName(String pname) {
		
		String jpql="from ProductBean where pname=:pname";
		EntityManager manager=factory.createEntityManager();
		
		try {
			TypedQuery<ProductBean> query=manager.createQuery(jpql,ProductBean.class);
			ProductBean b=query.getSingleResult();
			return b;
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductBean> getAll() {
		String jpql="from ProductBean";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<ProductBean> query=manager.createQuery(jpql,ProductBean.class);
			List<ProductBean> pb=query.getResultList();
			return pb;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductBean> getByCategory(String category) {
		String jpql="from ProductBean where category=:category";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<ProductBean> query=manager.createQuery(jpql,ProductBean.class);
			List<ProductBean> pb =query.getResultList();
			return pb;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductBean> getByCompany(String company) {
		String jpql="from ProductBean where company=:company";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<ProductBean> query=manager.createQuery(jpql, ProductBean.class);
			List<ProductBean> pb=query.getResultList();
			return pb;
		} catch (Exception e) {
			return null;
		}
	}

}
