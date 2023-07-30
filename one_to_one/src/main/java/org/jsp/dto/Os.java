package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Os {

	
    @Id
	private int Id;
	private int bit;
	private String name;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Os [Id=" + Id + ", bit=" + bit + ", name=" + name + "]";
	}
	
	
	
	
	
}
