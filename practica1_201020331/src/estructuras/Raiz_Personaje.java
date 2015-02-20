package estructuras;

/**
 * @author Cristian
 * CLASE QUE CONTIENE LA RAIZ DE LA LISTA DE PLANTAS
 **/
public class Raiz_Personaje {
    
    private Personaje cima;
    private Personaje cola;
    
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
}//fin de la clase
