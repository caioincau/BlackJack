package br.com.caio.blackjack.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caio.blackjack.model.Baralho;

public class MontaBaralhoTest {
	MontaBaralho montaBaralho;
	@Before
	public void setUp(){
		montaBaralho = new MontaBaralho();
	}
	
	@Test
	public void deveRetornar52Cartas() {
		Baralho baralho = montaBaralho.buildBaralho();
		assertEquals(52,baralho.getCartas().size() );
	}

}
