package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.facade.OrdineFacade;
import it.romatre.gamestore.facade.UtenteFacade;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class OrdineController {
	
	@EJB
	private OrdineFacade ordineFacade;
	
	private Date dataInizio;
	private Date dataFine;
	private Date dataEvasione;
	private Utente utente;
	private Ordine ordine;
	private List<Ordine> ordini;
	
	public String creaOrdine() {
		this.ordine = ordineFacade.createOrdine();
		return "ordine";
	}

	public String listOrdini() {
		this.ordini = ordineFacade.getAllOrdini();
		return "ordini";
	}

	public OrdineFacade getOrdineFacade() {
		return ordineFacade;
	}

	public void setOrdineFacade(OrdineFacade ordineFacade) {
		this.ordineFacade = ordineFacade;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataEvasione() {
		return dataEvasione;
	}

	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
//	public String findOrdine() {
//		this.ordine = ordineFacade.getOrdine(id);
//		return "ordine";
//	}

//
//	public String findOrdine(Long id) {
//		this.odine = utenteFacade.getUtente(id);
//		return "ordine";
//	}
	
}
