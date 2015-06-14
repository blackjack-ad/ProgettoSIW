package it.romatre.gamestore.controller;

import java.util.List;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.dominio.Prodotto;
import it.romatre.gamestore.facade.DescrizioneProdottoFacade;
import it.romatre.gamestore.facade.FornitoreFacade;
import it.romatre.gamestore.facade.ProdottoFacade;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

@ManagedBean
public class ProdottoController {
	
	@EJB
	private ProdottoFacade prodottoFacade;
	private Long id; 
	private Long codiceSeriale;
	private DescrizioneProdotto descrizioneProdotto;
	private Fornitore fornitore;
	private Long[] idFornitori; 
	private Long idDescrizioneProdotto;
 	private Prodotto prodotto;
 	private List<Fornitore> fornitori; 
 	private List<DescrizioneProdotto> descrizioneProdotti;
	@EJB
	private FornitoreFacade fornitoreFacade;
	@EJB
	private DescrizioneProdottoFacade descrizioneProdottoFacade;

	public String createProdotto() {
		descrizioneProdotto = descrizioneProdottoFacade.getDescrizioneProdotto(idDescrizioneProdotto);
		this.prodotto = prodottoFacade.createProdotto(codiceSeriale,descrizioneProdotto,idFornitori);
		return "prodotto";
	}
	
	public String listFornitori() {
		this.fornitori = fornitoreFacade.getAllFornitori();
		listDescrizioneProdotti();
		return "prodottiMagazzino"; 
	}
	
	public void listDescrizioneProdotti(){
		this.descrizioneProdotti = descrizioneProdottoFacade.getAllDescrizioneProdotti();
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

	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@PostConstruct
	public void init() {
	    listFornitori();
	    // If this is a static list, you'd rather put this
	    // in a separate application scoped bean instead.
	}

	public List<Fornitore> getFornitori() {
		return fornitori;
	}

	public void setFornitori(List<Fornitore> fornitori) {
		this.fornitori = fornitori;
	}

	public Long[] getIdFornitori() {
		return idFornitori;
	}

	public void setIdFornitori(Long[] idFornitori) {
		this.idFornitori = idFornitori;
	}

	public Long getIdDescrizioneProdotto() {
		return idDescrizioneProdotto;
	}

	public void setIdDescrizioneProdotto(Long idDescrizioneProdotto) {
		this.idDescrizioneProdotto = idDescrizioneProdotto;
	}

	public List<DescrizioneProdotto> getDescrizioneProdotti() {
		return descrizioneProdotti;
	}

	public void setDescrizioneProdotti(List<DescrizioneProdotto> descrizioneProdotti) {
		this.descrizioneProdotti = descrizioneProdotti;
	}

}
