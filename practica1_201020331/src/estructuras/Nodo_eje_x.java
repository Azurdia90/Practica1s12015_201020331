package estructuras;

/**
 * @author Cristian
 * CLASE QUE DEFINE EL EJE X DE LA MATRIZ
 **/
public class Nodo_eje_x {
    
    private int x;
    //punteros del nodo
    private Nodo_eje_x next;
    private Nodo_eje_x back;
    //raiz de los nodos de la matriz
    private Nodo_matriz raiz;
    
    //constructor de la clase
    public Nodo_eje_x(int x){
        this.x = x;
    }
    
    //metodos get de la clase
    public int getX() {
        return x;
    }

    public Nodo_eje_x getNext() {
        return next;
    }

    public Nodo_eje_x getBack() {
        return back;
    }

    public Nodo_matriz getRaiz() {
        return raiz;
    }
    
    //metodos set de la clase
    public void setX(int x) {
        this.x = x;
    }

    public void setNext(Nodo_eje_x next) {
        this.next = next;
    }

    public void setBack(Nodo_eje_x back) {
        this.back = back;
    }

    public void setRaiz(Nodo_matriz raiz) {
        this.raiz = raiz;
    }
    
}//fin de la clase
