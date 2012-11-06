package br.com.caio.blackjack.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MaoTest {
	Mao mao;
	@Before
	public void setUp(){
		this.mao = new Mao();
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		cartas.add(new Carta(10, "Damas", "Copas"));
		mao.setCartas(cartas);
	}

	@Test
	public void deveRetornarAsCartasEmHTML() {
		assertEquals("<html>Damas de Copas<br></html>", mao.mostraMao());
	}

}
