package piedrapapeltijera;

/**
 * 
 */
public interface ElementoDeJuego {
	// 1 Gana, 0 empate, -1 pierde
	int play (ElementoDeJuego v);
	int playWithStone (Piedra v);
	int playWithPaper (Papel v);
	int playWithScissor (Tijera v);
}
