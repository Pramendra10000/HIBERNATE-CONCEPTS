package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {

	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	private String name2;
	private String Address ;
	
	@OneToOne(mappedBy = "invoice" ,cascade = CascadeType.ALL)
	
	private Items items;
	
	// if we gettig stack ovr flow error so we have to remove alterate parts from aother i override .
	
	// if ot uderstad compare both class override.
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name2=" + name2 + ", Address=" + Address +"]";
	}
	
	
	
}
