package br.com.caio.blackjack.util;

import javax.swing.JOptionPane;

import br.com.caio.blackjack.model.Baralho;
import br.com.caio.blackjack.model.Mao;

public class ProcessadorDeAcoes {
	
	private Baralho baralho;
	private Mao player;
	
	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public Mao getPlayer() {
		return player;
	}

	public void setPlayer(Mao player) {
		this.player = player;
	}

	public ProcessadorDeAcoes() {
		MontaBaralho montaBaralho = new MontaBaralho();
		baralho = montaBaralho.buildBaralho();
		player = new Mao();
		player.getCartas().add(baralho.getCarta());
		player.getCartas().add(baralho.getCarta());
		
	}
	
	public void processaContinuar(){
		player.getCartas().add(baralho.getCarta());
		if(player.valorTotal()>21){
			JOptionPane.showMessageDialog(null, "Voce Estourou !");
		}
	}
}
