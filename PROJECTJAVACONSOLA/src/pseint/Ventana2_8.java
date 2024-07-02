package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ventana2_8 extends javax.swing.JFrame {

    public Ventana2_8() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        cboCategoria = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        separado2 = new javax.swing.JSeparator();
        lblSeleccionarCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldoAumento = new javax.swing.JTextField();
        lblSueldoAumento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        lblTitulo.setText("AUMENTO DE SUELDO 15% 10% 5% 8%");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));
        getContentPane().add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 400, 10));

        cboCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(51, 0, 255));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1", "2", "3", "4" }));
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(0, 0, 255));
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 60, 90, -1));
        getContentPane().add(separado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 10));

        lblSeleccionarCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSeleccionarCategoria.setText("SELECCIONAR CATEGORIA");
        getContentPane().add(lblSeleccionarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(0, 0, 255));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 40, 20));

        lblSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSueldo.setText("INGRESAR SUELDO");
        getContentPane().add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        txtSueldoAumento.setEditable(false);
        txtSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldoAumento.setForeground(new java.awt.Color(255, 51, 51));
        txtSueldoAumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        lblSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSueldoAumento.setText("SUELDO CON AUMENTO");
        getContentPane().add(lblSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 400, 10));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       try {  
            String sueldos = txtSueldo.getText();
            double sueldod = Double.parseDouble(sueldos);

            String porcentajes = txtCategoria.getText();//"10%"
            String porcentajes1 = porcentajes.substring(0,porcentajes.length()-1);
            int porcentajei = Integer.parseInt(porcentajes1);

            double sueldoAumento = sueldod * (1 + (porcentajei / 100.0));
            txtSueldoAumento.setText(sueldoAumento + "");
       }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtSueldoAumento.setText("");
        txtSueldo.setText("");
        txtCategoria.setText("");
        cboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
        String items = (String)cboCategoria.getSelectedItem();
        if(!items.equals("SELECCIONE")) {
            int itemi = Integer.parseInt(items);
            switch(itemi) {
                case 1: txtCategoria.setText("15%");break;
                case 2: txtCategoria.setText("10%");break;
                case 3: txtCategoria.setText("8%");break;
                case 4: txtCategoria.setText("5%");break;
            }
        }else {
            txtCategoria.setText("");
        }
    }//GEN-LAST:event_cboCategoriaItemStateChanged
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSeleccionarCategoria;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldoAumento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separado2;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoAumento;
    // End of variables declaration//GEN-END:variables
}
