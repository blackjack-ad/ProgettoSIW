package it.romatre.gamestore.facade;

import it.romatre.gamestore.controller.DescrizioneProdottoController;
import it.romatre.gamestore.controller.RigaDiOrdineController;
import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Ordine;
import it.romatre.gamestore.dominio.RigaDiOrdine;
import it.romatre.gamestore.dominio.Utente;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedProperty;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class OrdineFacade {
	
	@PersistenceContext(unitName = "unit-ordine")
	private EntityManager em;
	
	@EJB
	private RigaDiOrdineFacade rigaDiOrdineFacade;

	public Ordine createOrdine(Utente u){
		Ordine ordine = new Ordine();
		ordine.setUtente(u);
		em.persist(ordine);
		return ordine;
	}

	public Ordine persistiOrdine(Ordine o){
		if(o.getId()==null)
			em.persist(o);
		else
			em.merge(o);
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
	
	public List<Ordine> getAllOrdiniDaEvadereOSospesi() {
		Query q = 
				em.createQuery("SELECT o FROM ordine o WHERE o.stato = 'chiuso' OR o.stato = 'sospeso'");
		List<Ordine> ordini = q.getResultList();
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
	
	public boolean evasionePossibile(Ordine ordine) {
		List<RigaDiOrdine> righeDiOrdine = new ArrayList<RigaDiOrdine>(ordine.getRigheDiOrdine());
		boolean possibile = true; 
		for (RigaDiOrdine rdo : righeDiOrdine) {
			System.out.println("presenti in magazino:" + rigaDiOrdineFacade.presentiInMagazzino(rdo) +
					"quantità:" + rdo.getQuantita());
			possibile = rigaDiOrdineFacade.presentiInMagazzino(rdo)>rdo.getQuantita();
			System.out.println(possibile);
		}
		if(possibile){
			for(RigaDiOrdine rdo : righeDiOrdine){
				rigaDiOrdineFacade.rimuoviProdotto(rdo);
			}
		}		
		
		return possibile;
	}

	private boolean presentiInMagazzino(RigaDiOrdine rdo) {
		if (rigaDiOrdineFacade.presentiInMagazzino(rdo)>rdo.getQuantita()) {
			rigaDiOrdineFacade.rimuoviProdotto(rdo);
			return true;
		}
		return false;
	}

	public Integer contaElementiOrdine(Ordine o) {
		int cont = 0; 
		List<DescrizioneProdotto> desc = new ArrayList<>();
		for (RigaDiOrdine rdo : o.getRigheDiOrdine()){
			if(desc.indexOf(rdo.getDescrizioneProdotto())==-1){
				cont++;
				desc.add(rdo.getDescrizioneProdotto());
			}
		}
		return cont;
	}
}
