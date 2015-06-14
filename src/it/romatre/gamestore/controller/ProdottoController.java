package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.dominio.Prodotto;
import it.romatre.gamestore.facade.ProdottoFacade;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;

@ManagedBean
public class ProdottoController {
	
	@EJB
	private ProdottoFacade prodottoFacade;
	
	private Long codiceSeriale;
	private DescrizioneProdotto descrizione;
	private Fornitore fornitore;
	
	private Prodotto prodotto;

	public String createProdotto () {
		this.prodotto = prodottoFacade.createProdotto(codiceSeriale,descrizione,fornitore);
		return "prodotto";
	}

	public ProdottoFacade getProdottoFacade() {
		return prodottoFacade;
	}

	public void setProdottoFacade(ProdottoFacade prodottoFacade) {
		this.prodottoFacade = prodottoFacade;
	}

	public Long getCodiceSeriale() {
		return codiceSeriale;
	}

	public void setCodiceSeriale(Long codiceSeriale) {
		this.codiceSeriale = codiceSeriale;
	}

	public DescrizioneProdotto getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(DescrizioneProdotto descrizione) {
		this.descrizione = descrizione;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	

	
}
