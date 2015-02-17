package estructuras;

/**
 * @author Cristian
 * NODO QUE DEFINE EL EJE Y DE LA MATRIZ
 **/
public class Nodo_eje_y {
    
     private int y;
    //punteros del nodo
    private Nodo_eje_y neyt;
    private Nodo_eje_y back;
    //raiz de los nodos de la matriz
    private Nodo_matriz raiz;
    
    //constructor de la clase
    public Nodo_eje_y(int y){
        this.y = y;
    }
    
    //metodos get de la clase
    public int gety() {
        return y;
    }

    public Nodo_eje_y getNeyt() {
        return neyt;
    }

    public Nodo_eje_y getBack() {
        return back;
    }

    public Nodo_matriz getRaiz() {
        return raiz;
    }
    
    //metodos set de la clase
    public void sety(int y) {
        this.y = y;
    }

    public void setNeyt(Nodo_eje_y neyt) {
        this.neyt = neyt;
    }

    public void setBack(Nodo_eje_y back) {
        this.back = back;
    }

    public void setRaiz(Nodo_matriz raiz) {
        this.raiz = raiz;
    }
    
}
