package tablero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import piedrapapeltijera.*;

/**
 * 
 */
class TestGame {
	
	ElementoDeJuego[] accionesJ1 = {new Papel(),new Tijera(),new Piedra()};
	ElementoDeJuego[] accionesJ2 = {new Tijera(),new Papel(),new Papel()};
	
	@Test
	void testJuegoPapel() {
		assertTrue(new Papel().play(new Papel()) == 0);
		assertTrue(new Papel().play(new Tijera()) == -1);
		assertTrue(new Papel().play(new Piedra()) == 1);
	}
	
	@Test
	void testJuegoTijera() {
		assertTrue(new Tijera().play(new Tijera()) == 0);
		assertTrue(new Tijera().play(new Papel()) == 1);
		assertTrue(new Tijera().play(new Piedra()) == -1);
	}

	@Test
	void testJuegoPiedra() {
		assertTrue(new Piedra().play(new Piedra()) == 0);
		assertTrue(new Piedra().play(new Papel()) == -1);
		assertTrue(new Piedra().play(new Tijera()) == 1);
	}

	

	

}
