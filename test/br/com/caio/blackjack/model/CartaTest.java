package br.com.caio.blackjack.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartaTest {

	@Test
	public void toStringModificado() {
		Carta carta = new Carta(10, "Damas", "Copas");
		assertEquals("Damas  Copas  10", carta.toString());
	}

}
