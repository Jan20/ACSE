package org.watercraft.ejb;

import javax.persistence.Entity;

@Entity
public class SailingShip extends Watercraft{
	
	////////////////
	// Attributes //
	////////////////
	private static final long serialVersionUID = 1L;

	private int numberOfMasts;

	public int getNumberOfMasts() {
		return numberOfMasts;
	}

	public void setNumberOfMasts(int numberOfMasts) {
		this.numberOfMasts = numberOfMasts;
	}
	
	
}
