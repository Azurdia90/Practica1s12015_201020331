package estructuras;

/**
 * @author Cristian
 * CLASE QUE MANEJARA LA LISTA DE LOS PERSONAJES UTILIZADOS 
 * SUS METODOS BASICOS ASI COMO SUS RAICES
 **/
public class Lista_doble {
    
    //variable global que servira para busquedas
    private estructuras.Raiz_Personaje raiz;
    //metodo constructor de la clase
    public Lista_doble(estructuras.Raiz_Personaje raiz){
        
        this.raiz = raiz;
    }//fin del constructor
    
    public boolean vacio(estructuras.Raiz_Personaje raiz){
       if(raiz.getCima()!= null){
           return false;
       }else{
           return true;
       }
    }//fin vacio()
    
    public void insertar(estructuras.Raiz_Personaje raiz, int c,String i, String n, int a, int d, boolean t){
        
        estructuras.Personaje nuevo = new estructuras.Personaje(c,i, n, a, d, t);
        //si no esta vacia insertar siempre al final
        if(!vacio(raiz)){
            nuevo.setBack(raiz.getCola());
            raiz.getCola().setNext(nuevo);
            raiz.setCola(nuevo);
        }else{//si esta vacio se inserta en los punteros iniciales
            raiz.setCima(nuevo);
            raiz.setCola(nuevo);   
        }
        
    }//fin insertar()
    
    public estructuras.Personaje buscar(estructuras.Raiz_Personaje raiz,int clave){
        estructuras.Personaje encontrado = null;
        //si la raiz no esta vacia
        if(!vacio(raiz)){//busca desde el inicio de la lista
            estructuras.Personaje aux = raiz.getCima();
            while(aux != null){//mientras no sea nulo el nodo seguir
                if(aux.getClave() != clave){
                    aux = aux.getNext();
                }else{//si el nodo coincide mandarlo a retornar
                    encontrado = aux;
                }//fin del if
            }//fin del while()
        }else{//si la raiz esta vacia mandar valor nulo
            encontrado = null;
        }
        //variable e retorno con el objeto encontrado
        return encontrado;
    }//fin del metodo buscar()
    
    public boolean modificar(estructuras.Raiz_Personaje raiz, int c,String i, String n, int a, int d, boolean t){
        //crear nodo que contendra la informacion buscada
        estructuras.Personaje nodo_modificar = null;
        nodo_modificar= buscar(raiz, c);
        boolean bandera = false;
        
        if(nodo_modificar != null){
            nodo_modificar.setImagen(i);
            nodo_modificar.setNombre(n);
            nodo_modificar.setAtaque(a);
            nodo_modificar.setDefensa(d);
            nodo_modificar.setTipo_ataque(t);
            bandera = true;
        }
        return bandera;
    }
    
    public boolean eliminar(estructuras.Raiz_Personaje raiz, int clave){
        //crear nodo que contendra la informacion buscada
        estructuras.Personaje nodo_eliminar = null;
        nodo_eliminar = buscar(raiz, clave);
        boolean bandera = false;
        //si el nodo no es vacio proceder a buscar
        if(nodo_eliminar != null){
            bandera = true;
        }else{//si el nodo esta vacio se retorna la bandera falsa
            bandera = false;
        }   
        //se retorna el valor del resultado
        return bandera;
    }//fin metodo eliminar
}
