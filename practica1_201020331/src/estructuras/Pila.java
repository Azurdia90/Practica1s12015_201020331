package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJA LA PILA DE LOS ZOMBIES
 */

public class Pila {
    
    private estructuras.Raiz_pila raiz;
    
    public Pila(estructuras.Raiz_pila raiz){
        this.raiz = raiz;
    }
    
    public boolean vacio(estructuras.Raiz_pila raiz){
        boolean retornar;//si la pila no esta vacia
        if(raiz.getCima() != null){
            retornar = false;
        }else{//si la pila esta vacia
            retornar = true;
        }//fin del if
        return retornar;
    }//fin del metodo vacio
    
    public void insertar(estructuras.Raiz_pila raiz, estructuras.Personaje nuevo){
        if(!vacio(raiz)){//si la raiz no esta vacia
            nuevo.setNext(raiz.getCima());
            raiz.getCima().setBack(nuevo);
            raiz.setCima(nuevo);
        }else{//si la raiz esta vacia;
            raiz.setCima(nuevo);
        }//fin del if
    }//fin del metodo insertar
    
    public estructuras.Personaje extraer(estructuras.Raiz_pila raiz){
        estructuras.Personaje extraer;
        if(!vacio(raiz)){
            if(raiz.getCima().getNext() != null){
                extraer = raiz.getCima();
                raiz.setCima(raiz.getCima().getNext());
                raiz.getCima().setBack(null);
            }else{
                extraer = raiz.getCima();
                raiz.setCima(null);
            }
        }else{
            extraer = null;
        }
        return extraer;
    }//fin del metodo insertar
    
    public void imprimir(){
        estructuras.Personaje aux = raiz.getCima();
        while(aux != null){
            System.out.println(aux.getClave());
            aux = aux.getNext();
        }
    }//fin del metodo imprimir
}//fin de la clase
