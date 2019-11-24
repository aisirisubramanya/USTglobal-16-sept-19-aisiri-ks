package com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.StudentInfo;

public class SelectQuery {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		StudentInfo stu=entityManager.find(StudentInfo.class, 1);
		
		System.out.println("Id---------->"+stu.getUsn());
		System.out.println("Name-------->"+stu.getName());
		System.out.println("Quantity---->"+stu.getBranch());
		
		entityManager.close();
		
	}
}
