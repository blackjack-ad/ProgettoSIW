package it.romatre.gamestore.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity(name="prodotto")
public class Prodotto {
	@Column(nullable = false, unique=true)
	private Long codiceSeriale;
	@OneToOne
	private DescrizioneProdotto descrizione;

	@ManyToMany
	private List<Fornitore> fornitori;

	public Prodotto(){
		this.descrizione = descrizione;
		this.codiceSeriale = codiceSeriale;
		this.fornitori = new ArrayList<Fornitore>();
	}

	public Prodotto(Long codiceSeriale, DescrizioneProdotto descrizione) {
		super();
		this.descrizione = descrizione;
		this.codiceSeriale = codiceSeriale;
		this.fornitori = new ArrayList<Fornitore>();
	}

	public long getCodiceSeriale() {
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

	public Collection<Fornitore> getFornitori() {
		return fornitori;
	}

	public void setFornitori(List<Fornitore> fornitori) {
		this.fornitori = fornitori;
	}

	public void addFornitore(Fornitore f) {
		fornitori.add(f);	
	}

}
