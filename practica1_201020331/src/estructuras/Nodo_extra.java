package estructuras;

/**
 * @author Cristian
 * CLASE NODO QUE CONTENDRA LOS TEXTOS ADICIONALES
 * ESTA FUNCIONA CON JUGADOR PLANTA Y ZOMBIE
 * 
 **/

public class Nodo_extra {
    
    private String texto;
    
    private Nodo_extra next;
    private Nodo_extra back;
    
    //metodos get de la clase
    public String getTexto() {
        return texto;
    }

    public Nodo_extra getNext() {
        return next;
    }

    public Nodo_extra getBack() {
        return back;
    }
    
    //metodos set de la clase
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNext(Nodo_extra next) {
        this.next = next;
    }

    public void setBack(Nodo_extra back) {
        this.back = back;
    }
       
}//fin de la clase
