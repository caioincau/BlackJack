package br.com.caio.blackjack.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.caio.blackjack.util.MontaBaralho;

public class BaralhoTest {
	Baralho baralho;
	@Before
	public void setUp() throws Exception {
		MontaBaralho montaBaralho = new MontaBaralho();
		baralho = montaBaralho.buildBaralho();
	}

	@Test
	public void deveTirarACartaEMarcarQueJaSaiu() {
		for (int i = 0; i < baralho.getCartas().size(); i++) {
			assertTrue(baralho.getCarta().jaSaiu());
		}
	}
	@Test
	public void deveEmbaralharAsCartas() throws Exception {
		Carta carta = baralho.getCartas().get(0);
		baralho.embaralha();
		Carta carta2 = baralho.getCartas().get(0);
		assertFalse(carta.getNome().equalsIgnoreCase(carta2.getNome()) || carta.getNaipe().equalsIgnoreCase(carta2.getNaipe()));
	}

}
