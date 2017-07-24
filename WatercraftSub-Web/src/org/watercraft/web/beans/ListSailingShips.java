package org.watercraft.web.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import org.watercraft.session.beans.SailingShipService;
import org.watercraft.ejb.SailingShip;

/**
* 
* 	Backing bean for create SailingShip page.
* 	@author Jan Schumann
*
*/
@ManagedBean
public class ListSailingShips {
	
	////////////////
	// Attributes //
	////////////////
	
	@EJB
	private SailingShipService sailingShipService;

	private Collection<SailingShip> sailingShips;
	
	/////////////
	// Methods //
	/////////////
	public Collection<SailingShip> getSailingShips() {
				
		if(sailingShips == null) {
			
			sailingShips = sailingShipService.findSailingShips();
			
		}
		
		return sailingShips;
		
	}

	public void setSailingShips(Collection<SailingShip> sailingShips) {
		
		this.sailingShips = sailingShips; 
		
	}

	
}
