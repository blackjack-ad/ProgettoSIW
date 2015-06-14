package it.romatre.gamestore.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="prodotto")
public class Prodotto {
	
	@Column(nullable = false)
	private Long codiceSeriale;
	@ManyToOne
	private DescrizioneProdotto descrizione;
	@ManyToOne
	private Fornitore fornitore;

	public Prodotto(Long codiceSeriale, DescrizioneProdotto descrizione, Fornitore fornitore) {
		super();
		this.descrizione = descrizione;
		this.codiceSeriale = codiceSeriale;
		this.fornitore = fornitore;
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

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}
	
	
}
