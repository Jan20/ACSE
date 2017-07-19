package org.watercraft.web.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;

import org.watercraft.MotorBoatService;
import org.watercraft.ejb.MotorBoat;
import org.watercraft.ejb.Watercraft;

/**
* 
* 	Backing bean for create Watercraft page.
* 	@author Jan Schumann
*
*/
@ManagedBean
public class CreateMotorBoat {
	
	////////////////
	// Attributes //
	////////////////
	private MotorBoat motorBoat;
	
	@EJB
	private MotorBoatService motorBoatService;
	
	/////////////
	// Methods //
	/////////////
	public void persist(){

		motorBoatService.createMotorBoat(getMotorBoat().getName(), getMotorBoat().getEnginePower());
		motorBoat = null;
		
	}

	public MotorBoat getMotorBoat() {
		
		if(motorBoat == null) {
			
			motorBoat = new MotorBoat();
		
		}
		
		return motorBoat;
	}

	public void setMotorBoat(MotorBoat motorBoat) {
	
		this.motorBoat = motorBoat;
	
	}


}
