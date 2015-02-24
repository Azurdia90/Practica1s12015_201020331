package practica1_201020331;

import estructuras.Raiz_jugador;
import estructuras.Raiz_Personaje;
import estructuras.Raiz_cola;
import estructuras.Raiz_pila;

/**
 * @author Cristian
 * Clase estatica que manejara las raices de las estructuras
 * de manera aue se pueda navegar entre ventanas con facilidadx
 */
public class Logica_juego {
    
    private static int tamaño_x;
    private static int tamaño_y;
    
    private static estructuras.Raiz_jugador jugador;
    private static estructuras.Raiz_Personaje planta;
    private static estructuras.Raiz_Personaje zombie;
    private static estructuras.Raiz_cola planta_juego;
    private static estructuras.Raiz_pila zombie_juego;
    
    //metodos get de la clase
    public static int getTamaño_x() {
        return tamaño_x;
    }

    public static int getTamaño_y() {
        return tamaño_y;
    }

    public static Raiz_jugador getJugador() {
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
    public static void setTamaño_x(int tamaño_x) {
        Logica_juego.tamaño_x = tamaño_x;
    }

    public static void setTamaño_y(int tamaño_y) {
        Logica_juego.tamaño_y = tamaño_y;
    }

    public static void setJugador(Raiz_jugador jugador) {
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
