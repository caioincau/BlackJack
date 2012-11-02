package br.com.caio.blackjack.main;

import java.util.Random;

import javax.swing.JOptionPane;

import br.com.caio.blackjack.model.Baralho;
import br.com.caio.blackjack.model.Carta;
import br.com.caio.blackjack.model.Mao;
import br.com.caio.blackjack.util.MontaBaralho;

public class Main {

	public static void main(String[] args) {
		MontaBaralho montaBaralho = new MontaBaralho();
		Baralho baralho = montaBaralho.buildBaralho();
		
		boolean continuar=true;
		Mao player = new Mao();
		player.getCartas().add(baralho.getCarta());
		player.getCartas().add(baralho.getCarta());
		player.mostraMao();
		String opcao = JOptionPane.showInputDialog("Quer Continuar s/n?");
		continuar = validaCheckbox(opcao);
		while (continuar) {
			player.getCartas().add(baralho.getCarta());
			player.mostraMao();
			opcao = JOptionPane.showInputDialog("Quer Continuar s/n?");
			continuar = validaCheckbox(opcao);
		}
		
	}
	
	public static boolean validaCheckbox(String opcao){
		if (opcao.equalsIgnoreCase("s")) {
			return true;
			
		} else {
			return false;
		}
	}

}
