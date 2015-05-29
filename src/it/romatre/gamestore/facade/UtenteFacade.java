package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.Indirizzo;
import it.romatre.gamestore.dominio.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Date;
import java.util.List;

@Stateless 
public class UtenteFacade {
	
    @PersistenceContext(unitName = "unit-progettoSIW_prova")
    private EntityManager em;
    
	public Utente createUtente(String nome, String cognome, String email, String password, Integer giorno, Integer mese, Integer anno, String numeroTelefono, String stato, String citta, String cap, String via) {
		@SuppressWarnings("deprecation")
		Date dataNascita = new Date(anno, mese, giorno);
		Indirizzo indirizzo = new Indirizzo(stato,citta,cap,via);
		Utente utente = new Utente(nome, cognome, email, password, dataNascita, numeroTelefono, indirizzo);
		em.persist(utente);
		return utente;
	}
	
	public Utente getUtente(String email) {
	    Utente utetne = em.find(Utente.class, email);
		return utetne;
	}
	
	public List<Utente> getAllUtenti() {
        CriteriaQuery<Utente> cq = em.getCriteriaBuilder().createQuery(Utente.class);
        cq.select(cq.from(Utente.class));
        List<Utente> utenti = em.createQuery(cq).getResultList();
		return utenti;
	}

	public void updateProduct(Utente utente) {
        em.merge(utente);
	}
	
    private void deleteProduct(Utente utente) {
        em.remove(utente);
    }

	public void deleteProduct(String email) {
        Utente utente = em.find(Utente.class, email);
        deleteProduct(utente);
	}
}