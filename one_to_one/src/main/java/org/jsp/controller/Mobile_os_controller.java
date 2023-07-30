package org.jsp.controller;

import java.util.List;

import org.jsp.dao.Mobile_os_dao;
import org.jsp.dto.Os;
import org.jsp.dto.mobile;

public class Mobile_os_controller {

	
	public static void main(String[] args) {
		mobile mb=new mobile();
		mb.setId(104);
		mb.setName("REDMI 11");
		mb.setColor("black");
		mb.setPrice(14500);
		
		Os os=new Os();
		os.setId(12);
		os.setBit(124);
		os.setName("Android 6");

		
		mb.setOs(os);
		
		Mobile_os_dao dao=new Mobile_os_dao();
	//	dao.saveMobile(mb);  //for inserting in all mobile and  os 
	//dao.saveOs(os);	// for only insertig in os 
		
		
 	 //dao.Updatemobile(mb);  //for Updating in all mobile and  os 
	 //dao.UpdateOs(os); // for only Updating in os 
	
	
	   dao.Findmobile(104);   //for Finding in all mobile and  os   
	 //   dao.FindOs(12);       // for only Finding in os 
		
		
	 //	dao.deletemobile(101);   //for Delete in all mobile and  os   
		
	
     //dao.findAll();   //for Finding  in all mobile and  os  
		
		
	//   	List<mobile> all=dao.findAll2();
		//System.out.println(all);
	}
}


//make project of perso with passport  26/12/22






