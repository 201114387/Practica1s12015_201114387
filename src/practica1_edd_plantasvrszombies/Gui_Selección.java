package practica1_edd_plantasvrszombies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROBIN
 */
public class Gui_Selección extends javax.swing.JFrame {
    Lista_Jugadores LJ = new Lista_Jugadores();
    /**
     * Creates new form Gui_Selección
     */
    public Gui_Selección() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Jugador_Plantas_ = new javax.swing.JButton();
        Btn_Jugador_Zombie_ = new javax.swing.JButton();
        Btn_Comenzar_Juego_ = new javax.swing.JButton();
        Btn_Eliminar_Datos_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cooltext1917622487.png"))); // NOI18N
        jLabel1.setToolTipText("");

        Btn_Jugador_Plantas_.setText("Jugador Plantas");
        Btn_Jugador_Plantas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Jugador_Plantas_ActionPerformed(evt);
            }
        });

        Btn_Jugador_Zombie_.setText("Jugador Zombies");
        Btn_Jugador_Zombie_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Jugador_Zombie_ActionPerformed(evt);
            }
        });

        Btn_Comenzar_Juego_.setText("Comenzar Juego");
        Btn_Comenzar_Juego_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Comenzar_Juego_ActionPerformed(evt);
            }
        });

        Btn_Eliminar_Datos_.setText("Eliminar Datos");
        Btn_Eliminar_Datos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Eliminar_Datos_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Jugador_Zombie_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Jugador_Plantas_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Btn_Comenzar_Juego_)
                        .addGap(42, 42, 42)
                        .addComponent(Btn_Eliminar_Datos_, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Jugador_Plantas_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Jugador_Zombie_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Comenzar_Juego_)
                    .addComponent(Btn_Eliminar_Datos_))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Jugador_Plantas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Jugador_Plantas_ActionPerformed
        // TODO add your handling code here:
        Gui_JPlantas JP = new Gui_JPlantas();
        JP.setVisible(true);
        JP.show();
    }//GEN-LAST:event_Btn_Jugador_Plantas_ActionPerformed

    private void Btn_Jugador_Zombie_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Jugador_Zombie_ActionPerformed
        // TODO add your handling code here:
        Gui_JZombies JZ = new Gui_JZombies();
        JZ.setVisible(true);
        JZ.show();
    }//GEN-LAST:event_Btn_Jugador_Zombie_ActionPerformed

    private void Btn_Comenzar_Juego_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Comenzar_Juego_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Comenzar_Juego_ActionPerformed

    private void Btn_Eliminar_Datos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Eliminar_Datos_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Eliminar_Datos_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_Selección.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Selección.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Selección.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Selección.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Selección().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Comenzar_Juego_;
    private javax.swing.JButton Btn_Eliminar_Datos_;
    private javax.swing.JButton Btn_Jugador_Plantas_;
    private javax.swing.JButton Btn_Jugador_Zombie_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
