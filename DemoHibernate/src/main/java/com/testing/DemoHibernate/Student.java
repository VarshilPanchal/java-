package com.testing.DemoHibernate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.mysql.cj.protocol.Resultset.Concurrency;

@Entity(name = "student_table") // table name derived from entity name
// @Table
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student // class name
{
	@Id
	private int rollNo;
	//@Column(name = "student_name")
	// @Transient //used to store temporary data , that data will not going to store
	// in table
	private StudentFullName name;
	@Column(name = "student_marks")
	private int marks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//
	// public String getName() {
	// return name;
	// }
	// public void setName(String name) {
	// this.name = name;
	// }
	public void setName(StudentFullName name) {
		this.name = name;
	}

	public StudentFullName getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}
