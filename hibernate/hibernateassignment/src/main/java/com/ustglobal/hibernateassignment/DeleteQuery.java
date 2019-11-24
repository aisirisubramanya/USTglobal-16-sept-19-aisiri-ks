package com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.StudentInfo;

public class DeleteQuery {
	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			StudentInfo stu=entityManager.find(StudentInfo.class, 2);
			
			entityManager.remove(stu);
			
			System.out.println("record deleted");
			entityTransaction.commit();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
	}
}
