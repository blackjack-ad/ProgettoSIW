package it.romatre.gamestore.controller;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.facade.DescrizioneProdottoFacade;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DescrizioneProdottoController {

	@EJB
	private DescrizioneProdottoFacade descrizioneProdottoFacade;
	private String nome;
	private Float prezzo;
	private String descrizione;
	private DescrizioneProdotto descrizioneProdotto;
	
	public String createDescrizioneProdotto() {
		this.descrizioneProdotto = descrizioneProdottoFacade.createDescrizioneProdotto(nome, prezzo, descrizione);
		return "product"; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public DescrizioneProdottoFacade getDescrizioneProdottoFacade() {
		return descrizioneProdottoFacade;
	}

	public void setDescrizioneProdottoFacade(
			DescrizioneProdottoFacade descrizioneProdottoFacade) {
		this.descrizioneProdottoFacade = descrizioneProdottoFacade;
	}

	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}

}
