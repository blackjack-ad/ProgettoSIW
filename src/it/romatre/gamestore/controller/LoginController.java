package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.facade.UtenteFacade;
import it.romatre.gamestore.utility.MD5;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginController {
	@EJB
	private UtenteFacade utenteFacade; 
	private String email;
	private String password;
	private boolean loggedIn = false; 
	private Utente utenteCorrente;

	public String verifyPasswordUtente(){
		Utente current = utenteFacade.getUtente(email);
		if (current!=null) {
			//Viene generato il codice MD5 a partire dalla pwd inserita nella form del login
			MD5 codificatoreMD5 = new MD5();
			String md5PWD = codificatoreMD5.toMD5(password);
			if(current.getPassword().equals(md5PWD)){
				FacesContext context = FacesContext.getCurrentInstance();
				context.getExternalContext().getSessionMap().put("user", current);
				setLoggedIn(true);
				setUtenteCorrente(current);
				return "index";
			}
		}
		return "errorLogin";
	}

	public String logout() {
		setLoggedIn(false);
		setUtenteCorrente(null);
		return "index";
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

	public boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Utente getUtenteCorrente() {
		return utenteCorrente;
	}

	public void setUtenteCorrente(Utente utenteCorrente) {
		this.utenteCorrente = utenteCorrente;
	}



}