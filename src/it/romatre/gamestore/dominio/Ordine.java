package it.romatre.gamestore.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="ordine")
public class Ordine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Date dataInizio;
	@Column(nullable = true)
	private Date dataChiusura;
	@Column(nullable = true)
	private Date dataEvasione;
	
	@OneToMany(mappedBy="ordine", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<RigaDiOrdine> righeDiOrdine;
	
	private String stato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utente;

	public Ordine() {
		this.stato = "aperto";
		this.dataInizio = new Date();
		this.dataChiusura = null;
		this.dataEvasione = null;
		this.righeDiOrdine = new ArrayList<RigaDiOrdine>();
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public Date getDataEvasione() {
		return dataEvasione;
	}

	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	public List<RigaDiOrdine> getRigheDiOrdine() {
		return righeDiOrdine;
	}

	public void setRigheDiOrdine(List<RigaDiOrdine> righeDiOrdine) {
		this.righeDiOrdine = righeDiOrdine;
	}
	
	public void addRigaDiOrdine(RigaDiOrdine r){
		righeDiOrdine.add(r);
	}
	
	@Override
	public String toString(){
		return "Ordine in stato " + stato + " contenente " + righeDiOrdine.size() + " righe";
	}
	
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
