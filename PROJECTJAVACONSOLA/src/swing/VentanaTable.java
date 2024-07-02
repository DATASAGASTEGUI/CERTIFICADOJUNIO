package swing;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class VentanaTable extends javax.swing.JFrame {

    String[] cabecera = {"N1","N2","N3","N4","PROMEDIO"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo,cabecera);
    
    public VentanaTable() {
        initComponents();
        personalizarVentana();
        
        tblPromedio.setModel(dtm);
    }
    
    public void cargarDatosTable() {
                // 0 1 2 3 4
       int[] n1 = {4,5,7,8,2}; 
       int[] n2 = {1,5,6,8,5};
       int[] n3 = {4,3,7,8,2};
       int[] n4 = {8,5,7,8,1};
       
       String[] datosblanco = {"","","","",""};
       for(int i=0; i<n1.length; i++) {
           dtm.addRow(datosblanco);
           
       }
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

        panel1 = new javax.swing.JScrollPane();
        tblPromedio = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        cmdCargar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPromedio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        panel1.setViewportView(tblPromedio);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROMEDIO DE 4 NOTAS DESCARTANDO LA MENOR");
        lblTitulo.setOpaque(true);

        cmdCargar.setText("CARGAR");
        cmdCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCargarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("LIMPIAR");

        cmdSalir.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cmdCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdLimpiar)
                .addGap(39, 39, 39)
                .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCargar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargarActionPerformed
        cargarDatosTable();
    }//GEN-LAST:event_cmdCargarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCargar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane panel1;
    private javax.swing.JTable tblPromedio;
    // End of variables declaration//GEN-END:variables
}
