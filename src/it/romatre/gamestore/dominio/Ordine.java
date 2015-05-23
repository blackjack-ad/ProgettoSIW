package it.romatre.gamestore.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordine {
	
	private Long id;
	private Date dataInizio;
	private Date dataChiusura;
	private Date dataEvasione;
	private List<RigaDiOrdine> righeDiOrdine;
	private String stato;
	
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
	
}
