package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.Indirizzo;
import it.romatre.gamestore.dominio.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Stateless 
public class UtenteFacade {

	@PersistenceContext(unitName = "unit-utente")
	private EntityManager em;

	public Utente createUtente(String nome, String cognome, String email, String password, String numeroTelefono, 
								String stato, String citta, String cap, String via, String dataNascita) {
		Indirizzo indirizzo = new Indirizzo(stato,citta,cap,via);
		Utente utente = new Utente(nome, cognome, email, password, numeroTelefono, indirizzo, dataNascita);
		em.persist(utente);
		return utente;
	}

	public Utente getUtente(String email) {
		Utente utente = em.find(Utente.class, email);
		return utente;
	}

	public List<Utente> getAllUtenti() {
		CriteriaQuery<Utente> cq = em.getCriteriaBuilder().createQuery(Utente.class);
		cq.select(cq.from(Utente.class));
		List<Utente> utenti = em.createQuery(cq).getResultList();
		return utenti;
	}

	public void updateUtente(Utente utente) {
		em.merge(utente);
	}

	private void deleteUtente(Utente utente) {
		em.remove(utente);
	}

	public void deleteUtente(String email) {
		Utente utente = em.find(Utente.class, email);
		deleteUtente(utente);
	}
} 