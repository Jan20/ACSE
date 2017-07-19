package org.watercraft;

import java.util.Collection;

import javax.ejb.Remote;

import org.watercraft.ejb.MotorBoat;

@Remote
public interface MotorBoatService {

	public void createMotorBoat(String name, int enginePower);
	
	public MotorBoat findMotorBoat(int watercraftId);
	
	public Collection<MotorBoat> findMotorBoats();
	
}
