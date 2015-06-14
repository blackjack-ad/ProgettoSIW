package it.romatre.gamestore.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.dominio.Indirizzo;
import it.romatre.gamestore.dominio.Prodotto;

@Stateless
public class ProdottoFacade {
	
	@PersistenceContext(unitName = "unit-prodotto")
	private EntityManager em;

	public Prodotto createProdotto(Long codiceSeriale, DescrizioneProdotto descrizione, Fornitore fornitore) {
		Prodotto prodotto = new Prodotto(codiceSeriale, descrizione, fornitore);
		em.persist(prodotto);
		return prodotto;
	}

}
