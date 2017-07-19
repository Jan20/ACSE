package org.watercraft;

import java.util.Collection;

import javax.ejb.EJBException;
import javax.ejb.Remote;

import org.watercraft.ejb.SailingShip;

@Remote
public interface SailingShipService {

	public void createSailingShip(String name, int numberOfMasts);
	
	public SailingShip findSailingShip(int watercraftId);
	
	public Collection<SailingShip> findSailingShips();
	
}
