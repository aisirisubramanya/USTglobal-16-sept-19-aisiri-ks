package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Product productDetails=entityManager.find(Product.class, 1);
		
		System.out.println("Id---------->"+productDetails.getPid());
		System.out.println("Name-------->"+productDetails.getPname());
		System.out.println("Quantity---->"+productDetails.getQuntity());
		
		entityManager.close();
		
	}
}
