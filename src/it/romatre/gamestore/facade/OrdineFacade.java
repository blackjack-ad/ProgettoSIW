package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.Utente;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		
		public Ordine getOrdine(Long id) {
			Query q = em.createQuery("SELECT o FROM ordine o WHERE o.id='" + id +"'");
			Ordine ordine = (Ordine) q.getSingleResult();
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

}
