package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.RigaDiOrdine;
import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.facade.OrdineFacade;
import it.romatre.gamestore.facade.RigaDiOrdineFacade;
import it.romatre.gamestore.facade.UtenteFacade;
import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.RigaDiOrdine;
import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.facade.OrdineFacade;
import it.romatre.gamestore.facade.UtenteFacade;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@ManagedBean(name="ordineController")
public class OrdineController {

	@ManagedProperty(value="#{param.id}")
	private Long id;

	@ManagedProperty(value = "#{loginController}")
	private LoginController loginController; 

	@EJB
	private OrdineFacade ordineFacade;
	
	@EJB
	private RigaDiOrdineFacade rigaDiOrdineFacade;

	private Date dataInizio;
	private Date dataFine;
	private Date dataEvasione;
	private Utente utente;
	private Ordine ordine;
	private Integer num;
	private List<Ordine> ordini;


	//	public String creaOrdine() {
	//		FacesContext fc = FacesContext.getCurrentInstance();
	//		Utente utenteCorrente = (Utente)fc.getExternalContext().getSessionMap().get("user");
	//		if(utenteCorrente!=null){
	//			this.ordine = ordineFacade.createOrdine(utenteCorrente);
	//			return "ordine";
	//		}
	//		else
	//			return "errorPage";
	//
	//	}

	public String listOrdini() {
		this.ordini = ordineFacade.getAllOrdini();
		return "ordini";
	}

	public String listOrdiniDaEvadere() {
		this.ordini = ordineFacade.getAllOrdiniDaEvadereOSospesi();
		return "ordiniDaEvadere";
	}

	public String listOrdiniUtente(){
		FacesContext fc = FacesContext.getCurrentInstance(); 
		Utente u = (Utente) fc.getExternalContext().getSessionMap().get("user");
		Long idUtente = u.getId();
		this.ordini = ordineFacade.getAllOrdiniUtente(idUtente);
		return "ordini"; 
	}

	public String listOrdiniUtente(Long idUtente){
		this.ordini = ordineFacade.getAllOrdiniUtente(idUtente);
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
		if(ordine==null){
			FacesContext fc = FacesContext.getCurrentInstance();
			ordine = (Ordine)fc.getExternalContext().getSessionMap().get("order");
			return ordine;
		}
		else
			return ordine;
	}

	public void setOrdine(Ordine ordine) {
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getSessionMap().put("order", ordine);
		this.ordine = ordine;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	public void addRiga(RigaDiOrdine r) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ordine = (Ordine)fc.getExternalContext().getSessionMap().get("order");
		if(ordine==null){
			Utente utenteCorrente = (Utente)fc.getExternalContext().getSessionMap().get("user");
			ordine = new Ordine();
			ordine.setUtente(utenteCorrente);
			loginController.setCreatingOrder(true);
		}
		r.setOrdine(ordine);
		if(ordine.getId()!=null){
			rigaDiOrdineFacade.createRigaDiOrdine(r);
		}
		ordine.addRigaDiOrdine(r);
		fc.getExternalContext().getSessionMap().put("order",ordine);
	}

	public String persistiOrdine(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ordine = (Ordine)fc.getExternalContext().getSessionMap().get("order");
		ordine.setStato("aperto");
		ordineFacade.persistiOrdine(ordine);
		fc.getExternalContext().getSessionMap().remove("order");
		loginController.setCreatingOrder(false);
		return "ordine";
	}
	
	public String eliminaRiga(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ordine = (Ordine)fc.getExternalContext().getSessionMap().get("order");
		System.out.println("descId =" + id);
		
		for(int i= 0 ; i<ordine.getRigheDiOrdine().size(); i++){
			
			RigaDiOrdine rdo = ordine.getRigheDiOrdine().get(i);
			
			System.out.println(rdo.getDescrizioneProdotto().getId());
			Long temp = rdo.getDescrizioneProdotto().getId();
			if(temp.compareTo(id)==0){
				ordine.getRigheDiOrdine().remove(i);
			}
		}
		fc.getExternalContext().getSessionMap().put("order",ordine);
		setOrdine(ordine);
		return "ordine";
	}
	
	public String eliminaRiga(Long descId){
		FacesContext fc = FacesContext.getCurrentInstance();
		ordine = (Ordine)fc.getExternalContext().getSessionMap().get("order");
		System.out.println("descId =" + descId);
		
		for(int i= 0 ; i<ordine.getRigheDiOrdine().size(); i++){
			
			RigaDiOrdine rdo = ordine.getRigheDiOrdine().get(i);
			
			System.out.println(rdo.getDescrizioneProdotto().getId());
			Long temp = rdo.getDescrizioneProdotto().getId();
			if(temp.compareTo(descId)==0){
				ordine.getRigheDiOrdine().remove(i);
			}
		}
		fc.getExternalContext().getSessionMap().put("order",ordine);
		setOrdine(ordine);
		return "ordine";
	}

	public String findOrdine() {
		this.ordine = ordineFacade.getOrdine(id);
		return "ordine";
	}

	public String findOrdine(Long id) {
		this.ordine = ordineFacade.getOrdine(id);
		return "ordine";
	}
	
	public String newFindOrdine(){
		getOrdine();
		return "ordine";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String chiudiOrdine(){
		Ordine o = ordineFacade.getOrdine(id);
		o.setStato("chiuso");
		o.setDataChiusura(new Date());
		ordineFacade.updateOrdine(o);
		return listOrdiniUtente();
	}

	public String chiudiOrdine(Long id){
		Ordine o = ordineFacade.getOrdine(id);
		o.setStato("chiuso");
		o.setDataChiusura(new Date());
		ordineFacade.updateOrdine(o);
		return listOrdiniUtente();
	}

	public LoginController getLoginController() {
		return loginController;
	}

	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}

	public String evadiOrdine(){
		Ordine o = ordineFacade.getOrdine(id);
		
		System.out.println(o != null);
		if (ordineFacade.evasionePossibile(o)){
			o.setStato("evaso");
			o.getDataEvasione();
			ordineFacade.updateOrdine(o);
		}
		else {
			o.setStato("sospeso");
			ordineFacade.updateOrdine(o);
		}
//		refresh();
		return listOrdiniDaEvadere();
	}

	public String evadiOrdine(Long id){
		Ordine o = ordineFacade.getOrdine(id);

		if (ordineFacade.evasionePossibile(o)){
			o.setStato("evaso");
			o.getDataEvasione();
			ordineFacade.updateOrdine(o);
		}
		else {
			o.setStato("sospeso");
			ordineFacade.updateOrdine(o);
		}
//		refresh();
		return listOrdiniDaEvadere();
	}

	public void refresh(){
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String refreshpage = facesContext.getViewRoot().getViewId();
		ViewHandler  viewHandler =
				facesContext.getApplication().getViewHandler();
		UIViewRoot viewroot =  viewHandler.createView( facesContext, refreshpage);
		viewroot.setViewId(refreshpage);
		facesContext.setViewRoot(viewroot);
	}

	public void setOrdineX(Ordine ordine) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ordine.setStato(null);
		fc.getExternalContext().getSessionMap().put("order",ordine);
		loginController.setCreatingOrder(true);
	}

	public Integer getNum() {
		return ordineFacade.contaElementiOrdine(getOrdine());
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public RigaDiOrdineFacade getRigaDiOrdineFacade() {
		return rigaDiOrdineFacade;
	}

	public void setRigaDiOrdineFacade(RigaDiOrdineFacade rigaDiOrdineFacade) {
		this.rigaDiOrdineFacade = rigaDiOrdineFacade;
	}

	
	
}
