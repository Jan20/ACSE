package org.watercraft.web;


import java.io.IOException;
import java.util.Set;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.jws.WebService;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * Session Bean implementation class WatercraftService.
 * 
 * Also provides an exemplary web service with two operations.
 * @author Jan Schumann
 */
@Stateless
@WebService(name = "WatercraftWebService", serviceName = "WatercraftService", portName = "WatercraftServicePort", 
		targetNamespace = "http://org.Watercraft.club/")

public class Util {

	public static String getConstraintMessage(EJBException e) {
		String message = "";
		if(e.getCausedByException() instanceof ConstraintViolationException){
			ConstraintViolationException cve = (ConstraintViolationException) e.getCausedByException();
			Set<ConstraintViolation<?>> violations = cve.getConstraintViolations();
			if(violations != null)
				for(ConstraintViolation<?> cur : violations)
					message += cur.getMessage() + " ";
			else
				message += cve.getMessage();
		}
		else
			message += e.getMessage();
		return message;
	}

	public static void redirectToRoot() {
		try {
			ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
			ctx.redirect("/" + ctx.getContextName() + "/");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
