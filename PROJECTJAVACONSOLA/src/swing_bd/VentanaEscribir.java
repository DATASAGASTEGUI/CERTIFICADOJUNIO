package swing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEscribir extends javax.swing.JFrame {

    String[] cabecera = {"N1", "N2", "N3", "N4"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);

    public VentanaEscribir() {
        initComponents();
        personalizarTable();
    }

    public void personalizarTable() {
        tblEscribir.setModel(dtm);
    }

    public void escribirArchivoCsv(String n1, String n2, String n3, String n4) {
        //ESCRITURA DE UN ARCHIVO TEXTO
        File f; //Convertir el archivo físico en objeto
        FileWriter fw; //Abrir una caneleta de comunicación(origin-destino)
        BufferedWriter bw;//Escribir
        String fila = "";

        try {
            f = new File("data/notas.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);//Escribir

            fila = n1 + ";" + n2 + ";" + n3 + ";" + n4;
            bw.write(fila + "\r\n");

            bw.flush();//Grabar en disco(archivo)
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panel1 = new javax.swing.JScrollPane();
        tblEscribir = new javax.swing.JTable();
        cmdGrabar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdInsertarFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ESCRIBIR ARCHIVO CSV");
        lblTitulo.setOpaque(true);

        tblEscribir.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tblEscribir.setForeground(new java.awt.Color(51, 51, 255));
        tblEscribir.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEscribir.setGridColor(new java.awt.Color(255, 0, 51));
        tblEscribir.setRowHeight(25);
        tblEscribir.setShowGrid(false);
        panel1.setViewportView(tblEscribir);

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        cmdInsertarFila.setText("INSERTAR FILA");
        cmdInsertarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(cmdInsertarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cmdGrabar)
                .addGap(74, 74, 74)
                .addComponent(cmdLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdInsertarFila)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGrabar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        //RECUPERAR LOS DATOS DEL TABLE
        int numeroFilas = dtm.getRowCount();
        String patron = "[0-9]{1,2}";
        for (int i = 0; i < numeroFilas; i++) {
            String n1 = String.valueOf(dtm.getValueAt(i, 0));
            String n2 = String.valueOf(dtm.getValueAt(i, 1));
            String n3 = String.valueOf(dtm.getValueAt(i, 2));
            String n4 = String.valueOf(dtm.getValueAt(i, 3));
            if (n1.matches(patron)
                    && n2.matches(patron)
                    && n3.matches(patron)
                    && n4.matches(patron)
                    && Integer.parseInt(n1) >= 0 && Integer.parseInt(n1) <= 10
                    && Integer.parseInt(n2) >= 0 && Integer.parseInt(n2) <= 10
                    && Integer.parseInt(n3) >= 0 && Integer.parseInt(n3) <= 10
                    && Integer.parseInt(n4) >= 0 && Integer.parseInt(n4) <= 10) {
                System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
                escribirArchivoCsv(n1, n2, n3, n4);
            } else {
               JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
            }

    }//GEN-LAST:event_cmdGrabarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int numeroFilas = dtm.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            dtm.removeRow(0);
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdInsertarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarFilaActionPerformed
        String[] filasBlanco = {"", "", "", ""};
        dtm.addRow(filasBlanco);
    }//GEN-LAST:event_cmdInsertarFilaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEscribir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdInsertarFila;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane panel1;
    private javax.swing.JTable tblEscribir;
    // End of variables declaration//GEN-END:variables
}
