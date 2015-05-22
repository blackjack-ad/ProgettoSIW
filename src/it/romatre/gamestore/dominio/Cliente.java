package it.romatre.gamestore.dominio;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

	private String nome;
	private String cognome;
	private Long id;
	private String telefono;
	private String email;
	private Date dataDiNascita;
	private Indirizzo indirizzo;
	private Ordine ordineCorrente;
	private Map<Long, Ordine> ordini;
	
	
	
	
	public Cliente(String nome, String cognome, String telefono, String email, Date data, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.dataDiNascita = data;
		this.ordini = new HashMap<Long, Ordine>();
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Ordine getOrdineCorrente() {
		return ordineCorrente;
	}

	public void setOrdineCorrente(Ordine ordineCorrente) {
		this.ordineCorrente = ordineCorrente;
	}

	public Map<Long, Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(Map<Long, Ordine> ordini) {
		this.ordini = ordini;
	}
	
	
	
	
}


