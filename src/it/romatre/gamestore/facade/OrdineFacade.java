package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.Utente;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class OrdineFacade {


	@PersistenceContext(unitName = "unit-ordine")
	private EntityManager em;

	public Ordine createOrdine(Utente u){
		Ordine ordine = new Ordine();
		ordine.setUtente(u);
		em.persist(ordine);
		return ordine;
	}

	public Ordine persistiOrdine(Ordine o){
		em.persist(o);
		return o;
	}

	public Ordine getOrdine(Long id) {
		Ordine ordine = em.find(Ordine.class, id);
		return ordine;
	}


	public List<Ordine> getAllOrdini() {
		CriteriaQuery<Ordine> cq = em.getCriteriaBuilder().createQuery(Ordine.class);
		cq.select(cq.from(Ordine.class));
		List<Ordine> ordini = em.createQuery(cq).getResultList();
		return ordini;
	}

	public void updateOrdine(Ordine ordine) {
		em.merge(ordine);
	}

	public void deleteOrdine(Ordine ordine) {
		em.remove(ordine);
	}

	public void deleteOrdine(Long id) {
		Ordine ordine = em.find(Ordine.class, id);
		deleteOrdine(ordine);
	}

	public List<Ordine> getAllOrdiniUtente(Long idUtente) {
		String s = String.valueOf(idUtente);
		TypedQuery<Ordine> q = 
				em.createQuery("SELECT o FROM ordine o WHERE o.utente.id=" + idUtente,
						Ordine.class);
		List<Ordine> ordini = q.getResultList();
		return ordini;
	}

}
