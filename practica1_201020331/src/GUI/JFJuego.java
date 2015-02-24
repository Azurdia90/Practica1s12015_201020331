package GUI;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * @author Cristian
 * JFRAME EN QUE SE REALIZARA LAS ACCIONES DEL JUEGO
 */
public class JFJuego extends javax.swing.JFrame implements Runnable{

    private int largo1;
    private int largo2;
    
    private estructuras.Raiz_cola raiz_plantas;
    private estructuras.Raiz_pila raiz_zombies;
    
    private final int tamaño_label = 50;
    private JLabel[][] matriz_planta;
    private JLabel[][] matriz_zombie;
    
    private final int tiempo = 60;
    Thread reloj;
    
    public JFJuego() {
        initComponents();
        raiz_plantas = practica1_201020331.Logica_juego.getPlanta_juego();
        raiz_zombies = practica1_201020331.Logica_juego.getZombie_juego();
        this.setTitle("PLANTS VS. ZOMBIES");
        setear_largos();
        setear_matrices();
        reloj = new Thread(this);
        reloj.start();
    }
    
    public void setear_largos(){
        largo1 = raiz_plantas.getCola().getClave();
        largo2 = raiz_plantas.getCola().getClave();
    }

    public void setear_matrices(){
        matriz_planta = new JLabel[largo1][2];
        matriz_planta = new JLabel[largo2][2];
    }
    
    public void run(){
        while(true){
            crear_matrices();
            actualizar_matrices();
            
        }
    }//fin del metodo del hilo
    
    public void crear_matrices(){
            
    }
    
    public void encabezados_plantas(){
        for(int x=0; x<2; x++){
            JLabel encabezado = new JLabel();
            encabezado.setOpaque(true);
            encabezado.setBounds( x*100 , 0 ,tamaño_label, tamaño_label);
            encabezado.setVisible(true);
            encabezado.setBackground(Color.red);
            switch (x){
                    case 0:
                        encabezado.setText("PLANTA");
                        break;
                    case 1:
                        encabezado.setText("CLAVE");
                        break;
           }
           jPplantas.add(encabezado);
        }
    }
    
    public void encabezados_zombies(){
            for(int x=0; x<2; x++){
            JLabel encabezado = new JLabel();
            encabezado.setOpaque(true);
            encabezado.setBounds( x*100 , 0 ,tamaño_label, tamaño_label);
            encabezado.setVisible(true);
            encabezado.setBackground(Color.red);
            switch (x){
                    case 0:
                        encabezado.setText("ZOMBIE");
                        break;
                    case 1:
                        encabezado.setText("CLAVE");
                        break;
           }
           jPzombies.add(encabezado);
        }
    }
    public void actualizar_matrices(){
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPplantas = new javax.swing.JPanel();
        jPzombies = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPplantas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLA PLANTAS"));

        javax.swing.GroupLayout jPplantasLayout = new javax.swing.GroupLayout(jPplantas);
        jPplantas.setLayout(jPplantasLayout);
        jPplantasLayout.setHorizontalGroup(
            jPplantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPplantasLayout.setVerticalGroup(
            jPplantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jPzombies.setBorder(javax.swing.BorderFactory.createTitledBorder("PILA ZOMBIES"));

        javax.swing.GroupLayout jPzombiesLayout = new javax.swing.GroupLayout(jPzombies);
        jPzombies.setLayout(jPzombiesLayout);
        jPzombiesLayout.setHorizontalGroup(
            jPzombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPzombiesLayout.setVerticalGroup(
            jPzombiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("AREA DE JUEGO"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPplantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPzombies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPzombies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPplantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPplantas;
    private javax.swing.JPanel jPzombies;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
