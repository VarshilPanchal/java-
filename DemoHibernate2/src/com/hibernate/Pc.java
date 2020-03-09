package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;

@Entity
public class Pc {
	@Id
	private int id;
	private String pcBrand;

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

	@Override
	public String toString() {
		return "Pc [id=" + id + ", pcBrand=" + pcBrand + "]";
	}

}
