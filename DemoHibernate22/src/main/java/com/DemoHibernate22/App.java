package com.DemoHibernate22;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//import com.DemoHibernate3.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Pc pc = new Pc();
		pc.setId(104);
		pc.setPcBrand("SAMSUNG");
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("meet");
		employee.setVertical("JAB");
		employee.getPc().add(pc);

		pc.getEmployee().add(employee);

		Configuration configure = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Pc.class);
		// Configuration configure = new
		// Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configure.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = configure.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		session.save(pc);

		System.out.println(employee);
		System.out.println(pc);
		tx.commit();
	}
}
