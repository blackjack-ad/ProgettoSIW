package it.romatre.gamestore.facade;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import it.romatre.gamestore.dominio.DescrizioneProdotto;

@Stateless
public class DescrizioneProdottoFacade {

	@PersistenceContext(unitName = "unit-descrizione-prodotto")
	private EntityManager em;

	private DescrizioneProdotto dp; 

	public DescrizioneProdotto createDescrizioneProdotto(String nome,
			Double prezzo, String descrizione) {
		//successivamente persistenza
		dp = new DescrizioneProdotto(nome,prezzo,descrizione);
		em.persist(dp);
		return dp;
	}
	
	public DescrizioneProdotto getDescrizioneProdotto(Long id) {
		DescrizioneProdotto product = em.find(DescrizioneProdotto.class, id);
		return product;
	}

	public List<DescrizioneProdotto> getAllDescrizioneProdotti() {
		CriteriaQuery<DescrizioneProdotto> cq = em.getCriteriaBuilder().createQuery(DescrizioneProdotto.class);
		cq.select(cq.from(DescrizioneProdotto.class));
		List<DescrizioneProdotto> products = em.createQuery(cq).getResultList();
		return products;
	}

}
