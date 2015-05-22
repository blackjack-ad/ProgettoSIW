package it.romatre.gamestore.dominio;

public class DescrizioneProdotto {

	private Long id;
	private String nome;
	private Double prezzo;
	private String descrizione;
	
	public DescrizioneProdotto(String nome, double prezzo, String descrizione) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	
}
