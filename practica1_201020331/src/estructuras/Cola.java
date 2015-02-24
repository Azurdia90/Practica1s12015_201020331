package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJA LA ESTRUCTURA COLA DE LA LISTA DE PLANTAS
 **/
public class Cola {
    
    private estructuras.Raiz_cola raiz;
    
    public Cola(estructuras.Raiz_cola raiz){
        this.raiz = raiz;      
    }
    
    public boolean vacio(estructuras.Raiz_cola raiz){
        boolean retornar;
        if(raiz.getCima() != null){
            retornar = false;
        }else{//si esta vacio
            retornar = true;
        }
        return retornar;
    }//fin vacio()
    
    public void insertar(estructuras.Raiz_cola raiz, estructuras.Personaje nuevo){ 
        if(!vacio(raiz)){
            nuevo.setNext(raiz.getCima());
            raiz.getCima().setBack(nuevo);
            raiz.setCima(nuevo);
        }else{//insertar en la cola
            raiz.setCima(nuevo);
            raiz.setCola(nuevo);
        }
    }//fin del metodo insertar
    
    public estructuras.Personaje extraer(estructuras.Raiz_cola raiz){
        estructuras.Personaje extraer;
        if(!vacio(raiz)){//si la cola no esta vacia
            //si queda unicamente un valor en la cola
            if(raiz.getCima() == raiz.getCola()){
                extraer = raiz.getCima();
                raiz.setCima(null);
                raiz.setCola(null);
            }else{//si la cola tiene mas de un elemento
                extraer = raiz.getCola();
                raiz.setCola(raiz.getCola().getBack());
                raiz.getCola().setNext(null);
            }//fin del if
        }else{//si la cola esta vacia
            extraer = null;
        }//fin del if
        return extraer;
    }//fin del metodo
    
    public void imprimir(){
        estructuras.Personaje aux = raiz.getCima();
        while (aux != null){
            System.out.println(aux.getClave());
            aux = aux.getNext();
        }
    }//fin del metodo imprimir
    
}//fin de la clase
