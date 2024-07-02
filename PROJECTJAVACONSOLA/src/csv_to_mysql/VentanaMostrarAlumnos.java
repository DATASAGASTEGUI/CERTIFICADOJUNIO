package csv_to_mysql;

import java.awt.Image;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.sql.Connection;

public class VentanaMostrarAlumnos extends javax.swing.JFrame {

    String[] cabecera = {"IDALUMNO", "NOMBRE", "SEXO", "NACIMIENTO"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);

    ConexionMysql cm = new ConexionMysql("INSTITUTO");
    Connection conexion = cm.getConexion();

    public VentanaMostrarAlumnos() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cmdCargar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cmdCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cmdLimpiar)
                .addGap(52, 52, 52)
                .addComponent(cmdSalir)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCargar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>                        

    private void cmdCargarActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
    }                                         

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        limpiar();
    }                                          

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cmdCargar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration                   
}
