package it.romatre.gamestore.facade;

import it.romatre.gamestore.dominio.DescrizioneProdotto;

public class DescrizioneProdottoFacade {
	
	private DescrizioneProdotto dp; 

	public DescrizioneProdotto createDescrizioneProdotto(String nome,
			Float prezzo, String descrizione) {
		//successivamente persitenza
		dp = new DescrizioneProdotto(nome,prezzo,descrizione);
		return dp;
	}

}
