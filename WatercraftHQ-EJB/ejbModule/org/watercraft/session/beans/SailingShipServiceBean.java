package org.watercraft.session.beans;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.watercraft.ejb.SailingShip;

@PermitAll
@Stateless
public class SailingShipServiceBean implements SailingShipService{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void createSailingShip(String name, int numberOfMasts) {

		SailingShip sailingShip = new SailingShip();
		sailingShip.setName(name);
		sailingShip.setNumberOfMasts(numberOfMasts);
		em.persist(sailingShip);
		
	}

	@Override
	public SailingShip findSailingShip(int watercraftId) {

		SailingShip sailingShip = em.find(SailingShip.class, watercraftId);

		if(sailingShip == null) {
			
			System.out.println("SailingShip couldn't be found.");
			
		}
		
		return null;
		
	}

	@Override
	public Collection<SailingShip> findSailingShips() {

		Collection<SailingShip> sailingShips = em.createQuery("FROM SailingShip", SailingShip.class).getResultList();
		
		return sailingShips;
		
	}

}
