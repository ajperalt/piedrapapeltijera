package piedrapapeltijera;

/**
 * 
 */
public class Papel implements ElementoDeJuego {

	@Override
	public int play(ElementoDeJuego v) {
		return v.playWithPapel(this);
	}

	@Override
	public int playWithPiedra(Piedra v) {
		return -1;
	}

	@Override
	public int playWithPapel(Papel v) {
		return 0;
	}

	@Override
	public int playWithTijera(Tijera v) {
		return 1;
	}

	

}
