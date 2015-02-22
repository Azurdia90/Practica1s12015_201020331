package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJARA LA RAIZ DE LA COLA DE PLANTAS
 */
public class Raiz_cola {
    //cola de la cola el ancla de los nodos
    private estructuras.Personaje cima;
    private estructuras.Personaje cola;

    //constructor de la clase
    public Raiz_cola(){
        cima = null;
        cola = null;
    }
    //metodos get de la clase
    public Personaje getCima() {
        return cima;
    }
    public Personaje getCola() {
        return cola;
    }

    //metodos set de la clase
    public void setCima(Personaje cima) {
        this.cima = cima;
    }
    public void setCola(Personaje cola) {
        this.cola = cola;
    }
}//fin Raiz_cola
