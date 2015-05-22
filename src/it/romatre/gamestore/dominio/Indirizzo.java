package it.romatre.gamestore.dominio;

public class Indirizzo {

	private String stato;
	private String città;
	private Integer cap;
	private String via;
	
	public Indirizzo(String stato, String città, Integer cap, String via) {
		super();
		this.stato = stato;
		this.città = città;
		this.cap = cap;
		this.via = via;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
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
