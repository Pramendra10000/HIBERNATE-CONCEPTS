package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import org.jsp.dto.Os;
import org.jsp.dto.mobile;



public class Mobile_os_dao {

	private EntityManagerFactory EMF=Persistence.createEntityManagerFactory("one");
	private  EntityManager EM=EMF.createEntityManager();
	private EntityTransaction ET=EM.getTransaction();
	
	
	public void saveMobile(mobile mobile) {
		ET.begin();
		EM.persist(mobile);
		ET.commit();
	}
	// for os  saveOs
	public void saveOs(Os os) {
		ET.begin();
		EM.persist(os);
		ET.commit();
	}
	
	public void Updatemobile(mobile mobile) {
		ET.begin();
		EM.merge(mobile);
		ET.commit();

	}
	// for os  UpdateOs
	public void UpdateOs(Os os) {
		ET.begin();
		EM.merge(os);
		ET.commit();

	}
	
	
	public void Findmobile(int id) {
		mobile mobile=EM.find(mobile.class,id);
		System.out.println(mobile);

	}
	
	// for os  FindOs
	public void FindOs(int Id) {
		Os os2=EM.find(Os.class, Id);
		System.out.println(os2);

	}
	
	
	//==== delete method
	
	
	public void deletemobile(int id) {
		mobile mobile=EM.find(mobile.class,id);
		System.out.println(mobile);

		if (mobile!=null) {
		EM.remove(mobile);	
		ET.commit();
		} else {
          System.out.println("Object not found");
		}
	}
	
	
	public void findAll() {
		Query qr=EM.createQuery("select s from mobile s");
		List<mobile> l=qr.getResultList();
		System.out.println(l);
	}
	
	public List<mobile> findAll2() {
		Query qr=EM.createQuery("select s from mobile s");
		List<mobile> l=qr.getResultList();
		//System.out.println(l);
		return l;
	}
	
	
}
