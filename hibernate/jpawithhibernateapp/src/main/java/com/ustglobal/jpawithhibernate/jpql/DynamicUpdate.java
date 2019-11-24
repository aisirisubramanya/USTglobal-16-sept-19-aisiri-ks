package com.ustglobal.jpawithhibernate.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {
	public static void main(String[] args) {
		
		String jpql="update Product set pname=:name where pid=:id";
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			
			entityTransaction.begin();
			
			Query query=entityManager.createQuery(jpql);
			
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter id");
			int id=sc.nextInt();
			query.setParameter("name", name);
			query.setParameter("id",id);
			
			int result=query.executeUpdate();
			System.out.println(result);
			
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		finally {
			entityManager.close();
		}	}
}
