package piedrapapeltijera;

/**
 * 
 */
public interface ElementoDeJuego {
	// 1 Gana, 0 empate, -1 pierde
	int play (ElementoDeJuego v);
	int playWithPiedra (Piedra v);
	int playWithPapel (Papel v);
	int playWithTijera (Tijera v);
}
