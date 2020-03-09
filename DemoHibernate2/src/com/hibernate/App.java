package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//import com.testing.DemoHibernate.Student;

public class App {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("varshil");
		employee.setVertical("JAB");

		Pc pc = new Pc();
		pc.setId(103);
		pc.setPcBrand("DELL");
		
		Configuration configure = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Pc.class);
		//Configuration configure = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configure.getProperties()).buildServiceRegistry();
		SessionFactory sf = configure.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		session.save(pc);
		tx.commit();
		
	}
}
