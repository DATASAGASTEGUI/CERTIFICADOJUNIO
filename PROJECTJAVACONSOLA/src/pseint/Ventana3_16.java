package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Ventana3_16 extends javax.swing.JFrame {

    public Ventana3_16() {
        initComponents();
        personalizarVentana();
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

        lblTitulo = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        txtN3 = new javax.swing.JTextField();
        txtN4 = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        lblPromedio = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 330));
        setMinimumSize(new java.awt.Dimension(400, 330));
        setPreferredSize(new java.awt.Dimension(400, 330));
        setSize(new java.awt.Dimension(400, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROMEDIO 4 NOTAS DESCARTA LA MENOR");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        txtN1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtN1.setForeground(new java.awt.Color(0, 0, 255));
        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 41, -1));

        txtN2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtN2.setForeground(new java.awt.Color(0, 0, 255));
        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 41, -1));

        txtN3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtN3.setForeground(new java.awt.Color(0, 0, 255));
        txtN3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 41, -1));

        txtN4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtN4.setForeground(new java.awt.Color(0, 0, 255));
        txtN4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 41, -1));

        lblTitulo1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblTitulo1.setText("INGRESAR CUATRO NOTAS ENTERAS Y POSITIVAS");
        getContentPane().add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 300, -1));
        getContentPane().add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));
        getContentPane().add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, -1));

        lblPromedio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblPromedio.setText("PROMEDIO");
        getContentPane().add(lblPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txtPromedio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(255, 0, 51));
        txtPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 80, -1));
        getContentPane().add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 400, 10));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int n3 = Integer.parseInt(txtN3.getText());
        int n4 = Integer.parseInt(txtN4.getText());
        int menornota = n1;
        if(n2 < menornota) menornota = n2;
        if(n3 < menornota) menornota = n3;
        if(n4 < menornota) menornota = n4;
        double promedio = (n1+n2+n3+n4-menornota)/3.0;
        String promedios = String.format("%5.2f",promedio);
        txtPromedio.setText(promedios+"");
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
       txtN1.setText("");
       txtN2.setText("");
       txtN3.setText("");
       txtN4.setText("");
       txtPromedio.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    private javax.swing.JTextField txtN4;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
