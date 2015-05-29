package it.romatre.gamestore.controller;

import java.util.List;

import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.dominio.UtenteFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class UtenteController {
	
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private Integer giorno;
	private Integer mese;
	private Integer anno;
	private String numeroTelefono;
	private String stato;
	private String citta;
	private String via;
	private String cap;
	
	private Utente utente;
	private List<Utente> utenti;
	
	@EJB
	private UtenteFacade utenteFacade;
	
	public String createUtente() {
		this.utente = utenteFacade.createUtente(nome, cognome, email, password, giorno, mese, anno, numeroTelefono, stato, citta, cap, via);
		return "utente"; 
	}
	
	public String listUtenti() {
		this.utenti = utenteFacade.getAllUtenti();
		return "utenti"; 
	}

	public String findUtente() {
		this.utente = utenteFacade.getUtente(email);
		return "utente";
	}
	
	public String findUtente(String email) {
		this.utente = utenteFacade.getUtente(email);
		return "utente";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
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

	public Integer getGiorno() {
		return giorno;
	}

	public void setGiorno(Integer giorno) {
		this.giorno = giorno;
	}

	public Integer getMese() {
		return mese;
	}

	public void setMese(Integer mese) {
		this.mese = mese;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}

	public UtenteFacade getUtenteRepository() {
		return utenteFacade;
	}

	public void setUtenteRepository(UtenteFacade utenteRepository) {
		this.utenteFacade = utenteRepository;
	}

}


