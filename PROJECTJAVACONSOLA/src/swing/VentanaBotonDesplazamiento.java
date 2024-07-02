package swing;


public class VentanaBotonDesplazamiento extends javax.swing.JFrame {

    public VentanaBotonDesplazamiento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();
        cmdIzquierda = new javax.swing.JButton();
        cmdDerecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BOTON DESPLAZAMIENTO IZQUIERDA-DERECHA");
        lblTitulo.setOpaque(true);

        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(255, 0, 51));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");

        cmdIzquierda.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });

        cmdDerecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdDerecha.setText(">>");
        cmdDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cmdIzquierda)
                .addGap(46, 46, 46)
                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cmdDerecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdIzquierda)
                    .addComponent(cmdDerecha))
                .addGap(0, 126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechaActionPerformed
            String indices = txtIndice.getText();
            int indicei = Integer.parseInt(indices);
            indicei++;
            txtIndice.setText(indicei+"");
    }//GEN-LAST:event_cmdDerechaActionPerformed

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
            String indices = txtIndice.getText();
            int indicei = Integer.parseInt(indices);
            indicei--;
            txtIndice.setText(indicei+"");
    }//GEN-LAST:event_cmdIzquierdaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBotonDesplazamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDerecha;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables
}
