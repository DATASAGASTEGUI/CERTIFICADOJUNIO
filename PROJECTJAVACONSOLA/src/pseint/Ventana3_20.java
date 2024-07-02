package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana3_20 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    
    public Ventana3_20() {
        initComponents();
        personalizarVentana();
        
        lstFactorial.setModel(dlm);
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
        separador1 = new javax.swing.JSeparator();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        txtFactorial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFactorial = new javax.swing.JList<>();
        separador3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(401, 417));
        setMinimumSize(new java.awt.Dimension(401, 417));
        setPreferredSize(new java.awt.Dimension(401, 417));
        setSize(new java.awt.Dimension(401, 417));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("FACTORIAL DE NUMERO");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));
        getContentPane().add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 35, 410, 11));

        lblNumero.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblNumero.setText("INGRESAR NUMERO ENTERO POSITIVO");
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, -1));

        txtNumero.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 51, 51));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));
        getContentPane().add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 400, 10));

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("MENSAJE");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, -1));

        txtFactorial.setEditable(false);
        txtFactorial.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtFactorial.setForeground(new java.awt.Color(255, 51, 51));
        txtFactorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, -1));

        lstFactorial.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lstFactorial.setForeground(new java.awt.Color(255, 0, 0));
        lstFactorial.setEnabled(false);
        jScrollPane1.setViewportView(lstFactorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, 90));
        getContentPane().add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, -1));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        dlm.clear();
        String ns = txtNumero.getText().trim();//0
        String patron = "[0-9]+";
        boolean correcto = ns.matches(patron);
        long f = 1;
        if(correcto) {
           long n = Long.parseLong(ns);
           if(n!=0) {
              for(int i=1; i<=n; i++)  {
                  f = f * i;
                  dlm.addElement(f);
              }
              lblMensaje.setText("FACTORIAL DISTITINO CERO");
              txtFactorial.setText(f + "");
           }else {
              f = 1;
              lblMensaje.setText("FACTORIAL CERO");
              txtFactorial.setText(f + "");
           }
        }else {
           JOptionPane.showMessageDialog(null, "DEBE INGRESAR NUMERO ENTERO POSITIVO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtNumero.setText("");
        txtFactorial.setText("");
        dlm.clear();
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_20().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstFactorial;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
