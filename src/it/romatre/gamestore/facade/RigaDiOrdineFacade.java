package it.romatre.gamestore.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.RigaDiOrdine;

@Stateless
public class RigaDiOrdineFacade {

	@PersistenceContext(unitName = "unit-riga-di-ordine")
	private EntityManager em;

	private RigaDiOrdine rdo; 
	
	public void updateRigaDiOrdine(RigaDiOrdine riga) {
        em.merge(riga);
	}
	
    private void deleteRigaDiOrdine(RigaDiOrdine riga) {
        em.remove(riga);
    }

	public void deleteRigaDiOrdine(Long id) {
        RigaDiOrdine riga = em.find(RigaDiOrdine.class, id);
        deleteRigaDiOrdine(riga);
	}

	public Integer presentiInMagazzino(RigaDiOrdine rdo) {
		Long id = this.rdo.getDescrizioneProdotto().getId();
		int quantita = 0;
		
		Query q = em.createQuery("COUNT * FROM prodotto p WHERE +"
				+ " descrizione_id = '" + id + "'");
		quantita = (int) q.getSingleResult();
		return quantita;
	}

	public void rimuoviProdotto(Integer quantita) {
		String id = this.rdo.getDescrizioneProdotto().getId().toString();
		for (int i=0; i<quantita; i++) {
		
			Query q = em.createQuery("DELETE FROM prodotto p WHERE ctid IN  +"
					+ "( SELECT ctid FROM prodotto + "
					+ "   WHERE descrizione_id = '" + id + "' LIMIT 1)");
		}
		
	}

}
