package com.ustglobal.jpawithhibernateapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomanyormanytoone.Pencil;
import com.ustglobal.jpawithhibernate.onetomanyormanytoone.PencilBox;


public class TestManyToOne {
	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		PencilBox pb=new PencilBox();
		pb.setBid(10);
		pb.setBname("doms");
		
		Pencil p1=new Pencil();
		p1.setPid(1);
		p1.setColor("red");
		p1.setPencilBox(pb);
		
		Pencil p2=new Pencil();
		p2.setPid(2);
		p2.setColor("blue");
		p2.setPencilBox(pb);
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(p1);
//			entityManager.persist(p2);
			PencilBox box=entityManager.find(PencilBox.class, 10);
			List<Pencil> list= box.getPencil();
			for(Pencil i:list) {
				System.out.println(i.getPid());
			}
			System.out.println("record saved");
			entityTransaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
