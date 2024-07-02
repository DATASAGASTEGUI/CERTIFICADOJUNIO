package swing;

import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JComboBox;

public class VentanaComboBox extends javax.swing.JFrame {

    public VentanaComboBox() {
        initComponents();
        personalizarFrame();
        personalizarComboBox();
    }
    
    public void personalizarFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaComboBox.class.getResource("cross1.png")));//Poner un icono a la ventana
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//Liberar el recurso al cerrarse la ventana
        this.setTitle("GUI SWING");//Poner un titulo a la ventana
        //this.setSize(320, 200); //Poner un ancho y alto a la ventana
        this.setResizable(false); //Evitar la redimension de la ventana
        this.setLocationRelativeTo(null);//Ubicar la ventana en el centro de la pantalla        
    }
    
    public void personalizarComboBox() {
        cboAnio = new JComboBox<>();
        for (int i = 1900; i <= LocalDate.now().getYear(); i++) {
            cboAnio.addItem(i);
        }  
        
        cboMes = new JComboBox<>();
        for (int i = 1; i <= 12; i++) {
            cboMes.addItem(i);
        }            
        
        cboDia = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            cboDia.addItem(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnios = new javax.swing.JLabel();
        txtAnios = new javax.swing.JTextField();
        lblMeses = new javax.swing.JLabel();
        txtMeses = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        lblDia = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<Integer>();
        javax.swing.JComboBox<Integer> cboAnio = new javax.swing.JComboBox<Integer>();
        javax.swing.JComboBox<Integer> cboMes = new javax.swing.JComboBox<Integer>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnios.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblAnios.setText("AÑOS:");
        getContentPane().add(lblAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 46, -1));

        txtAnios.setEditable(false);
        txtAnios.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtAnios.setForeground(new java.awt.Color(255, 51, 51));
        txtAnios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 71, -1));

        lblMeses.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblMeses.setText("MESES:");
        getContentPane().add(lblMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 46, -1));

        txtMeses.setEditable(false);
        txtMeses.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtMeses.setForeground(new java.awt.Color(255, 51, 51));
        txtMeses.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 71, -1));

        lblDias.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDias.setText("DIAS:");
        getContentPane().add(lblDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 46, -1));

        txtDias.setEditable(false);
        txtDias.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDias.setForeground(new java.awt.Color(255, 51, 51));
        txtDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 71, -1));

        cmdCalcular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 96, -1));

        cmdNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 96, -1));

        cmdSalir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 96, -1));

        lblDia.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDia.setText("DIA?");
        getContentPane().add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, -1));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ENTRADA(FECHA NACIMIENTO) - SALIDA(AÑOS-MESES-DIAS)");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        lblMes.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblMes.setText("MES?");
        getContentPane().add(lblMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, -1));

        lblAnio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblAnio.setText("AÑO?");
        getContentPane().add(lblAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 40, -1));

        getContentPane().add(cboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        getContentPane().add(cboAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        getContentPane().add(cboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int day = (int) cboDia.getSelectedItem();
        int month = (int) cboMes.getSelectedItem();
        int year = (int) cboAnio.getSelectedItem();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        txtAnios.setText(String.valueOf(period.getYears()));
        txtMeses.setText(String.valueOf(period.getMonths()));
        txtDias.setText(String.valueOf(period.getDays()));
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtAnios.setText("");
        txtMeses.setText("");
        txtDias.setText("");

    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblAnios;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnios;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtMeses;
    // End of variables declaration//GEN-END:variables
}
