package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		VoterCard v=new VoterCard();
		v.setVid(10);
		v.setVname("ram");
		Person p=new Person();
		p.setName("ram");
		p.setPid(1);
		p.setVoterCard(v);
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(p);
			VoterCard vc=entityManager.find(VoterCard.class, 10);
			System.out.println(vc.getPerson().getPid());
			System.out.println("record saved");
			entityTransaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
