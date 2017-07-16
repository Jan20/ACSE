package org.watercraft;

import java.util.Collection;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.validation.ConstraintViolationException;

import org.watercraft.ejb.Watercraft;


/**
 * Remote interface of session bean for Watercraft management.
 * @author Jan Schumann
 *
 */
@Remote
public interface WatercraftService {
	/**
	 * Create a new Watercraft in the database with properties as specified by <code>Watercraft</code>.
	 * @param Watercraft The newly created Watercraft has the same property values as this parameter.
	 * @return The newly created Watercraft.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Watercraft createWatercraft(Watercraft watercraft);

	/**
	 * Create a new Watercraft in the database with the specified property values.
	 * @param name The name of the Watercraft.
	 * @param author The author, or <code>null</code>.
	 * @param isbn The ISBN, or <code>null</code>.
	 * @return The newly created Watercraft.
	 * @throws ConstraintViolationException (wrapped in an {@link EJBException})
	 */
	Watercraft createWatercraft(int watercraftId, String name);
	
	/**
	*
	* 	Returns the Watercraft with the specified ID.
	* 	@param watercraftId The ID of the Watercraft.
	* 	@return The Watercraft.
	* 	@throws IllegalArgumentException If no Watercraft exists for the given ID.
	*
	*/
	Watercraft getWatercraft(int watercraftId);
	
	/**
	 * Retrieves all Watercrafts from stored in the system.
	 * @return All Watercrafts.
	 */
	Collection<Watercraft> getAllWatercrafts();
}
