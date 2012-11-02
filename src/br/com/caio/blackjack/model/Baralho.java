package br.com.caio.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baralho {
	private ArrayList<Carta> cartas;
	
	public Baralho() {
		cartas = new ArrayList<Carta>();
	}
	
	
	public void embaralha(){
		Collections.shuffle(this.cartas);
	}


	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public Carta getCarta(){
		Random random = new Random(); 
		int rand = random.nextInt(cartas.size()) + 0;
		while (cartas.get(rand).jaSaiu() == true) {
			rand = random.nextInt(cartas.size()) + 0;
		}
		cartas.get(rand).setJaSaiu(true);
		return cartas.get(rand);
	}

}
