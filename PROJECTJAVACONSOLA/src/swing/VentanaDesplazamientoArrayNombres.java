package swing;

public class VentanaDesplazamientoArrayNombres extends javax.swing.JFrame {

                       // 0       1       2         3        4         5
    String[] nombres = {"Luis","Miguel","Carlos","María","Vanessa","Melissa","Luisa","Gerson"};
    
    public VentanaDesplazamientoArrayNombres() {
        initComponents();
        txtNombre.setText(nombres[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmdIzquierda = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        cmdDerecha = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cmdAleatorio = new javax.swing.JButton();
        cmdInicio = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BOTON DESPLAZAMIENTO IZQUIERDA-DERECHA");
        lblTitulo.setOpaque(true);

        cmdIzquierda.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(255, 0, 51));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");

        cmdDerecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdDerecha.setText(">>");
        cmdDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechaActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdAleatorio.setText("ALEATORIO");
        cmdAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAleatorioActionPerformed(evt);
            }
        });

        cmdInicio.setText("INICIO");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });

        cmdUltimo.setText("ULTIMO");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmdInicio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdAleatorio)
                            .addGap(18, 18, 18)
                            .addComponent(cmdUltimo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmdIzquierda)
                            .addGap(42, 42, 42)
                            .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(cmdDerecha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdIzquierda)
                    .addComponent(cmdDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAleatorio)
                    .addComponent(cmdInicio)
                    .addComponent(cmdUltimo))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei > 0) {
           indicei--;
           txtIndice.setText(indicei+"");
           txtNombre.setText(nombres[indicei]); //Pinta el nombre
        }
    }//GEN-LAST:event_cmdIzquierdaActionPerformed

    private void cmdDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei < nombres.length-1) {
           indicei++;
           txtIndice.setText(indicei+"");
           txtNombre.setText(nombres[indicei]); //Pinta el nombre
        }
    }//GEN-LAST:event_cmdDerechaActionPerformed

    private void cmdAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAleatorioActionPerformed
        int aleatorio = (int)(Math.random() * nombres.length);      //[0,n]
        txtIndice.setText(aleatorio + "");
        txtNombre.setText(nombres[aleatorio]);
    }//GEN-LAST:event_cmdAleatorioActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
        txtIndice.setText("0");
        txtNombre.setText(nombres[0]);
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
        txtIndice.setText((nombres.length-1)+"");
        txtNombre.setText(nombres[nombres.length-1]);
    }//GEN-LAST:event_cmdUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDesplazamientoArrayNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDesplazamientoArrayNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAleatorio;
    private javax.swing.JButton cmdDerecha;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
