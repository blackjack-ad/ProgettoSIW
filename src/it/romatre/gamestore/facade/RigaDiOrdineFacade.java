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

	public RigaDiOrdine getRigaDiOrdine(Long id){
    	return em.find(RigaDiOrdine.class,id);
    }
	public void deleteRigaDiOrdine(Long id) {
		RigaDiOrdine riga = em.find(RigaDiOrdine.class, id);
		deleteRigaDiOrdine(riga);
	}

	public Integer presentiInMagazzino(RigaDiOrdine rdo) {
		Long id = rdo.getDescrizioneProdotto().getId();
		System.out.println("L'ID della descrizione prodotto  é :" + id);


		Query q = em.createQuery("SELECT COUNT (p.codiceSeriale) FROM prodotto p WHERE"
				+ " p.descrizione.id =" + id);
		Integer count = ( (Long) q.getSingleResult() ).intValue();
		return count;
	}

	public void rimuoviProdotto(RigaDiOrdine rdo) {
		Long id = rdo.getDescrizioneProdotto().getId();
		for (int i=0; i<rdo.getQuantita(); i++) {	


			em.createNativeQuery("DELETE FROM prodotto "
					+ "WHERE codiceSeriale "
					+ "IN ( SELECT codiceSeriale "
					+ "FROM prodotto  "
					+ "WHERE descrizione_id= 1 "
					+ "LIMIT 1)").executeUpdate();

		}

	}

}
