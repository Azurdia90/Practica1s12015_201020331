package GUI;

import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Cristian
 * JFRAME QUE NOS PERMITE INGRESAR NUEVAS PLANTAS
 * INGRESAR ELEMENTOS A LA COLA
 * PODER MODIFICAR LA LISTA DE LAS PLANTAS
 */
public class JFCrear_personaje extends javax.swing.JFrame implements Runnable{
    
    //variable para cerrar el hilo de escritura de pantalla
    boolean parar;
    boolean tipo;
    //objetos de las estructuras
    private estructuras.Raiz_jugador raiz_jugador;
    private estructuras.Raiz_Personaje planta;
    private estructuras.Raiz_Personaje zombie;
    private estructuras.Raiz_cola raiz_cola;
    private estructuras.Raiz_pila raiz_pila;
    //objetos de las ventanas que se manejan
    private JFCrear_personaje2 ventana1;
    private JFCrear_personaje ventana2;
    private JFtamaño ventana3;
    //variables para el manejo del inventario
    private int largo;
    private final int tamaño_label = 50;
    private JLabel[][]  inventario_personajes;
    private JButton[][] inventario_botones;
     //Hilo para actualizar la pantalla
    private final int tiempo = 70;
    Thread inventario;
    
    //constructor de la clase
    public JFCrear_personaje(estructuras.Raiz_jugador raiz_jugador, boolean t) {
        initComponents();
        //iniciando los componentes
        jBfin.setEnabled(false);
        //raiz de los objetos a utilizar
        this.raiz_jugador = raiz_jugador;
        tipo = t;
        //determinar el largo de la matriz
        setear_titulo();
        setear_raiz();
        setear_largo();
        //correr el hilo
        parar = true;
        inventario = new Thread(this);
        inventario.start();
    }//fin del contstructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBfin = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jPinventario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBfin.setText("Finalizar");
        jBfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinActionPerformed(evt);
            }
        });

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jPinventario.setMaximumSize(new java.awt.Dimension(700, 32767));
        jPinventario.setMinimumSize(new java.awt.Dimension(700, 100));
        jPinventario.setPreferredSize(new java.awt.Dimension(700, 250));

        javax.swing.GroupLayout jPinventarioLayout = new javax.swing.GroupLayout(jPinventario);
        jPinventario.setLayout(jPinventarioLayout);
        jPinventarioLayout.setHorizontalGroup(
            jPinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPinventarioLayout.setVerticalGroup(
            jPinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 382, Short.MAX_VALUE)
                .addComponent(jBagregar)
                .addGap(71, 71, 71)
                .addComponent(jBfin)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPinventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPinventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfin)
                    .addComponent(jBagregar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setear_titulo(){
        if(tipo == false){
            this.setTitle("CATALOGO PLANTAS");
        }else{
            this.setTitle("CATALOGO ZOMBIES");
        }
    }
    
    public void setear_raiz(){
        if(tipo == false){
            planta = new estructuras.Raiz_Personaje();
            raiz_cola = new estructuras.Raiz_cola();
        }else{
            zombie = new estructuras.Raiz_Personaje();
            raiz_pila = new estructuras.Raiz_pila();
        }       
    }//fin del metodo para setear la raiz;
    
    public void setear_largo(){
        estructuras.Jugador aux = raiz_jugador.getRaiz_jugador();
        while (aux!=null){
            if(aux.isTipo() == tipo){
                largo = aux.getCantidad();
                break;
            }
            aux = aux.getNext();
        }//fin del while
        inventario_personajes = new JLabel[largo][5];
        inventario_botones = new JButton[largo][2];
    }//fin del metodo determinar largo
    
    //metodo que corre lo requerrido en el hilo
    @Override
    public void run(){
        try{//encerramos las operaciones por si ocurre un error en el hilo
            if(tipo == false){
                while(parar){//enciclamos para que siemrpe este rescribiendo 
                    crear_matriz();//creamos los encabezados de la matriz
                    actualizar_matriz(planta);//creamos los nodos que sean necesarios
                    Thread.sleep(tiempo);//le damos tiempo al hilo para rescriba
                    //this.update(this.getGraphics());
                }//fin del while      
            }else{
                while(parar){//enciclamos para que siemrpe este rescribiendo 
                    crear_matriz();//creamos los encabezados de la matriz
                    actualizar_matriz(zombie);//creamos los nodos que sean necesarios
                    Thread.sleep(tiempo);//le damos tiempo al hilo para rescriba
                    //this.update(this.getGraphics());
                }//fin del while 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "A ocurrido el siguiente error:  "
                        + e);
        }//fin del try catch
    }//fin del metodo
    
    private void jBfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinActionPerformed
        parar = false;
        if(tipo == false){
            practica1_201020331.Logica_juego.setPlanta(planta);
            encolar();
            practica1_201020331.Logica_juego.setPlanta_juego(raiz_cola);
            ventana2 = new JFCrear_personaje(raiz_jugador, true);
            ventana2.show();
        }else{
            practica1_201020331.Logica_juego.setZombie(zombie);
            enpilar();
            practica1_201020331.Logica_juego.setZombie_juego(raiz_pila);
            ventana3 = new JFtamaño();
            ventana3.show();
        }
        this.dispose();//cerrar la ventana
    }//GEN-LAST:event_jBfinActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
       if(tipo == false){
           ventana1 = new JFCrear_personaje2(planta, largo);
       }else{
           ventana1 = new JFCrear_personaje2(zombie, largo);
       }
        ventana1.show();
        jBagregar.setEnabled(false);
        jBfin.setEnabled(true);
    }//GEN-LAST:event_jBagregarActionPerformed
    
    public void crear_matriz(){
        for(int x = 0; x < 7; x ++){
            JLabel encabezado = new JLabel();
            encabezado.setOpaque(true);
            encabezado.setBounds( (x*tamaño_label*2) , 0 ,tamaño_label*2, tamaño_label);
            encabezado.setVisible(true);
            encabezado.setBackground(Color.red);
            switch (x){
                    case 0:
                        encabezado.setText("IMAGEN");
                        break;
                    case 1:
                        encabezado.setText("NOMBRE");
                        break;
                    case 2:
                        encabezado.setText("ATAQUE");
                        break;
                    case 3:
                        encabezado.setText("DEFENSA");
                        break;
                    case 4:
                        encabezado.setText("TIPO_ATAQUE");
                        break;
                    case 5:
                        encabezado.setText("ELIMINAR");
                        break;
                    case 6:
                        encabezado.setText("MODIFICAR");
                        break;
            }
            jPinventario.add(encabezado);
        }//Fin del for para crear encabezados de matriz   
    }//fin del metodo para crear el encabezado de la matriz
    
    public void actualizar_matriz(estructuras.Raiz_Personaje raiz){
        if(raiz.getCima() != null){
                mostrar_matriz(raiz);
        }  
    }//fin del metodo actualizarmatriz()
    
    public void mostrar_matriz(estructuras.Raiz_Personaje raiz){
        estructuras.Personaje aux = raiz.getCima();
        int y = 0;
        while(aux!= null){
            for(int x = 0; x < 5; x++ ){
                insertarmatriz(aux, x, y);
                insertarmatriz(x,y);
                }//fin for de las columnas
            y = y + 1;
            aux = aux.getNext();
        }//while para cambiar de fila en la matriz
    }//fin del metodo mostrar matriz
    
    public void insertarmatriz(estructuras.Personaje aux, int x, int y){
        inventario_personajes[y][x] = new JLabel();
        inventario_personajes[y][x].setOpaque(true);
        inventario_personajes[y][x].setBounds(x*(tamaño_label*2), 50*(y+1),(tamaño_label*2), tamaño_label);
        inventario_personajes[y][x].setVisible(true);
        inventario_personajes[y][x].setBackground(Color.white);
        switch(x){
            case 0:
                ImageIcon foto = new ImageIcon(aux.getImagen());
                Icon personaje = new ImageIcon(foto.getImage().getScaledInstance(tamaño_label, tamaño_label,Image.SCALE_DEFAULT));
                inventario_personajes[y][x].setIcon(personaje);
                break;
            case 1:
                inventario_personajes[y][x].setText(aux.getNombre());
                break;
            case 2:
                inventario_personajes[y][x].setText(Integer.toString(aux.getAtaque()));
                break;
            case 3:
                inventario_personajes[y][x].setText(Integer.toString(aux.getDefensa()));
                break;
            case 4:
                if(aux.isTipo_ataque() == true){
                    inventario_personajes[y][x].setText("directo");
                    break;
                }else{
                    inventario_personajes[y][x].setText("disparo");
                    break;
                }//fin del if del tipo de disparo         
        }//fin del switch  
        jPinventario.add(inventario_personajes[y][x]);
        this.repaint();
    }//fin del metodo insertar matriz
    
    public void insertarmatriz(int x, int y){
        if(x < 2){
            inventario_botones[y][x] = new JButton();
            inventario_botones[y][x].setBounds(500+(x*tamaño_label*2), 50*(y+1),(tamaño_label*2), tamaño_label);
            inventario_botones[y][x].setVisible(true);
            if(x == 0){
                inventario_botones[y][x].setText("Elmininar");
            }else{
                inventario_botones[y][x].setText("Modificar");
            }
            jPinventario.add(inventario_botones[y][x]);
            this.repaint();
        } 
    }
    
    //metodo que permite pasar copias de los personajes a la cola
    public void encolar(){
        //creamos un objeto del tipo cola
        estructuras.Cola cola = new estructuras.Cola(raiz_cola);
        estructuras.Personaje aux = planta.getCola();
        while(aux != null){
            //recorremos la lista de atras para adelante
            cola.insertar(raiz_cola, aux.clon());//insertamos una copia
            aux = aux.getBack();//pasamos al nodo anterior;
        }    
    }//fin del metodo encolar
    
    //metodo que permite pasar copias de los personajes a la pila
    public void enpilar(){
        //creamos un objeto del tipo pila
        estructuras.Pila pila = new estructuras.Pila(raiz_pila);
        estructuras.Personaje aux = zombie.getCola();
        while(aux != null){
                pila.insertar(raiz_pila, aux);
                aux = aux.getBack();
        } //fin del ciclo while
    }//fin del metodo empilar
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBfin;
    private javax.swing.JPanel jPinventario;
    // End of variables declaration//GEN-END:variables
}
