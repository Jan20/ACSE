package org.watercraft.ejb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Watercraft implements java.io.Serializable {
	
	///////////////
	// Variables //
	///////////////
	private static final long serialVersionUID = 4965400399083190672L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int watercraftId;
	
	protected String name;
	

	/////////////////////
	// Getter / Setter //
	/////////////////////
	/**
	* 
	*	id Getter and Setter
	* 
	*/	
	public int getWatercraftId() {
		
		return this.watercraftId;
	
	}
	
	public void setWatercraftId(int watercraftId) {
		
		this.watercraftId = watercraftId;
	
	}
	
	/**
	* 
	*	name Getter and Setter
	* 
	*/
	public String getName() {
	
		return this.name;
	
	}

	public void setName(String name) {
	
		this.name = name;
	
	}

		
	@Override
	public String toString() {
		return getWatercraftId() + " (ID=" + getWatercraftId() +  (getName()!=null?", "+getName():"") + ")";
	}
}