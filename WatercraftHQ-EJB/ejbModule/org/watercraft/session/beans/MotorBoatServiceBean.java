package org.watercraft.session.beans;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.watercraft.ejb.MotorBoat;

@PermitAll
@Stateless
public class MotorBoatServiceBean implements MotorBoatService{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void createMotorBoat(String name, int enginePower) {
		
		MotorBoat motorBoat = new MotorBoat();
		motorBoat.setName(name);
		motorBoat.setEnginePower(enginePower);
		em.persist(motorBoat);
		
	}

	@Override
	public MotorBoat findMotorBoat(int watercraftId) {
		
		MotorBoat motorBoat = em.find(MotorBoat.class, watercraftId);
		
		if(motorBoat == null) {
			
			System.out.println("Motorboat couldn't be found.");
			
		}
	
		return motorBoat;
	}

	@Override
	public Collection<MotorBoat> findMotorBoats() {

		Collection<MotorBoat> motorBoats = em.createQuery("FROM MotorBoat", MotorBoat.class).getResultList();
		
		return motorBoats;
	}

}
