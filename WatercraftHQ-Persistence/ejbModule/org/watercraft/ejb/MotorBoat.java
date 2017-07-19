package org.watercraft.ejb;

import javax.persistence.Entity;

@Entity
public class MotorBoat extends Watercraft{

	private static final long serialVersionUID = 1L;

	private int enginePower;

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	
}
