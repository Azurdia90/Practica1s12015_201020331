package estructuras;

/**
 * @author Cristian
 * CLASE PADRE QUE DETERMINA CARACTERISTICAS DE LOS
 * NODOS DE LOS PERSONAJES DE LA PRACTICA
 **/
public class Personaje {
    
    private int clave;
    private String imagen;
    private String nombre;
    private int ataque;
    private int defensa;
    private boolean tipo_ataque;
    //varibales para el manejo en el tablero
    private int pos_x;
    private int pos_y;
    //apuntadores de la estructura
    private Personaje next;
    private Personaje back;
    
    //constructor de la clase
    public Personaje(int c,String i, String n, int a, int d, boolean t){
        clave = c;
        imagen = i;
        nombre = n;
        ataque= a;
        defensa = d;
        tipo_ataque = t;
        
        pos_x = 0;
        pos_y =0;
        
        next = null;
        back = null;
    }//fin del constructor de la clase
    
    //metodos get de la clase
    
    public int getClave() {
        return clave;
    }
    
    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public boolean isTipo_ataque() {
        return tipo_ataque;
    }
    
    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public Personaje getNext() {
        return next;
    }

    public Personaje getBack() {
        return back;
    }
    
    //metodos set de la clase
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
     public void setTipo_ataque(boolean tipo_ataque) {
        this.tipo_ataque = tipo_ataque;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void setNext(Personaje next) {
        this.next = next;
    }

    public void setBack(Personaje back) {
        this.back = back;
    }
    
}//fin de la clase
