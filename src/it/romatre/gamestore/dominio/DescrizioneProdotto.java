package it.romatre.gamestore.dominio;

import java.io.File;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllDescrProd", query="SELECT dp FROM DescrizioneProdotto dp")
public class DescrizioneProdotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	private Double prezzo;

	@Column(length = 2000)
	private String descrizione;
	
	public DescrizioneProdotto(){
		
	}

	public DescrizioneProdotto(String nome, double prezzo, String descrizione) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}
	
	public Long getId() {
		return id;
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

	@Override
	public boolean equals(Object obj) {
		DescrizioneProdotto dp = (DescrizioneProdotto)obj;
		return this.nome.equals(dp.getNome());
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	public void setId(Long id) {
		this.id = id;
	}


	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
}
