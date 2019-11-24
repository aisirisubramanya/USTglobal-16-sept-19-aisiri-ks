package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;


public class TestManyToMany {

	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		Course c1=new Course();
		c1.setCid(1);
		c1.setCname("java");

		Course c2=new Course();
		c2.setCid(2);
		c2.setCname("sql");

		Course c3=new Course();
		c3.setCid(3);
		c3.setCname("jdbc");

		ArrayList<Course> al=new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		al.add(c3);

		Student s1=new Student();
		s1.setSid(10);
		s1.setSname("uday");
		s1.setCourse(al);

		Student s2=new Student();
		s2.setSid(20);
		s2.setSname("preetham");
		s2.setCourse(al);

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);
			entityManager.persist(s2);
			System.out.println("record saved");
			entityTransaction.commit();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
