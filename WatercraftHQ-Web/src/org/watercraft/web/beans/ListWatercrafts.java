package org.watercraft.web.beans;

import java.util.Collection;

import javax.ejb.EJB;
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
public class ListWatercrafts {
	
	////////////////
	// Attributes //
	////////////////
	
	@EJB
	private WatercraftService watercraftService;

	private Collection<Watercraft> watercrafts;
	
	/////////////
	// Methods //
	/////////////
	public Collection<Watercraft> getWatercrafts() {
				
		if(watercrafts == null) {
			
			watercrafts = watercraftService.getAllWatercrafts();
			
		}
		
		return watercrafts;
		
	}

	public void setWatercrafts(Collection<Watercraft> watercrafts) {
		
		this.watercrafts = watercrafts; 
		
	}

	
}
