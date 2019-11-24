package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class SelectJPQLQuery {
	public static void main(String[] args) {

		//		String jpql="from Product";

		String jpql="select pname from Product";


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery(jpql);
		List<String> list=query.getResultList();
		for(String i:list) {
			//			System.out.println(i.getPid());
			System.out.println(i);
			//			System.out.println(i.getQuntity());
			System.out.println("**********************");

		}
		entityManager.close();
	}
}
