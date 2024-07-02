package csv_to_mysql;

import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class VentanaMostrar extends javax.swing.JFrame {

    String[] cabecera = {"IDALUMNO", "NOMBRE", "SEXO", "NACIMIENTO"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);

    ConexionMysql cm = new ConexionMysql("INSTITUTO");
    Connection conexion = cm.getConexion();

    public VentanaMostrar() {
        initComponents();
        personalizarVentana();
        personalizarTable();
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(true); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    public void personalizarTable() {
        tblMostrar.setModel(dtm);

        // Obtener el TableColumnModel del JTable
        TableColumnModel columnModel = tblMostrar.getColumnModel();
        TableColumn column = columnModel.getColumn(1);

        // Establecer el ancho preferido, mínimo y máximo para la columna
        column.setPreferredWidth(200); // Ancho preferido
        column.setMinWidth(50); // Ancho mínimo
        column.setMaxWidth(200); // Ancho máximo        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cmdCargar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdAgregarFilaBlanco = new javax.swing.JButton();
        cmdGrabar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        cmdCargar.setText("CARGAR");
        cmdCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCargarActionPerformed(evt);
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

        cmdAgregarFilaBlanco.setText("AGREGAR FILA BLANCO");
        cmdAgregarFilaBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarFilaBlancoActionPerformed(evt);
            }
        });

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdActualizar.setText("ACTUALIZAR");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cmdCargar)
                        .addGap(18, 18, 18)
                        .addComponent(cmdLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(cmdEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(cmdGrabar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(cmdAgregarFilaBlanco)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(cmdActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCargar)
                    .addComponent(cmdSalir)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAgregarFilaBlanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdGrabar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargarActionPerformed
        limpiar();

        List<Alumno> alumnos_al = obtenerTodosLosRegistros();

        String[] filaBlanco = {"", "", "", ""};

        for (int i = 0; i < alumnos_al.size(); i++) {
            dtm.addRow(filaBlanco);
            Alumno alumno = alumnos_al.get(i);
            dtm.setValueAt(alumno.getIdAlumno(), i, 0);
            dtm.setValueAt(alumno.getNombreApellido(), i, 1);
            dtm.setValueAt(alumno.getSexo(), i, 2);
            dtm.setValueAt(alumno.getFechaNacimiento(), i, 3);
        }
    }//GEN-LAST:event_cmdCargarActionPerformed

    public void limpiar() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
    }

    public List<Alumno> obtenerTodosLosRegistros() {
        List<Alumno> alumnos_al = new ArrayList<>();
        String sql = "SELECT * FROM Alumno";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt("idAlumno");
                String nombreApellido = rs.getString("nombre_apellido");
                String sexo = rs.getString("sexo");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                Alumno alumno = new Alumno(idAlumno, nombreApellido, sexo, fechaNacimiento);
                alumnos_al.add(alumno);
            }
        } catch (SQLException e) {
            alumnos_al = null;
        }
        return alumnos_al;
    }
    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdAgregarFilaBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarFilaBlancoActionPerformed
        String[] filaBlanco = {"", "", "", ""};
        dtm.addRow(filaBlanco);
        MetodoCrud mc = new MetodoCrud(conexion);
        int ultimo = mc.obtenerUltimoIdAlumno();
        dtm.setValueAt(ultimo, 0, 0);
    }//GEN-LAST:event_cmdAgregarFilaBlancoActionPerformed

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        int numeroFilas = dtm.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            int idAlumno = Integer.parseInt(String.valueOf(dtm.getValueAt(i, 0)));
            String nombreApellido = String.valueOf(dtm.getValueAt(i, 1));
            String sexo = String.valueOf(dtm.getValueAt(i, 2));
            String fechaNacimiento = String.valueOf(dtm.getValueAt(i, 3));
            Date fechaNacimientoDate = Date.valueOf(LocalDate.parse(fechaNacimiento));
            Alumno alumno = new Alumno(idAlumno, nombreApellido, sexo, fechaNacimientoDate);
            MetodoCrud mc = new MetodoCrud(conexion);
            if (mc.insertarAlumno(alumno)) {
                JOptionPane.showMessageDialog(null, "INSERT ALUMNO", "OK", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "INSERT ALUMNO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmdGrabarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int indice = tblMostrar.getSelectedRow();
        if (indice != -1) {
            int idAlumno = Integer.parseInt(String.valueOf(dtm.getValueAt(indice, 0)));
            System.out.println(idAlumno);
            Alumno alumno = new Alumno(idAlumno);
            MetodoCrud mc = new MetodoCrud(conexion);
            if (mc.eliminarAlumno(alumno)) {
                JOptionPane.showMessageDialog(null, "DELETE ALUMNO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                dtm.removeRow(indice);
            } else {
                JOptionPane.showMessageDialog(null, "DELETE ALUMNO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            //System.out.println(indice);
        } else {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        int indice = tblMostrar.getSelectedRow();
        if(indice != -1) {
           int idAlumno = Integer.parseInt(String.valueOf(dtm.getValueAt(indice, 0))); 
           String nombreApellido = String.valueOf(dtm.getValueAt(indice, 1));
           String sexo = String.valueOf(dtm.getValueAt(indice, 2));
           String fechaNacimiento = String.valueOf(dtm.getValueAt(indice, 3));
           Date fechaNacimientoDate = Date.valueOf(LocalDate.parse(fechaNacimiento));
           Alumno alumno = new Alumno(idAlumno,nombreApellido,sexo,fechaNacimientoDate);
           MetodoCrud mc = new MetodoCrud(conexion);
           if(mc.actualizarAlumno(alumno)) {
              JOptionPane.showMessageDialog(null, "UPDATE ALUMNO", "OK", JOptionPane.INFORMATION_MESSAGE);  
           }else {
              JOptionPane.showMessageDialog(null, "UPDATE ALUMNO", "ERROR", JOptionPane.ERROR_MESSAGE);   
           }
        }else {
           JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_cmdActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdAgregarFilaBlanco;
    private javax.swing.JButton cmdCargar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
