package piedrapapeltijera;

/**
 * 
 */
public class Tijera implements ElementoDeJuego {

	@Override
	public int play(ElementoDeJuego v) {
		return v.playWithTijera(this);
	}

	@Override
	public int playWithPiedra(Piedra v) {
		return 1;
	}

	@Override
	public int playWithPapel(Papel v) {
		return -1;
	}

	@Override
	public int playWithTijera(Tijera v) {
		return 0;
	}

}
