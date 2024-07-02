package swing;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;

public class VentanaBotonRadio1 extends javax.swing.JFrame {

    ButtonGroup estilo = new ButtonGroup();

    
    public VentanaBotonRadio1() {
        initComponents();
        estilo.add(rdo0);
        estilo.add(rdo1);
        estilo.add(rdo2);
        estilo.add(rdo3);
        crearFecha();

    }
    
    public void crearFecha() {
        DateFormat formatear = DateFormat.getDateInstance(DateFormat.FULL);
        Date fecha = new Date(); //Recupera la fecha del sistema
        String s = formatear.format(fecha).toUpperCase();
        lblFecha.setText(s);
    }
    
    public void cambiarEstilo(int estilo) {
        lblMensaje.setFont(new java.awt.Font("Courier New", estilo, 24));
        this.repaint();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        rdo0 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR ESTILO LETRA DINAMICAMENTE");
        lblTitulo.setOpaque(true);

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 51));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("SOLO SE QUE NADA SE");

        rdo0.setText("Plain");
        rdo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo0ActionPerformed(evt);
            }
        });

        rdo1.setText("Bold");
        rdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo1ActionPerformed(evt);
            }
        });

        rdo2.setText("Italic");
        rdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo2ActionPerformed(evt);
            }
        });

        rdo3.setText("Bold Italic");
        rdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo3ActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(51, 51, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rdo0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(rdo1)
                .addGap(55, 55, 55)
                .addComponent(rdo2)
                .addGap(66, 66, 66)
                .addComponent(rdo3)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblMensaje)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo3)
                    .addComponent(rdo2)
                    .addComponent(rdo1)
                    .addComponent(rdo0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo0ActionPerformed
        cambiarEstilo(0);
    }//GEN-LAST:event_rdo0ActionPerformed

    private void rdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo1ActionPerformed
       cambiarEstilo(1);
    }//GEN-LAST:event_rdo1ActionPerformed

    private void rdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo2ActionPerformed
        cambiarEstilo(2);
    }//GEN-LAST:event_rdo2ActionPerformed

    private void rdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo3ActionPerformed
        cambiarEstilo(3);
    }//GEN-LAST:event_rdo3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBotonRadio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    // End of variables declaration//GEN-END:variables
}
