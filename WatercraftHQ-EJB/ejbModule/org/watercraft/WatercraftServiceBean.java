package org.watercraft;

import java.util.Collection;

import javax.annotation.security.PermitAll;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;

import org.watercraft.ejb.Watercraft;


/**
 * Session Bean implementation class WatercraftService.
 * 
 * Also provides an exemplary web service with two operations.
 * @author Jan Schumann
 */
@PermitAll
@Stateless
public class WatercraftServiceBean implements WatercraftService {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Watercraft createWatercraft(int watercraftId, String name) {
		Watercraft newWatercraft = new Watercraft();
		newWatercraft.setWatercraftId(watercraftId);
		newWatercraft.setName(name);
		return createWatercraft(newWatercraft);
	}

	@Override
	public Watercraft createWatercraft(Watercraft watercraft) {

		if (em.createQuery("SELECT COUNT(*) FROM Watercraft WHERE watercraftId=:watercraftId", Long.class).setParameter("watercraftId", watercraft.getWatercraftId())
				.getSingleResult() > 0)
			
			throw new EJBException(new ConstraintViolationException("watercraftId already in database", null));
		System.out.println(watercraft);

		em.persist(watercraft);
		System.out.println("Service Bean has done its job");
		return watercraft;
	}

	@Override
	public Watercraft getWatercraft(int watercraftId) {
		Watercraft Watercraft = em.find(Watercraft.class, watercraftId);
		if (Watercraft == null)
			throw new IllegalArgumentException(String.format(
					"Watercraft with ID %s not found", watercraftId));
		return Watercraft;
	}

	@Override
	public Collection<Watercraft> getAllWatercrafts() {
		System.out.println("Started");
		System.out.println(em.createQuery("FROM Watercraft", Watercraft.class).getResultList());
		return em.createQuery("FROM Watercraft", Watercraft.class).getResultList();
	
	}
}
