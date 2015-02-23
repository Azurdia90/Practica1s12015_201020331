package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 * @author Cristian
 * BOTON QUE PERMITIRA ELEMINAR A LOS PERSONAJES DE LA LISTA
 */
public class JBoton_eliminar extends JButton implements ActionListener{
    
    private int clave;
    private estructuras.Raiz_Personaje raiz;
    private estructuras.Lista_doble lista;
    
    public JBoton_eliminar(estructuras.Raiz_Personaje raiz,int clave ){
        this.raiz = raiz;
        this.clave = clave;
        lista = new estructuras.Lista_doble(raiz);
    }
    
    public void ActionPerformed(ActionEvent e){
        lista.eliminar(raiz, clave);
    }

}
