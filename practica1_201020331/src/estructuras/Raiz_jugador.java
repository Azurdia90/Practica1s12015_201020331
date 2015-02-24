package estructuras;

/**
 * @author Cristian
 * CLASE QUE SERIA EL NODO RAIZ DE LA GRAFICA NO. 1
 * CONTIENE NODOS DEL TIPO JUGADOR_PLANTA Y ZOMBIE
 * 
 */
public class Raiz_jugador {
    
    private Jugador raiz_jugador;
    private Jugador cola_jugador;
    
    //constructor de la Clase
    public Raiz_jugador(){
        raiz_jugador = null;
        cola_jugador = null;
    }
    //metodos get de la clase
    public Jugador getRaiz_jugador() {
        return raiz_jugador;
    }

    public Jugador getCola_jugador() {
        return cola_jugador;
    }

    //metodos set de la clase
    public void setRaiz_jugador(Jugador raiz_jugador) {
        this.raiz_jugador = raiz_jugador;
    }

    public void setCola_jugador(Jugador cola_jugador) {
        this.cola_jugador = cola_jugador;
    }
      
}//fin de la clase


