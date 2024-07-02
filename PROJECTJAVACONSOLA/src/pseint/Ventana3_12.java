package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana3_12 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public Ventana3_12() {
        initComponents();
        personalizarVentana();

        lstTablaMultiplicar.setModel(dlm);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(true); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        lblTitulo = new javax.swing.JLabel();
        deparador1 = new javax.swing.JSeparator();
        lblk = new javax.swing.JLabel();
        txtK = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTablaMultiplicar = new javax.swing.JList<>();
        separador3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 388));
        setMinimumSize(new java.awt.Dimension(400, 388));
        setPreferredSize(new java.awt.Dimension(400, 388));
        setSize(new java.awt.Dimension(400, 388));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TABLA DE MULTIPLICAR");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));
        getContentPane().add(deparador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 400, 10));

        lblk.setText("INGRESAR VALOR K NUMERO TABLA MULTIPLICAR");
        getContentPane().add(lblk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 310, -1));

        txtK.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtK.setForeground(new java.awt.Color(51, 51, 255));
        txtK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, -1));
        getContentPane().add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 10));

        lstTablaMultiplicar.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lstTablaMultiplicar.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(lstTablaMultiplicar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 110));
        getContentPane().add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 253, 400, 10));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 90, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {
            dlm.clear();
            String ks = txtK.getText();
            int ki = Integer.parseInt(ks);
            for (int i = 1; i <= ki; i++) {
                //System.out.println(i + " X " + ki + " = " + (i*ki));
                String texto = i + " X " + ki + " = " + (i * ki);
                dlm.addElement(texto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtK.setText("");
        dlm.clear();
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator deparador1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblk;
    private javax.swing.JList<String> lstTablaMultiplicar;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtK;
    // End of variables declaration//GEN-END:variables
}
