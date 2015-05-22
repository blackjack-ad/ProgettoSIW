package it.romatre.gamestore.dominio;

public class Portale {
	private Azienda azienda;
	private Cliente clienteCorrente;
	
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

	public Cliente getClienteCorrente() {
		return clienteCorrente;
	}

	public void setClienteCorrente(Cliente clienteCorrente) {
		this.clienteCorrente = clienteCorrente;
	}
	
	
}
