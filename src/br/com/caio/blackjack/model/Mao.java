package br.com.caio.blackjack.model;

import java.util.ArrayList;

public class Mao {
	public Mao() {
		this.cartas = new ArrayList<Carta>();
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	private ArrayList<Carta> cartas;
	
	public void mostraMao(){
		
		int valor = 0;
		for (Carta carta : this.cartas) {
			System.out.println(carta);
			valor+= carta.getValor();
		}
		System.out.println("Voce ja tem : "+ valor);
	}
	
	public int valorTotal(){
		int valor = 0;
		for (Carta carta : this.cartas) {
			valor+=carta.getValor();
		}
		return valor;
	}
}
