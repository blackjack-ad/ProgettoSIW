package it.romatre.gamestore.dominio;

public class Fornitore {
	
	private Long id;
	private String nome;
	private String email;
	private String telefono;
	private Indirizzo indirizzo;
	private String partitaIVA;
	
	public Fornitore(String nome, String email, String telefono,
			Indirizzo indirizzo, String PartitaIVA) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.partitaIVA = partitaIVA;
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
	
	
	
}
