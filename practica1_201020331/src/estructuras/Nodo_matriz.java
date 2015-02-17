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
    private Personaje raiz;
    
    public Nodo_matriz(String i, int x, int y){
        imagen = i;
        pos_x = x;
        pos_y = y;
        raiz  = null;
    }
    
}
