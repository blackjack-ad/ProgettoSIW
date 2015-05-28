package it.romatre.gamestore.dominio;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;

@EJB
public class Azienda {
	private Map<Long, DescrizioneProdotto> catalogo;
	private Map<Long, Prodotto> magazzino;
	private Map<Long, Cliente> anagraficaClienti;
	private Map<Long, Ordine> ordini;
	private long descrizioneId = 0L;
	
	public Azienda() {
		this.catalogo = new HashMap<Long, DescrizioneProdotto>();
		this.magazzino = new HashMap<Long, Prodotto>();
		this.anagraficaClienti = new HashMap<Long, Cliente>();
		this.ordini = new HashMap<Long, Ordine>();
	}

	public Map<Long, DescrizioneProdotto> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Map<Long, DescrizioneProdotto> catalogo) {
		this.catalogo = catalogo;
	}
	
	
	
	public void add2Catalogo(DescrizioneProdotto dp){
		catalogo.put(descrizioneId++, dp);
	}
	

	
	public Map<Long, Prodotto> getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Map<Long, Prodotto> magazzino) {
		this.magazzino = magazzino;
	}

	public Map<Long, Cliente> getAnagraficaClienti() {
		return anagraficaClienti;
	}

	public void setAnagraficaClienti(Map<Long, Cliente> anagraficaClienti) {
		this.anagraficaClienti = anagraficaClienti;
	}

	public Map<Long, Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(Map<Long, Ordine> ordini) {
		this.ordini = ordini;
	}
	
	

}
