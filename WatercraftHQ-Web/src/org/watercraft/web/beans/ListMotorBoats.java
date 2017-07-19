package org.watercraft.web.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.watercraft.MotorBoatService;
import org.watercraft.ejb.MotorBoat;

@ManagedBean
public class ListMotorBoats {
	
	@EJB
	MotorBoatService MotorBoatService;
	
	private Collection<MotorBoat> motorBoats;
	
	public Collection<MotorBoat> getMotorBoats(){
		
		if(motorBoats == null) {
			
			motorBoats = MotorBoatService.findMotorBoats();
			
		}
		
		return motorBoats;
		
	}
	
	public void setMotorBoat(Collection<MotorBoat> motorBoats) {
		
		this.motorBoats = motorBoats;
		
	}

}
