package it.romatre.gamestore.controller;

import java.util.List;

import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.facade.FornitoreFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class FornitoreController {

	@EJB
	private FornitoreFacade fornitoreFacade;

	private String nome;
	private String email;
	private String telefono;
	private String partitaIVA;
	private String stato;
	private String citta;
	private String via;
	private String cap;
	private Fornitore fornitore;
	private List<Fornitore> fornitori;

	public String createFornitore() {
		this.fornitore = fornitoreFacade.createFornitore(nome, email, telefono, stato, citta, cap, via, partitaIVA);
		return "fornitore"; 
	}

	public String listFornitori() {
		this.fornitori = fornitoreFacade.getAllFornitori();
		return "fornitori"; 
	}



	public List<Fornitore> getFornitori() {
		return fornitori;
	}

	public void setFornitori(List<Fornitore> fornitori) {
		this.fornitori = fornitori;
	}

	public FornitoreFacade getFornitoreFacade() {
		return fornitoreFacade;
	}

	public void setFornitoreFacade(FornitoreFacade fornitoreFacade) {
		this.fornitoreFacade = fornitoreFacade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}



}
