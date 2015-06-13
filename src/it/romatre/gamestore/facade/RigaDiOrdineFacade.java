package it.romatre.gamestore.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

}
