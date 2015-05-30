package it.romatre.gamestore.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="ordine")
public class Ordine {

	private Long id;
	private Date dataInizio;
	private Date dataChiusura;
	private Date dataEvasione;
	
	//TODO inserire persistenza delle righe
	private List<RigaDiOrdine> righeDiOrdine;
	
	private String stato;
	
	@ManyToOne(targetEntity=Utente.class, fetch = FetchType.LAZY)
	@JoinColumn(name="utenteId")
	private Utente utente;

	public Ordine() {
		this.stato = "aperto";
		this.dataInizio = new Date();
		this.dataChiusura = null;
		this.dataEvasione = null;
		this.righeDiOrdine = new ArrayList<RigaDiOrdine>();
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public Date getDataEvasione() {
		return dataEvasione;
	}

	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	public List<RigaDiOrdine> getRigheDiOrdine() {
		return righeDiOrdine;
	}

	public void setRigheDiOrdine(List<RigaDiOrdine> righeDiOrdine) {
		this.righeDiOrdine = righeDiOrdine;
	}
	
	public void addRigaDiOrdine(RigaDiOrdine r){
		righeDiOrdine.add(r);
	}
	
	@Override
	public String toString(){
		return "Ordine in stato " + stato + " contenente " + righeDiOrdine.size() + " righe";
	}
	
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
}
