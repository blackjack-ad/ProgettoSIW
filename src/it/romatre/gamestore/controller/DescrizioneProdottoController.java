package it.romatre.gamestore.controller;


import java.util.List;

import it.romatre.gamestore.dominio.Azienda;
import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.facade.DescrizioneProdottoFacade;

import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class DescrizioneProdottoController {

	@ManagedProperty(value="#{param.id}")
	private Long id; 
	private Azienda azienda; 
	private String nome;
	private Double prezzo;
	private String descrizione;
	private DescrizioneProdotto descrizioneProdotto;
	private List<DescrizioneProdotto> descrizioneProdotti;
	
	@EJB
	private DescrizioneProdottoFacade descrizioneProdottoFacade;
	
	public String createDescrizioneProdotto() {
		this.descrizioneProdotto = descrizioneProdottoFacade.createDescrizioneProdotto(nome, prezzo, descrizione);
		return "product"; 
	}
	
	public String listDescrizioneProdotti() {
		this.descrizioneProdotti = descrizioneProdottoFacade.getAllDescrizioneProdotti();
		return "products"; 
	}
	
	public String findDescrizioneProdotto() {
		this.descrizioneProdotto = descrizioneProdottoFacade.getDescrizioneProdotto(id);
		return "product";
	}
	
	public String findDescrizioneProdotto(Long id) {
		this.descrizioneProdotto = descrizioneProdottoFacade.getDescrizioneProdotto(id);
		return "product";
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setDescrizioneProdotti(List<DescrizioneProdotto> descrizioneProdotti) {
		this.descrizioneProdotti = descrizioneProdotti;
	}
	
	public List<DescrizioneProdotto> getDescrizioneProdotti(){
		return this.descrizioneProdotti;
	}
	
	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}

}
