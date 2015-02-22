package estructuras;

/**
 * @author Cristian
 * CLASE QUE CONTIENE LA RAIZ DE LA PILA DE ZOMBIES
 */
public class Raiz_pila {
    //raiz de la pila
    private estructuras.Personaje cima;
    //constructor de la clase
    public void Raiz_pila(){
        cima = null;
    }

    //metodo get de la clase
    public Personaje getCima() {
        return cima;
    }
    
    //metodo set de la clase
    public void setCima(Personaje cima) {
        this.cima = cima;
    }
}//fin de la clase
