package br.edu.unibratec.psc;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Named
@SessionScoped
public class MinhaPrimeiraServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3642132428119512636L;
	
	public void doOptions(HttpServletRequest pRequest, HttpServletResponse pResponse) {
		System.out.println("Request" + pRequest.toString());
		System.out.println("Response" + pResponse.toString());
	}

}