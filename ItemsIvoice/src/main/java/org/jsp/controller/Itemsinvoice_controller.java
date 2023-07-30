package org.jsp.controller;

import org.jsp.dao.ItemsInvoice_dao;
import org.jsp.dto.Invoice;
import org.jsp.dto.Items;

public class Itemsinvoice_controller {

	public static void main(String[] args) {
		
		Items it=new Items();
		
		it.setId(1);
		it.setName("flower");
		it.setBrand("lotus");
		it.setPrice(16);
		
		
		
		
		Invoice in=new Invoice();
		in.setId(1028);
		in.setName2("karan");
		in.setAddress("dombiwali");
		
		
		it.setInvoice(in);
		//in.setItems(it);
		
		
		ItemsInvoice_dao id=new ItemsInvoice_dao();
		
		//id.saveItems(it);
		
		//id.saveInvoice(in);
		
		//fid
		
		//id.FindItems(1);
		
		//update
		
		//id.UpdateItems(it);
		
		//id.UpdateInvoice(in);
		
		//delete
		
		//id.DeleteItems(1);
	 //	id.DeleteInvoice(1);
		
		// find all
		id.FindAllItems();
		
	}
	
}

/// how i can make my interface as functional interface
