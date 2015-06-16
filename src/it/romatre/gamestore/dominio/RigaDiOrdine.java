package it.romatre.gamestore.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class RigaDiOrdine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Integer quantita;

	@Column(nullable = false)
	@OneToOne(fetch=FetchType.EAGER)
	private DescrizioneProdotto descrizioneProdotto;

	@ManyToOne(fetch = FetchType.EAGER)
	private Ordine ordine;

	public RigaDiOrdine(){

	}

	public RigaDiOrdine(Integer quantita, DescrizioneProdotto descrizioneProdotto) {
		super();
		this.quantita = quantita;
		this.descrizioneProdotto = descrizioneProdotto;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

}
