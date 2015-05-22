package it.romatre.gamestore.dominio;

public class RigaDiOrdine {
	
	private long quantità;
	private DescrizioneProdotto descrizioneProdotto;
	
	public RigaDiOrdine(long quantità, DescrizioneProdotto descrizioneProdotto) {
		super();
		this.quantità = quantità;
		this.descrizioneProdotto = descrizioneProdotto;
	}

	public long getQuantità() {
		return quantità;
	}

	public void setQuantità(long quantità) {
		this.quantità = quantità;
	}

	public DescrizioneProdotto getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(DescrizioneProdotto descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}
}
