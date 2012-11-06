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
	
	public String mostraMao(){
		String cartas = "<html>" ;
		int valor = 0;
		for (Carta carta : this.cartas) {
			cartas += carta.getNome() + " de "+carta.getNaipe()+ "<br>";
			valor+= carta.getValor();
		}
		cartas+= "</html>";
		return cartas;
	}
	
	public int valorTotal(){
		int valor = 0;
		for (Carta carta : this.cartas) {
			valor+=carta.getValor();
		}
		return valor;
	}
}
