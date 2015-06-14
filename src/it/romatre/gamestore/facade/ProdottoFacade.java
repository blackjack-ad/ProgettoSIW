package it.romatre.gamestore.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.romatre.gamestore.dominio.DescrizioneProdotto;
import it.romatre.gamestore.dominio.Fornitore;
import it.romatre.gamestore.dominio.Indirizzo;
import it.romatre.gamestore.dominio.Prodotto;

@Stateless
public class ProdottoFacade {
	
	@EJB
	private FornitoreFacade fornitoreFacade;
	
	@PersistenceContext(unitName = "unit-prodotto-2")
	private EntityManager em;

	public Prodotto createProdotto(Long codiceSeriale, DescrizioneProdotto descrizione, Long[] fornitoriId) {
		Prodotto prodotto = new Prodotto(codiceSeriale, descrizione);
		int i; 
		for(i=0; i<fornitoriId.length; i++){
			Fornitore f = fornitoreFacade.getFornitore(fornitoriId[i]);
			prodotto.addFornitore(f);
			System.out.println(f.getNome());
		}
		System.out.println(prodotto.getFornitori().size());
		em.persist(prodotto);
		return prodotto;
	}

}
