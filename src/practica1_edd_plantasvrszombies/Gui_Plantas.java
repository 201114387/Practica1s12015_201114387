/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd_plantasvrszombies;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ROBIN
 */
public class Gui_Plantas extends javax.swing.JFrame {
    int y = 0;
    int index = 0;
    int bandera = 0;
    public Lista_Plantas_Zombies listaPV = new Lista_Plantas_Zombies();
    /**
     * Creates new form Gui_Plantas
     */
    public Gui_Plantas() {
        initComponents();
        this.setLocationRelativeTo(null);  
        this.setTitle("Catalogo Plantas");
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
        Btn_Agregar_Plantas = new javax.swing.JButton();
        Btn_Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Catalogo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Imagen");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad Ataque");

        jLabel4.setText("Cantidad Defensa");

        jLabel5.setText("Tipo de Ataque");

        Btn_Agregar_Plantas.setText("Agregar");
        Btn_Agregar_Plantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar_PlantasActionPerformed(evt);
            }
        });

        Btn_Aceptar.setText("Aceptar");
        Btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceptarActionPerformed(evt);
            }
        });

        jTextArea_Catalogo.setEditable(false);
        jTextArea_Catalogo.setColumns(20);
        jTextArea_Catalogo.setRows(5);
        jTextArea_Catalogo.setEnabled(false);
        jTextArea_Catalogo.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea_Catalogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_Agregar_Plantas)
                        .addGap(9, 9, 9)
                        .addComponent(Btn_Aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Agregar_Plantas)
                    .addComponent(Btn_Aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Agregar_PlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar_PlantasActionPerformed
        // TODO add your handling code here:
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("Abrir Archivo...");
        File file1 = new File("C:/Users/ROBIN/Google Drive/2015/1er Semestre/EDD/Laboratorio/Practica 1/Imagenes/Plantas");
        filechooser.setCurrentDirectory(file1); 
        int result = filechooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            try {
                File file = filechooser.getSelectedFile();
                Panel_Personajes(file.toString()); 
                
            } catch (Exception e) {
            }
        }        
    }//GEN-LAST:event_Btn_Agregar_PlantasActionPerformed

    private void Btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceptarActionPerformed
        // TODO add your handling code here:
        Gui_Zombies z = new Gui_Zombies();
        Gui_Selección s = new Gui_Selección();
        s.recibir_Plantas(listaPV); 
        z.setVisible(true);
        this.dispose();
        z.show();
    }//GEN-LAST:event_Btn_AceptarActionPerformed

    public void Panel_Personajes(final String direccion){
        
        final JPanel Panel = new JPanel();
        Panel.setBounds(10, 10 + y, 820, 120);
        Panel.setBackground(Color.red); 
        
        JLabel foto = new JLabel();
        foto.setBounds(10, 10, 100, 100);
        foto.setVisible(true);
        
        final JTextField nombre = new JTextField();
        nombre.setBounds(150, 40, 80, 30);
        
        final JTextField CantAtaque = new JTextField();
        CantAtaque.setBounds(300, 40, 40, 30);
        
        final JTextField CantDef = new JTextField();
        CantDef.setBounds(420, 40, 40, 30);
                
        final JTextField TipoAtaque = new JTextField();
        TipoAtaque.setBounds(550, 40, 80, 30);
        
        final JLabel JL_Guardar = new JLabel("Guardar");
        JL_Guardar.setBounds(650, 45, 60, 15);
        
        final JLabel JL_Editar = new JLabel("Editar");
        JL_Editar.setBounds(710, 45, 60,15); 
        JL_Editar.setVisible(false); 
        
        final JLabel JL_Eliminar = new JLabel("Eliminar");
        JL_Eliminar.setBounds(750, 45, 60, 15);
        JL_Eliminar.setVisible(false); 
        
            ImageIcon icon = new ImageIcon(direccion);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_DEFAULT));
            foto.setIcon(icono);
            
            Panel.add(foto);
            Panel.setLayout(null); 
            jTextArea_Catalogo.add(Panel);
            jTextArea_Catalogo.setRows(index);
            jTextArea_Catalogo.repaint();
            this.repaint();
            this.pack();
                 
                Panel.add(nombre);
                    this.repaint();
                Panel.add(CantAtaque);
                    this.repaint();
                Panel.add(CantDef);
                    this.repaint();
                Panel.add(TipoAtaque);
                    this.repaint();
                Panel.add(JL_Guardar);
                    Panel.repaint();
                Panel.add(JL_Editar);
                    Panel.repaint();
                Panel.add(JL_Eliminar);
                    Panel.repaint();
       
                    //----------------------- Listener Para Guardar --------------------------
                JL_Guardar.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        
                        if(nombre.getText().isEmpty() || CantAtaque.getText().isEmpty() || CantDef.getText().isEmpty() || TipoAtaque.getText().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Ingrese todos los campos ...");
                        }else{
                            listaPV.InsertAtBack(direccion, nombre.getText(), Integer.parseInt(CantAtaque.getText()),Integer.parseInt(CantDef.getText()),TipoAtaque.getText());
                            nombre.setEditable(false); 
                            CantAtaque.setEditable(false);
                            CantDef.setEditable(false);
                            TipoAtaque.setEditable(false); 
                            JL_Editar.setVisible(true);
                            JL_Eliminar.setVisible(true);
                            JL_Guardar.setVisible(false); 
                        }
                    }
                });
                
                    //----------------------- Listener para Editar --------------------------------
                JL_Editar.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                            
                            if(bandera == 0){
                                 
                                listaPV.Buscar(nombre.getText(), listaPV.FirsNod);
                                JOptionPane.showMessageDialog(null, nombre.getText());
                                nombre.setEditable(true); 
                                CantAtaque.setEditable(true);
                                CantDef.setEditable(true);
                                TipoAtaque.setEditable(true);
                                bandera = 1;
                            }else{
                                if(listaPV.auxiliar != null){
                                    if(nombre.getText().isEmpty() || CantAtaque.getText().isEmpty() || CantDef.getText().isEmpty() || TipoAtaque.getText().isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Ingrese todos los campos ...");
                                    }else{
                                        listaPV.auxiliar.Name = nombre.getText();
                                        listaPV.auxiliar.Cantidad_Ataque = Integer.valueOf(CantAtaque.getText());
                                        listaPV.auxiliar.Cantidad_Defensa = Integer.parseInt(CantDef.getText());
                                        listaPV.auxiliar.Tipo_Ataque = TipoAtaque.getText();
                                        nombre.setEditable(false); 
                                        CantAtaque.setEditable(false);
                                        CantDef.setEditable(false);
                                        TipoAtaque.setEditable(false); 
                                    }
                                }
                                bandera = 0;
                            }
                    }
                });
                
                JL_Eliminar.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        
                    }
                });
                    
            y = y + 130;
            index = index + 15;
        
    }
    
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
            java.util.logging.Logger.getLogger(Gui_Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Plantas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Aceptar;
    private javax.swing.JButton Btn_Agregar_Plantas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Catalogo;
    // End of variables declaration//GEN-END:variables
}
