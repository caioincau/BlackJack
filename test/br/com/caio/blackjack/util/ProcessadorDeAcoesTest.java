package br.com.caio.blackjack.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caio.blackjack.model.Baralho;
import br.com.caio.blackjack.model.Carta;
import br.com.caio.blackjack.model.Mao;

public class ProcessadorDeAcoesTest {
	
	ProcessadorDeAcoes processador;
	@Before
	public void setUp(){
		processador = new ProcessadorDeAcoes();
		MontaBaralho monta = new MontaBaralho();
		Baralho baralho = monta.buildBaralho();
		Mao player = new Mao();
		Mao computador = new Mao();
		processador.setBaralho(baralho);
		processador.setPlayer(player);
		processador.setComputador(computador);
		
	}

	@Test
	public void playerDeveGanhar() {
		playerCom21();
		oponenteCom20();
		String winner = processador.getWinner();
		assertEquals("Jogador Ganhou !", winner);
	}
	@Test
	public void deveEmpatar(){
		playerCom20();
		oponenteCom20();
		String winner = processador.getWinner();
		assertEquals("Empate", winner);
	}
	
	@Test
	public void playerDevePerder(){
		playerCom20();
		oponenteCom21();
		String winner = processador.getWinner();
		assertEquals("Computador Ganhou !", winner);
	}
	
	@Test
	public void playerDeveEstourar(){
		playerCom30();
		oponenteCom21();
		String winner = processador.getWinner();
		assertEquals("Computador Ganhou", winner);
	}
	
	
	private void playerCom30(){
		processador.getPlayer().getCartas().add(new Carta(10, "Damas", "Copas"));
		processador.getPlayer().getCartas().add(new Carta(10, "Rei", "Copas"));
		processador.getPlayer().getCartas().add(new Carta(10, "Valete", "Copas"));
	}
	private void playerCom20(){
		processador.getPlayer().getCartas().add(new Carta(10, "Damas", "Copas"));
		processador.getPlayer().getCartas().add(new Carta(10, "Rei", "Copas"));
	}
	private void playerCom21(){
		processador.getPlayer().getCartas().add(new Carta(10, "Damas", "Copas"));
		processador.getPlayer().getCartas().add(new Carta(10, "Rei", "Copas"));
		processador.getPlayer().getCartas().add(new Carta(1, "As", "Copas"));
	}
	private void oponenteCom20(){
		processador.getComputador().getCartas().add(new Carta(10, "Rei", "Ouros"));
		processador.getComputador().getCartas().add(new Carta(10, "Damas", "Espadas"));
	}
	private void oponenteCom21(){
		processador.getComputador().getCartas().add(new Carta(10, "Rei", "Ouros"));
		processador.getComputador().getCartas().add(new Carta(10, "Damas", "Espadas"));
		processador.getComputador().getCartas().add(new Carta(1, "As", "Espadas"));
	}
}
