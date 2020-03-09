package com.testing.DemoHibernate;

//import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {

		StudentFullName fullname = new StudentFullName();

		// fullname.setFname("meet");
		// fullname.setMname("h");
		// fullname.setLname("patel");
		//

		Student student = new Student();

		// student.setRollNo(2);
		// student.setName(fullname);// ("veer");
		// student.setMarks(2);

		Configuration configure = new Configuration().configure().addAnnotatedClass(Student.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configure.getProperties())
				.buildServiceRegistry();// you can create object

		SessionFactory sessionfactory = configure.buildSessionFactory(reg);

		Session session = sessionfactory.openSession();

		Transaction transaction = session.beginTransaction();

		student = (Student) session.get(Student.class, 1);
		System.out.println(student);
		transaction.commit();
		session.close();

		Session session2 = sessionfactory.openSession();

		Transaction transaction2 = session2.beginTransaction();

		student = (Student) session2.get(Student.class, 1);
		System.out.println(student);
		transaction2.commit();
		session2.close();

		// session.save(student);

	}
}
