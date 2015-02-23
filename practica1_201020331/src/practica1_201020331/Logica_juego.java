package practica1_201020331;

import estructuras.Jugador;
import estructuras.Raiz_Personaje;
import estructuras.Raiz_cola;
import estructuras.Raiz_pila;

/**
 * @author Cristian
 * Clase estatica que manejara las raices de las estructuras
 * de manera aue se pueda navegar entre ventanas con facilidadx
 */
public class Logica_juego {
    private static estructuras.Jugador jugador;
    private static estructuras.Raiz_Personaje planta;
    private static estructuras.Raiz_Personaje zombie;
    private static estructuras.Raiz_cola planta_juego;
    private static estructuras.Raiz_pila zombie_juego;
    
    //metodos get de la clase
    public static Jugador getJugador() {
        return jugador;
    }

    public static Raiz_Personaje getPlanta() {
        return planta;
    }

    public static Raiz_Personaje getZombie() {
        return zombie;
    }

    public static Raiz_cola getPlanta_juego() {
        return planta_juego;
    }

    public static Raiz_pila getZombie_juego() {
        return zombie_juego;
    }
    
    //metodos set de la clase
    public static void setJugador(Jugador jugador) {
        Logica_juego.jugador = jugador;
    }

    public static void setPlanta(Raiz_Personaje planta) {
        Logica_juego.planta = planta;
    }

    public static void setZombie(Raiz_Personaje zombie) {
        Logica_juego.zombie = zombie;
    }

    public static void setPlanta_juego(Raiz_cola planta_juego) {
        Logica_juego.planta_juego = planta_juego;
    }

    public static void setZombie_juego(Raiz_pila zombie_juego) {
        Logica_juego.zombie_juego = zombie_juego;
    }
}//fin de la clase controladora
