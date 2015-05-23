package it.romatre.gamestore.dominio;

public class RigaDiOrdine {
	
	private long quantita;
	private DescrizioneProdotto descrizioneProdotto;
	
	public RigaDiOrdine(long quantita, DescrizioneProdotto descrizioneProdotto) {
		super();
		this.quantita = quantita;
		this.descrizioneProdotto = descrizioneProdotto;
	}

	public long getQuantita() {
		return quantita;
	}

	public void setQuantita(long quantita) {
		this.quantita = quantita;
	}

	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}
}
