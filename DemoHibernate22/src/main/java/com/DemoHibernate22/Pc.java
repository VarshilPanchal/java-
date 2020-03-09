package com.DemoHibernate22;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

//import com.DemoHibernate3.Employee;

//import org.hibernate.annotations.Entity;

@Entity
public class Pc {
	@Id
	private int id;
	private String pcBrand;
	@ManyToMany
	private List<Employee> employee= new ArrayList<Employee>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPcBrand() {
		return pcBrand;
	}

	public void setPcBrand(String pcBrand) {
		this.pcBrand = pcBrand;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Pc [id=" + id + ", pcBrand=" + pcBrand + "]";
	}

}
