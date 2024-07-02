package agenda_basedatos;

import java.awt.Image;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class VentanaAgenda extends javax.swing.JFrame {

    //BASE DE DATOS
    List<Persona> personas_al;
    
    ConexionMysql cm = new ConexionMysql("PROYECTO25");
    Connection conexion = cm.getConexion();

    public VentanaAgenda() {
        initComponents();
        personalizarVentana();
        cargarBaseDatos();
        txtIndice.setText("0");
        pintarCajitasPersona(0);
        cmdAdelante.requestFocusInWindow();
    }

    public List<Persona> obtenerTodosLosRegistros() {
        List<Persona> personas_al = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String nacimiento = rs.getString("nacimiento");
                Persona persona = new Persona(dni, nombre, apellido, direccion, telefono, nacimiento);
                personas_al.add(persona);
            }
        } catch (SQLException e) {
            personas_al = null;
        }
        return personas_al;
    }

    public void cargarBaseDatos() {
        personas_al = obtenerTodosLosRegistros();
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(true); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    public void pintarCajitasPersona(int indice) {
        Persona persona = personas_al.get(indice);
        txtDni.setText(persona.getDni());
        txtNombre.setText(persona.getNombre());
        txtPaterno.setText(persona.getPaterno());
        txtDireccion.setText(persona.getDireccion());
        txtTelefono.setText(persona.getTelefono());
        txtNacimiento.setText(persona.getNacimiento());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        lblDni = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmdAdelante = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdInicio = new javax.swing.JButton();
        cmdFin = new javax.swing.JButton();
        cmdAtras = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(571, 385));
        setMinimumSize(new java.awt.Dimension(571, 385));
        setSize(new java.awt.Dimension(571, 385));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA ELECTRONICA");
        lblTitulo.setOpaque(true);

        lblDni.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setText("DNI:");

        lblPaterno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblPaterno.setText("PATERNO:");

        lblNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE:");

        lblNacimiento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lblNacimiento.setText("NACIMIENTO:");

        lblTelefono.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("TELEFONO:");

        lblDireccion.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("DIRECCION:");

        txtDni.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(51, 51, 255));
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPaterno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtPaterno.setForeground(new java.awt.Color(51, 51, 255));
        txtPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTelefono.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNacimiento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNacimiento.setForeground(new java.awt.Color(51, 51, 255));
        txtNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDireccion.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(51, 51, 255));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdAdelante.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdAdelante.setText(">>");
        cmdAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdelanteActionPerformed(evt);
            }
        });

        cmdGuardar.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdGuardar.setText("GUARDAR");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdInicio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdInicio.setText("INICIO");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });

        cmdFin.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdFin.setText("FIN");
        cmdFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFinActionPerformed(evt);
            }
        });

        cmdAtras.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cmdAtras.setText("<<");
        cmdAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAtrasActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(204, 0, 51));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdAtras)
                        .addGap(18, 18, 18)
                        .addComponent(cmdInicio)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(cmdFin)
                                .addGap(18, 18, 18)
                                .addComponent(cmdAdelante))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201)))
                        .addGap(43, 43, 43))))
            .addComponent(separador1)
            .addComponent(separador2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDni)
                            .addComponent(lblDireccion))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblTelefono))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaterno)
                            .addComponent(lblNacimiento))))
                .addGap(23, 23, 23)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdInicio)
                        .addComponent(cmdAtras))
                    .addComponent(cmdGuardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdFin)
                        .addComponent(cmdAdelante)))
                .addGap(18, 18, 18)
                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAtrasActionPerformed
        String indices = txtIndice.getText().trim();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0) {
            indicei--;
            txtIndice.setText(indicei + "");
            pintarCajitasPersona(indicei);
        }
    }//GEN-LAST:event_cmdAtrasActionPerformed

    private void cmdAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdelanteActionPerformed
        String indices = txtIndice.getText().trim();
        int indicei = Integer.parseInt(indices);
        if (indicei < personas_al.size() - 1) {
            indicei++;
            txtIndice.setText(indicei + "");
            pintarCajitasPersona(indicei);
        }
    }//GEN-LAST:event_cmdAdelanteActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);

        String dni = txtDni.getText();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String nacimiento = txtNacimiento.getText();

        Persona persona = personas_al.get(indicei);
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setPaterno(paterno);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        persona.setNacimiento(nacimiento);

        JOptionPane.showMessageDialog(null, "GRABACION CORRECTA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
        txtIndice.setText("0");
        pintarCajitasPersona(0);
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFinActionPerformed
        txtIndice.setText((personas_al.size() - 1) + "");
        pintarCajitasPersona(personas_al.size() - 1);
    }//GEN-LAST:event_cmdFinActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdelante;
    private javax.swing.JButton cmdAtras;
    private javax.swing.JButton cmdFin;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
