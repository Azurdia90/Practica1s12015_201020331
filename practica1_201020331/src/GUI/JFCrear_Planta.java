package GUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Cristian
 */
public class JFCrear_Planta extends javax.swing.JFrame implements Runnable{
    
    private estructuras.Raiz_Personaje raiz;
    private JFCrear_planta2 ventana2;
    //variables para el maenjo del inventario
    private int largo;
    private final int tamaño_label = 50;
    //matriz utilizada para poder graficar el inventario
    private JLabel[][]  inventario_plantas;
    //Hilo para actualizar la pantalla
    Thread inventario;
    //constructor de la clase
    public JFCrear_Planta() {
        initComponents();
        raiz = new estructuras.Raiz_Personaje();
        practica1_201020331.Logica_juego.setPlanta(raiz);
        inventario = new Thread(this);
        inventario.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBfin = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jPanel_inventario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("imagen");

        jLabel2.setText("nombre");

        jLabel3.setText("ataque");

        jLabel4.setText("defensa");

        jLabel5.setText("tipo ataque");

        jLabel6.setText("eliminar");

        jLabel7.setText("modificar");

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

        javax.swing.GroupLayout jPanel_inventarioLayout = new javax.swing.GroupLayout(jPanel_inventario);
        jPanel_inventario.setLayout(jPanel_inventarioLayout);
        jPanel_inventarioLayout.setHorizontalGroup(
            jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jPanel_inventarioLayout.setVerticalGroup(
            jPanel_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBagregar)
                        .addGap(71, 71, 71)
                        .addComponent(jBfin)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBfin)
                            .addComponent(jBagregar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void run(){
        try{
            actualizarmatriz();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "A ocurrido el siguiente error:  "
                        + e);
        } 
    }
    
    private void jBfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfinActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        ventana2 = new JFCrear_planta2(raiz);
        ventana2.show();

    }//GEN-LAST:event_jBagregarActionPerformed
    
    public void actualizarmatriz(){
        while(true){
            if(raiz.getCima() != null){
                largo = raiz.getCola().getClave();
                inventario_plantas = new JLabel[largo][5];
                mostrarmatriz();
                this.add(jPanel_inventario);
            }
        }//fin del while
    }//fin del metodo actualizarmatriz()
    
    public void mostrarmatriz(){
        estructuras.Personaje aux = raiz.getCima();
        for(int y = 0; y < largo; y++){
            for(int x = 0; x < 5; x++ ){
                insertarmatriz(aux, x, y);
                aux = aux.getNext();
            }//fin for de las columnas
        }//fin for de las filas
    }//fin del metodo mostrar matriz
    
    public void insertarmatriz(estructuras.Personaje aux, int x, int y){
        switch(x){
        case 0:
            inventario_plantas[x][y] = new JLabel();
            inventario_plantas[x][y].setOpaque(true);
            inventario_plantas[x][y].setBounds((x*tamaño_label)+50, (y*tamaño_label)+50,tamaño_label, tamaño_label);
            inventario_plantas[x][y].setVisible(true);
            inventario_plantas[x][y].setBackground(Color.red);
            inventario_plantas[x][y].setIcon(new ImageIcon(getClass().getResource(aux.getImagen())));
            jPanel_inventario.add(inventario_plantas[x][y]);
        case 1:
            inventario_plantas[x][y] = new JLabel();
            inventario_plantas[x][y].setOpaque(true);
            inventario_plantas[x][y].setBounds((x*tamaño_label)+50, (y*tamaño_label)+50,tamaño_label, tamaño_label);
            inventario_plantas[x][y].setVisible(true);
            inventario_plantas[x][y].setBackground(Color.red);
            inventario_plantas[x][y].setText(aux.getNombre());
        case 2:
            inventario_plantas[x][y] = new JLabel();
            inventario_plantas[x][y].setText(Integer.toString(aux.getAtaque()));
            inventario_plantas[x][y].setBackground(Color.red);
        case 3:
            inventario_plantas[x][y] = new JLabel();
            inventario_plantas[x][y].setText(Integer.toString(aux.getDefensa()));
            inventario_plantas[x][y].setBackground(Color.red);
        case 4:
            inventario_plantas[x][y] = new JLabel();
            if(aux.isTipo_ataque() == true){
                inventario_plantas[x][y].setText("directo");
                inventario_plantas[x][y].setBackground(Color.red);
            }else{
                inventario_plantas[x][y].setText("disparo");
                inventario_plantas[x][y].setBackground(Color.red);
            }//fin del if del tipo de disparo
        }//fin del switch  
    }//fin del metodo insertar matriz
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBfin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_inventario;
    // End of variables declaration//GEN-END:variables
}
