package it.romatre.gamestore.dominio;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name="utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String telefono;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;

	private String dataNascita;

	@OneToOne (cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
	private Indirizzo indirizzo;

	private Ordine ordineCorrente;

	@OneToMany(mappedBy="utente")
	private List<Ordine> ordini;

	public Utente(String nome, String cognome, String email, String password, String telefono, Indirizzo indirizzo,String dataNascita ) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.dataNascita = dataNascita;
		this.indirizzo = indirizzo;
		this.ordini = new ArrayList<Ordine>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Ordine getOrdineCorrente() {
		return ordineCorrente;
	}

	public void setOrdineCorrente(Ordine ordineCorrente) {
		this.ordineCorrente = ordineCorrente;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String printDataNascita(){
		return this.dataNascita.toString();
	}

	public String printIndirizzo(){
		return this.indirizzo.getStato() + " " + this.indirizzo.getCitta() + " " + this.indirizzo.getCitta();
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
