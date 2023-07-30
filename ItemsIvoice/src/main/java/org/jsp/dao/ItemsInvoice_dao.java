package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Invoice;
import org.jsp.dto.Items;



import org.jsp.dto.Items;
import org.jsp.dto.Invoice;

public class ItemsInvoice_dao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("ITEMS");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	    // save ==============================================================================================
	
		public void saveItems(Items items  ) {
			transaction.begin();
			manager.persist(items);
			transaction.commit();
			
		}
		
		public void saveInvoice(Invoice invoice ) {
			transaction.begin();
			Items items=invoice.getItems();  //imp 
			items.setInvoice(invoice); //imp
			manager.persist(invoice);
			transaction.commit();
			
		}
		
		// Find with ID =========================================================================================
		
		public void FindItems(int id) {
			Items it=manager.find(Items.class,id);
			System.out.println(it);

		}
		
		public void FindInvoice(int id) {
			Invoice in=manager.find(Invoice.class,id);
			System.out.println(in);

		}
		
		//UPDATE    ================================================================================================
		
		public void UpdateItems(Items items) {
			transaction.begin();
			manager.merge(items);
			transaction.commit();
			
		}
		
		public void UpdateInvoice( Invoice invoice) {
			transaction.begin();
			manager.merge(invoice);
			transaction.commit();
			
		}
		
		//DELETE    ================================================================================================
		
		public void DeleteItems(int id) {
			Items items=manager.find(Items.class, id);
			System.out.println(items);
			
			if (items!=null) {
				manager.remove(items);
				transaction.commit();
				
			} else {
                  System.out.println(" id not found ");
			}
				
			
		}
		
		
		public void DeleteInvoice(int id) {
			Invoice invoice=manager.find(Invoice.class, id);
			System.out.println(invoice);
			
			if (invoice!=null) {
				manager.remove(invoice);
				transaction.commit();
				
			} else {
                  System.out.println(" id not found ");
			}
				
			
		}
		
		
		// Find all     ================================================================================================
		public void FindAllItems() {
		Query 	query=manager.createQuery(" select d from Items d");
		List<Items> l=query.getResultList();
		System.out.println(l);
			
		}
	
}
