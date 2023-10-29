package tablero;

import java.util.HashMap;
import java.util.Scanner;
import piedrapapeltijera.*;

public class Main {

    public static void main(String[] args) {

    	int eleccionJugador1 = 0;

        // Arreglo con opciones de juego
        ElementoDeJuego[] accion = {new Papel(), new Tijera(), new Piedra()};

        // Arreglo con opciones de resultados posibles
        HashMap<Integer, String> resultados = new HashMap<>();
        resultados.put(0, "Empate!");
        resultados.put(1, "¡Ganaste!");
        resultados.put(-1, "¡Computadora gana!");
        
    	// variable que obtiene opciones elegidas del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Piedra-Papel-Tijera!");
        System.out.println("-------------------------------------------");

        do {
            System.out.println("Elige tu jugada (0 para Papel, 1 para Tijera, 2 para Piedra, 3 para salir): ");
            // Guardando registro del jugador
            eleccionJugador1 = scanner.nextInt();

            if(eleccionJugador1 >= 0 && eleccionJugador1 <= 3) {
                System.out.println("Has elegido: " + accion[eleccionJugador1].getClass().getSimpleName());

                int eleccionComputadora = (int) (Math.random() * 2 + 1);
                System.out.println("computadora eligió: " + accion[eleccionComputadora].getClass().getSimpleName());

                int resultado = accion[eleccionJugador1].play(accion[eleccionComputadora]);

                System.out.println(resultados.get(resultado));
            	
            }else {
            	System.out.println("Debe seleccionar una opcion valida");
            }
        } while (eleccionJugador1 != 3);
        scanner.close();
    }
}