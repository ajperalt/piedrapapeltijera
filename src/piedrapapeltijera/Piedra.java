package piedrapapeltijera;

/**
 * 
 */
public class Piedra  implements ElementoDeJuego {

	@Override
	public int play(ElementoDeJuego v) {
		return v.playWithPiedra(this);	
	}

	@Override
	public int playWithPiedra(Piedra v) {
		return 0;
	}

	@Override
	public int playWithPapel(Papel v) {
		return 1;
	}

	@Override
	public int playWithTijera(Tijera v) {
		return -1;
	}

}
