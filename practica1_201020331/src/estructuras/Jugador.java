package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJA EL NODO DEL JUGADOR 
 * ALMACENA LAS CARACTERISTICAS Y SUS ENLACES A LAS RAICES
 * 
 */

public class Jugador {
    
    private String nombre;
    private int cantidad;
    private boolean tipo;
    //apuntador hacia otro jugador
    private Jugador  next;
    private Jugador back;
    //raiz de la lista de campos extra
    private Nodo_extra raiz;
    private Nodo_extra cola;
    
    //contructor de la clase
    public Jugador(String n, int c, boolean t){
        nombre = n;
        cantidad = c;
        tipo = t;
        next = null;
        back = null;
        raiz = null;
        cola = null;
    }

    //metodos get de la clase
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isTipo() {
        return tipo;
    }

    public Jugador getNext() {
        return next;
    }

    public Jugador getBack() {
        return back;
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

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public void setNext(Jugador next) {
        this.next = next;
    }

    public void setBack(Jugador back) {
        this.back = back;
    }

    public void setRaiz(Nodo_extra raiz) {
        this.raiz = raiz;
    }

    public void setCola(Nodo_extra cola) {
        this.cola = cola;
    }

}//fin public class Jugador
