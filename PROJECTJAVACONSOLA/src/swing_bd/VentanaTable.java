package swing;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaTable extends javax.swing.JFrame {

    String[] cabecera = {"N1", "N2", "N3", "N4", "PROMEDIO"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);

    public VentanaTable() {
        initComponents();
        personalizarVentana();

        tblPromedio.setModel(dtm);

        tblPromedio.getTableHeader().setBackground(Color.BLACK);
        tblPromedio.getTableHeader().setForeground(Color.WHITE);
        tblPromedio.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14));
        tblPromedio.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232)));
    }

    public void cargarDatosTable() {
        // 0 1 2 3 4
        int[] n1 = {4, 5, 7, 8, 2};
        int[] n2 = {1, 5, 6, 8, 5};
        int[] n3 = {4, 3, 7, 8, 2};
        int[] n4 = {8, 5, 7, 8, 1};
        double promedio = 0;
        double promedioClase = 0;
        String[] datosblanco = {"", "", "", "", ""};
        int i;
        for (i = 0; i < n1.length; i++) {
            dtm.addRow(datosblanco);
            dtm.setValueAt(n1[i], i, 0);//dato,fila,columna   4,0,0
            dtm.setValueAt(n2[i], i, 1);//                    1,0,1
            dtm.setValueAt(n3[i], i, 2);//                    4,0,2
            dtm.setValueAt(n4[i], i, 3);//                    8,0,3

            int menornota = n1[i];
            if (n2[i] < menornota) {
                menornota = n2[i];
            }
            if (n3[i] < menornota) {
                menornota = n3[i];
            }
            if (n4[i] < menornota) {
                menornota = n4[i];
            }

            promedio = (n1[i] + n2[i] + n3[i] + n4[i] - menornota) / 3.0;
            promedioClase = promedioClase + promedio;
            String promedios = String.format("%5.2f", promedio);
            dtm.setValueAt(promedios, i, 4);
        }
        promedioClase = promedioClase / dtm.getRowCount();
        dtm.addRow(datosblanco);
        dtm.setValueAt("PROM CLASE", i, 3);// 
        String promedioClases = String.format("%5.2f", promedioClase);
        dtm.setValueAt(promedioClases, i, 4);//
    }

    public void cargarDatosTable1() {
        int[] a1 = {4, 1, 4, 8};
        int[] a2 = {5, 5, 3, 5};
        int[] a3 = {7, 6, 7, 7};
        int[] a4 = {8, 8, 8, 8};
        int[] a5 = {2, 5, 2, 1};

        String[] datosblanco = {"", "", "", "", ""};
        for (int f = 0; f < 1; f++) {
            dtm.addRow(datosblanco);
            dtm.setValueAt(a1[0], f, 0);//dato,fila,columna   4,0,0
            dtm.setValueAt(a1[1], f, 1);//                    1,0,1
            dtm.setValueAt(a1[2], f, 2);//                    4,0,2
            dtm.setValueAt(a1[3], f, 3);//                    8,0,3
        }
        for (int f = 1; f < 2; f++) {
            dtm.addRow(datosblanco);
            dtm.setValueAt(a2[0], f, 0);//dato,fila,columna   4,0,0
            dtm.setValueAt(a2[1], f, 1);//                    1,0,1
            dtm.setValueAt(a2[2], f, 2);//                    4,0,2
            dtm.setValueAt(a2[3], f, 3);//                    8,0,3
        }
    }

    public void cargarDatosTable2() {
        int[] a1 = {4, 1, 4, 8};
        int[] a2 = {5, 5, 3, 5};
        int[] a3 = {7, 6, 7, 7};
        int[] a4 = {8, 8, 8, 8};
        int[] a5 = {2, 5, 2, 1};

        List<int[]> notas_al = new ArrayList<>();
        notas_al.add(a1);
        notas_al.add(a2);
        notas_al.add(a3);
        notas_al.add(a4);
        notas_al.add(a5);

        String[] datosblanco = {"", "", "", "", ""};
        for (int f = 0; f < notas_al.size(); f++) {
            dtm.addRow(datosblanco);
            int[] notas_v = notas_al.get(f);
            dtm.setValueAt(notas_v[0], f, 0);//dato,fila,columna   4,0,0
            dtm.setValueAt(notas_v[1], f, 1);//                    1,0,1
            dtm.setValueAt(notas_v[2], f, 2);//                    4,0,2
            dtm.setValueAt(notas_v[3], f, 3);//                    8,0,3
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

        tblPromedio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tblPromedio.setForeground(new java.awt.Color(51, 51, 255));
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
        tblPromedio.setGridColor(new java.awt.Color(255, 0, 51));
        tblPromedio.setRowHeight(25);
        tblPromedio.setShowGrid(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCargar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargarActionPerformed
        limpiar();
        cargarDatosTable();
    }//GEN-LAST:event_cmdCargarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    public void limpiar() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
    }

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