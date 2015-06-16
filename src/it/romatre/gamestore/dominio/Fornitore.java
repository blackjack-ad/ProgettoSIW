package it.romatre.gamestore.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="fornitore")
public class Fornitore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String telefono;
	@OneToOne (cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
	private Indirizzo indirizzo;
	@Column(nullable = false)
	private String partitaIVA;
	
	@ManyToMany(mappedBy = "fornitori",cascade = CascadeType.ALL)
	private List<Prodotto> prodotti;
	
	public Fornitore(){
		this.prodotti = new ArrayList(); 
	}
	
	public Fornitore(String nome, String email, String telefono,
			Indirizzo indirizzo, String partitaIVA) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.partitaIVA = partitaIVA;
		this.prodotti = new ArrayList<Prodotto>(); 
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

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	public void addProdotto(Prodotto p){
		this.prodotti.add(p);
	}
	
}
