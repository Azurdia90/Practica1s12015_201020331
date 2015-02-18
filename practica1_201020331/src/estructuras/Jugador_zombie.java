package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJA EL NODO DEL JUGADOR TIPO ZOMBIE
 * ALMACENA LAS CARACTERISTICAS Y SUS ENLACES, RAICES
 * 
 */
public class Jugador_zombie {
    
    private String nombre;
    private int cantidad;
    //raiz de la lista de campos extra
    private Nodo_extra raiz;
    private Nodo_extra cola;
    
    //constructor de la clase
    public Jugador_zombie(String n, int c){
        nombre = n;
        cantidad = c;
        raiz = null;
    }
    
    //metodos get de la clase
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Nodo_extra getRaiz() {
        return raiz;
    }

    public Nodo_extra getCola() {
        return cola;
    }
    
    //metodos set de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setRaiz(Nodo_extra raiz) {
        this.raiz = raiz;
    }

    public void setCola(Nodo_extra cola) {
        this.cola = cola;
    }
      
}//fin public class Jugador_zombie
