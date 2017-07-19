package org.watercraft.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.watercraft.session.beans.SailingShipService;
import org.watercraft.ejb.SailingShip;

/**
* 
* 	Backing bean for create Watercraft page.
* 	@author Jan Schumann
*
*/
@ManagedBean
public class CreateSailingShip {
	
	////////////////
	// Attributes //
	////////////////
	private SailingShip sailingShip;
	
	@EJB
	private SailingShipService SailingShipService;
	
	/////////////
	// Methods //
	/////////////
	public void persist(){

		SailingShipService.createSailingShip(getSailingShip().getName(), getSailingShip().getNumberOfMasts());
		sailingShip = null;
		
	}

	public SailingShip getSailingShip() {
		
		if(sailingShip == null) {
			
			sailingShip = new SailingShip();
		
		}
		
		return sailingShip;
	}

	public void setSailingShip(SailingShip sailingShip) {
	
		this.sailingShip = sailingShip;
	
	}


}
