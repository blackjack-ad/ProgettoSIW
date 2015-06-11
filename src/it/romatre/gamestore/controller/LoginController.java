package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.facade.UtenteFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginController {
	@EJB
	private UtenteFacade utenteFacade; 
	private String email;
	private String password;

	public String verifyPasswordUtente(){
		Utente current = utenteFacade.getUtente(email);
		if(current!= null && current.getPassword().equals(password)){
			FacesContext context = FacesContext.getCurrentInstance();
			context.getExternalContext().getSessionMap().put("user", current);
			return "index";
		}
		else
			return "errorLogin";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
