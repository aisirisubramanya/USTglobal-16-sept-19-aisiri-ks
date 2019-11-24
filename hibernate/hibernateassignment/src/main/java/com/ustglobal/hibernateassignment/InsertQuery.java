package com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.StudentInfo;

public class InsertQuery {
	public static void main(String[] args) {
		StudentInfo stu=new StudentInfo();
		stu.setUsn(1);
		stu.setName("Akshatha");
		stu.setBranch("cse");

		StudentInfo stu1=new StudentInfo();
		stu1.setUsn(2);
		stu1.setName("Anupama");
		stu1.setBranch("ise");

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(stu);
			entityManager.persist(stu1);
			System.out.println("record saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}


		entityManager.close();
	}
}
