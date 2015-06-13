package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.Indirizzo;
import it.romatre.gamestore.dominio.Utente;
import it.romatre.gamestore.utility.MD5;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Stateless 
public class UtenteFacade {

	@PersistenceContext(unitName = "unit-utente")
	private EntityManager em;

	public Utente createUtente(String nome, String cognome, String email, String password, String numeroTelefono, 
			String stato, String citta, String cap, String via, String dataNascita) {
		Indirizzo indirizzo = new Indirizzo(stato,citta,cap,via);
		MD5 codificatoreMD5 = new MD5();
		String md5PWD = codificatoreMD5.toMD5(password);
		Utente utente = new Utente(nome, cognome, email, md5PWD, numeroTelefono, indirizzo, dataNascita);
		em.persist(utente);
		return utente;
	}

	public Utente getUtente(String email) {
		List<Utente> utenti;
		Query q = em.createQuery("SELECT u FROM utente u WHERE u.email='" + email +"'");
		utenti = q.getResultList();
		if (utenti.isEmpty()) 
			return null;
		else return utenti.get(0);

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