package br.com.caio.blackjack.model;

public class Carta {
	private int valor;
	private String nome;
	private String naipe;
	private boolean jaSaiu;
	
	public Carta() {
		this.jaSaiu=false;
	}
	
	
	public boolean jaSaiu() {
		return jaSaiu;
	}
	public void setJaSaiu(boolean jaSaiu) {
		this.jaSaiu = jaSaiu;
	}
	public Carta(int valor, String nome, String naipe) {
		this.valor = valor;
		this.nome = nome;
		this.naipe = naipe;
		this.jaSaiu = false;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	@Override
	public String toString() {
		return this.nome+ "  "+ this.naipe+ "  "+this.valor;
	}
}
