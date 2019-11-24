package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReAttaching {
	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Product product=entityManager.find(Product.class, 1);
			
			System.out.println("is object present:"+entityManager.contains(product));//to check weather the object is present or not
			
			product.setPname("mobile");
			
			entityManager.detach(product);//used to detach the object.
			
			System.out.println("is object present:"+entityManager.contains(product));
			
			Product product2=entityManager.merge(product);//Re-attaching the object.
			
			product.setPname("pen");//after detaching it woun't update the database.
			
			product2.setPname("pen");//updating the value after re-attaching the object. 
			
			System.out.println("record updated");
			entityTransaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
