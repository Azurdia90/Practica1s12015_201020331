package GUI;

import java.awt.BorderLayout;

/**
 *
 * @author Cristian
 */
public class JFInicio extends javax.swing.JFrame {
    
    private estructuras.Jugador jugador;
    
    JPFondo_inicio fondo;
    JFJugador_planta ventana1;
    
    public JFInicio() {
        initComponents();
        fondo = new JPFondo_inicio();
        this.add(fondo, BorderLayout.CENTER);
        jugador = new estructuras.Jugador();
        practica1_201020331.Logica_juego.setJugador(jugador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBjugador_zombies = new javax.swing.JToggleButton();
        jTBiniciar = new javax.swing.JToggleButton();
        jTBresetear = new javax.swing.JToggleButton();
        jBjugador_plantas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTBjugador_zombies.setText("Jugador Zombies");

        jTBiniciar.setText("Iniciar Juego");
        jTBiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBiniciarActionPerformed(evt);
            }
        });

        jTBresetear.setText("Borrar Datos");

        jBjugador_plantas.setText("Jugador Plantas");
        jBjugador_plantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBjugador_plantasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTBjugador_zombies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBresetear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBjugador_plantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jBjugador_plantas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBjugador_zombies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTBresetear)
                .addGap(134, 134, 134))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBjugador_plantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBjugador_plantasActionPerformed
         ventana1 = new JFJugador_planta(jugador);
         ventana1.show();
    }//GEN-LAST:event_jBjugador_plantasActionPerformed

    private void jTBiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBiniciarActionPerformed
        
    }//GEN-LAST:event_jTBiniciarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBjugador_plantas;
    private javax.swing.JToggleButton jTBiniciar;
    private javax.swing.JToggleButton jTBjugador_zombies;
    private javax.swing.JToggleButton jTBresetear;
    // End of variables declaration//GEN-END:variables
}
