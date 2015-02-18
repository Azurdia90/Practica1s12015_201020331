package estructuras;

/**
 * @author Cristian
 * CLASE QUE DEFIINE LOS NODOS QUE ALMACENARAN LA INFORMACION
 * DE LA MATRIZ Y LAS RAICES DE LAS LISTAS CONTENIDAS
 **/
public class Nodo_matriz {
    
    private String imagen;
    private int pos_x;
    private int pos_y;
    //apuntador a la lista de personajes
    private Personaje raiz;
    
    public Nodo_matriz(String i, int x, int y){
        imagen = i;
        pos_x = x;
        pos_y = y;
        raiz  = null;
    }
    
    //metodos get de la clase
    public String getImagen() {
        return imagen;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public Personaje getRaiz() {
        return raiz;
    }
    
    //metodos set de la clase
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void setRaiz(Personaje raiz) {
        this.raiz = raiz;
    }
    
}//fin de la clase
