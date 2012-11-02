package br.com.caio.blackjack.util;

import java.util.ArrayList;

import br.com.caio.blackjack.model.Baralho;
import br.com.caio.blackjack.model.Carta;

public class MontaBaralho {
	private ArrayList<String> naipes;
	private Baralho baralho;
	
	public MontaBaralho() {
		naipes = new ArrayList<String>();
		baralho = new Baralho();
		naipes.add("Copas");
		naipes.add("Ouros");
		naipes.add("Espadas");
		naipes.add("Paus");
	}
	
	private void addCartas(){
		for (String naipe : naipes) {
			Carta as = new Carta(1,"Ás",naipe);
			Carta dois = new Carta(2, "Dois", naipe);
			Carta tres = new Carta(3, "Tres", naipe);
			Carta quatro = new Carta(4, "Quatro", naipe);
			Carta cinco = new Carta(5, "Cinco", naipe);
			Carta seis = new Carta(6, "Seis", naipe);
			Carta sete = new Carta(7, "Sete", naipe);
			Carta oito = new Carta(8, "Oito", naipe);
			Carta nove = new Carta(9, "Nove", naipe);
			Carta dez = new Carta(10, "Dez", naipe);
			Carta valete = new Carta(10, "Valete", naipe);
			Carta dama = new Carta(10, "Dama", naipe);
			Carta rei = new Carta(10, "Rei", naipe);
			
			baralho.getCartas().add(as);
			baralho.getCartas().add(dois);
			baralho.getCartas().add(tres);
			baralho.getCartas().add(quatro);
			baralho.getCartas().add(cinco);
			baralho.getCartas().add(seis);
			baralho.getCartas().add(sete);
			baralho.getCartas().add(oito);
			baralho.getCartas().add(nove);
			baralho.getCartas().add(dez);
			baralho.getCartas().add(valete);
			baralho.getCartas().add(dama);
			baralho.getCartas().add(rei);
		}
		
	}

	
	
	public Baralho buildBaralho(){
		addCartas();
		this.baralho.embaralha();
		return this.baralho;
	}
}
