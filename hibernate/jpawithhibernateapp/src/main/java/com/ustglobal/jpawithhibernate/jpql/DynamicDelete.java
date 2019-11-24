package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
	public static void main(String[] args) {
		String jpql="delete from Product where pid=:id";

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();

			entityTransaction.begin();

			Query query=entityManager.createQuery(jpql);
			
			query.setParameter("id", 1);

			int result=query.executeUpdate();
			System.out.println(result);

			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		finally {
			entityManager.close();
		}
	}
}
