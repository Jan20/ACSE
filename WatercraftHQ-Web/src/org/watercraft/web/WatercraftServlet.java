package org.watercraft.web;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.watercraft.WatercraftService;
import org.watercraft.ejb.Watercraft;


/**
 * Servlet implementation class WatercraftServlet.
 * 
 * Parameters: watercraftId, name, length
 * 
 * @author Henning Heitkoetter
 */
@WebServlet("/WatercraftServlet")
public class WatercraftServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private WatercraftService ejb;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		try{
			Watercraft newWatercraft = ejb.createWatercraft(Integer.valueOf(request.getParameter("watercraftId")), request.getParameter("name"));
			out.println("Watercraft successfully created.<br/>");
			out.println(newWatercraft);
		}
		catch (EJBException e) {
			out.println("Watercraft could not be created.<br/>");
			if(e.getCausedByException() instanceof ConstraintViolationException){
				out.println("Reason(s):<br/>");
				ConstraintViolationException cve = (ConstraintViolationException) e.getCausedByException();
				Set<ConstraintViolation<?>> violations = cve.getConstraintViolations();
				if(violations!=null)
					for(ConstraintViolation<?> cur : violations)
						out.println(cur.getMessage() + "<br/>");
				else
					out.println(cve.getMessage());
			}
		}
		finally{
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
