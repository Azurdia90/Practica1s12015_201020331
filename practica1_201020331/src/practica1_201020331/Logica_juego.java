package practica1_201020331;

import estructuras.Jugador;
import estructuras.Raiz_Personaje;

/**
 * @author Cristian
 * Clase estatica que manejara las raices de las estructuras
 * de manera aue se pueda navegar entre ventanas con facilidadx
 */
public class Logica_juego {
    
    private static estructuras.Jugador jugador;
    private static estructuras.Raiz_Personaje planta;
    private static estructuras.Raiz_Personaje zombie;

    public static void setJugador(Jugador jugador) {
        Logica_juego.jugador = jugador;
    }

    public static void setPlanta(Raiz_Personaje planta) {
        Logica_juego.planta = planta;
    }

    
    

}
