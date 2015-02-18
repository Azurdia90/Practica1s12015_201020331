package estructuras;

/**
 * @author Cristian
 * CLASE QUE SERIA EL NODO RAIZ DE LA GRAFICA NO. 1
 * CONTIENE NODOS DEL TIPO JUGADOR_PLANTA Y ZOMBIE
 * 
 */
public class Jugador {
    
    private Jugador_planta raiz_jugador1;
    private Jugador_zombie raiz_jugador2;
    
    //constructor de la Clase
    public Jugador(){
        raiz_jugador1 = null;
        raiz_jugador2 = null;
    }
    //metodos get de la clase
    public Jugador_planta getRaiz_jugador1() {
        return raiz_jugador1;
    }

    public Jugador_zombie getRaiz_jugador2() {
        return raiz_jugador2;
    }

    //metodos set de la clase
    public void setRaiz_jugador1(Jugador_planta raiz_jugador1) {
        this.raiz_jugador1 = raiz_jugador1;
    }

    public void setRaiz_jugador2(Jugador_zombie raiz_jugador2) {
        this.raiz_jugador2 = raiz_jugador2;
    }
    
}//fin de la clase
