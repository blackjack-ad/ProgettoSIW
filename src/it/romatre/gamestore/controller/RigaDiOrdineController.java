package it.romatre.gamestore.controller;

import java.util.ArrayList;
import java.util.List;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.RigaDiOrdine;
import it.romatre.gamestore.facade.DescrizioneProdottoFacade;
import it.romatre.gamestore.facade.RigaDiOrdineFacade;
import it.romatre.gamestore.facade.UtenteFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="rigaDiOrdineController")
public class RigaDiOrdineController { 

	@ManagedProperty(value="#{descrizioneProdottoController}")
	private DescrizioneProdottoController descrizioneProdottoController;

	@ManagedProperty(value="#{ordineController}")
	private OrdineController ordineController;

	@ManagedProperty(value="#{param.id}")
	private Long id;

	@EJB
	private DescrizioneProdottoFacade descrizioneProdottoFacade; 

	@EJB
	private RigaDiOrdineFacade rigaDiOrdineFacade; 
	private Integer quantita;  
	private List<RigaDiOrdine> righeTemporanee = new ArrayList<RigaDiOrdine>();
	private boolean started = false;

	public String creaRigaDiOrdine(){
		Long idParam = descrizioneProdottoController.getId();
		DescrizioneProdotto dp = descrizioneProdottoFacade.getDescrizioneProdotto(idParam);
		RigaDiOrdine r = new RigaDiOrdine();
		r.setDescrizioneProdotto(dp);
		r.setQuantita(quantita);
		ordineController.addRiga(r);
		return "ordine";
	}

	public List<RigaDiOrdine> getRigheTemporanee() {
		return righeTemporanee;
	}

	public void setRigheTemporanee(List<RigaDiOrdine> righeTemporanee) {
		this.righeTemporanee = righeTemporanee;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public DescrizioneProdottoController getDescrizioneProdottoController() {
		return descrizioneProdottoController;
	}

	public void setDescrizioneProdottoController(
			DescrizioneProdottoController descrizioneProdottoController) {
		this.descrizioneProdottoController = descrizioneProdottoController;
	}

	public OrdineController getOrdineController() {
		return ordineController;
	}

	public void setOrdineController(OrdineController ordineController) {
		this.ordineController = ordineController;
	}

	public String eliminaRiga(){
		rigaDiOrdineFacade.deleteRigaDiOrdine(id);
		return "ordine";
	}

	public String eliminaRiga(Long id){
		rigaDiOrdineFacade.deleteRigaDiOrdine(id);
		return "ordine";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DescrizioneProdottoFacade getDescrizioneProdottoFacade() {
		return descrizioneProdottoFacade;
	}

	public void setDescrizioneProdottoFacade(
			DescrizioneProdottoFacade descrizioneProdottoFacade) {
		this.descrizioneProdottoFacade = descrizioneProdottoFacade;
	}

	public RigaDiOrdineFacade getRigaDiOrdineFacade() {
		return rigaDiOrdineFacade;
	}

	public void setRigaDiOrdineFacade(RigaDiOrdineFacade rigaDiOrdineFacade) {
		this.rigaDiOrdineFacade = rigaDiOrdineFacade;
	}

}
