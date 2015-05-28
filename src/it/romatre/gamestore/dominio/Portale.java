package it.romatre.gamestore.dominio;

public class Portale {
	private Azienda azienda;
	private Utente clienteCorrente;
	
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

	public Utente getClienteCorrente() {
		return clienteCorrente;
	}

	public void setClienteCorrente(Utente clienteCorrente) {
		this.clienteCorrente = clienteCorrente;
	}
	
	
}
