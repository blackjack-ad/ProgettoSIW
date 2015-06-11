package it.romatre.gamestore.dominio;

public class Portale {
	private Azienda azienda;
	private Utente utenteCorrente;
	
	public Portale(Azienda azienda) {
		super();
		this.azienda = azienda;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public Utente getUtenteCorrente() {
		return utenteCorrente;
	}

	public void setUtenteCorrente(Utente utenteCorrente) {
		this.utenteCorrente = utenteCorrente;
	}
	
	
}
