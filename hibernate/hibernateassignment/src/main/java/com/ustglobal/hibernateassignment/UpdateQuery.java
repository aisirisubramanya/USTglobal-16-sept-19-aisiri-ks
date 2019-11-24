package com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.StudentInfo;


public class UpdateQuery {
	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			StudentInfo stu=entityManager.find(StudentInfo.class,1);
			
			stu.setName("Akshatha S");
			
			System.out.println("Updated record");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
