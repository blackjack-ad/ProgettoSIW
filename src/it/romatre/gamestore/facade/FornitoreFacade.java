package it.romatre.gamestore.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.dominio.Indirizzo;

@Stateless
public class FornitoreFacade {
	
	@PersistenceContext(unitName = "unit-fornitore")
	private EntityManager em;

	public Fornitore createFornitore(String nome, String email, String telefono, String stato, String citta, String cap, String via, String partitaIVA) {
		Indirizzo indirizzo = new Indirizzo(stato,citta,cap,via);
		Fornitore fornitore = new Fornitore(nome, email, telefono, indirizzo, partitaIVA);
		em.persist(fornitore);
		return fornitore;
	}

	public Fornitore getFornitore(String nome) {
		List<Fornitore> fornitori;
		Query q = em.createQuery("SELECT f FROM fornitore f WHERE f.nome='" + nome +"'");
		fornitori = q.getResultList();
		if (fornitori.isEmpty()) 
			return null;
		else return fornitori.get(0);

	}
}
