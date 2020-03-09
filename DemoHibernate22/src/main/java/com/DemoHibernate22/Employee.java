package com.DemoHibernate22;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String vertical;
//	@OneToOne
//	private Pc pc;
	@OneToMany(mappedBy="employee")
	private List<Pc> pc= new ArrayList<Pc>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
//public Pc getPc() {
//	return pc;
//}
//
//public void setPc(Pc pc) {
//	this.pc=pc;
//}
	
	public List<Pc> getPc() {
		return pc;
	}

	public void setPc(List<Pc> pc) {
		this.pc = pc;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", vertical=" + vertical + ", pc=" + pc + "]";
	}

}
