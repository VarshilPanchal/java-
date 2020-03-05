package com.example.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import javax.swing.text.html.parser.Entity;
public class App {
	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
		 Student student =new Student();
		 student.setId(15);
		 student.setName("qwertty");
		 student.setMarks(23);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("puqw");

		EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();

		em.persist(student);
		 

		 em.getTransaction().commit();

		System.out.println(student);
	}
}
