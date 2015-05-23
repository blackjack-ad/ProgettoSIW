package it.romatre.gamestore.dominio;

public class Indirizzo {

	private String stato;
	private String citta;
	private Integer cap;
	private String via;
	
	public Indirizzo(String stato, String citta, Integer cap, String via) {
		super();
		this.stato = stato;
		this.citta= citta;
		this.cap = cap;
		this.via = via;
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

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}
	
	
	
}
