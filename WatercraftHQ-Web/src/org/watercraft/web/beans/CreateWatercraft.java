package org.watercraft.web.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import org.watercraft.WatercraftService;
import org.watercraft.ejb.Watercraft;

/**
* 
* 	Backing bean for create Watercraft page.
* 	@author Jan Schumann
*
*/
@ManagedBean
public class CreateWatercraft {
	
	////////////////
	// Attributes //
	////////////////
	private Watercraft watercraft;
	private String errorCode;
	
	@EJB
	private WatercraftService watercraftService;
	
	
	
	/////////////
	// Methods //
	/////////////
	public String persist(){

		try{
		
			watercraftService.createWatercraft(getWatercraft());
			errorCode = null;
			this.watercraft = null;
			System.out.println("A new Watercraft has been successfully created" + this.watercraft);
		
		}
		catch(EJBException e){
		
			errorCode = "Watercraft not created: ";
			System.out.println(errorCode);
		}
		
		return "persistently stored";
	}
		
	public String getSuccess(){
		return errorCode!=null?"error":"success";
	}
	
	/////////////////////
	// Getter / Setter //
	/////////////////////
	/**
	* 
	*	Watercraft Getter / Setter 
	*
	* @return
	*/
	public Watercraft getWatercraft() {
		
		if(this.watercraft == null) {
			
			this.watercraft = new Watercraft();
		
		}
		
		return this.watercraft;
	}

	public void setWatercraft(Watercraft watercraft) {
	
		this.watercraft = watercraft;
	
	}

	


}
