/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import dao.ProductoDAO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Producto;

/**
 *
 * @author famil
 */
public class Productoa extends javax.swing.JInternalFrame {

    ProductoDAO productoDao = new ProductoDAO();
    ResultSet resultado;
    DefaultTableModel modelo = new DefaultTableModel();

    public Productoa() {
        initComponents();

        try {

            jTableProducto.setModel(modelo);
            //jTableProducto.setAutoResizeMode(jTableProducto.AUTO_RESIZE_OFF);
            resultado = productoDao.list();

            ResultSetMetaData resultadosMd = (ResultSetMetaData) resultado.getMetaData();
            int cantidadDeColumnas = resultadosMd.getColumnCount();

            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            //modelo.addColumn("Proveedor");
            modelo.addColumn("Costo");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");

            jTableProducto.setModel(modelo);

            while (resultado.next()) {

                Object[] filas = new Object[cantidadDeColumnas];

                for (int x = 0; x < cantidadDeColumnas; x++) {
                    filas[x] = resultado.getObject(x + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.print("No funciona");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Productos");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProductoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProducto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTBuscar.setBackground(new java.awt.Color(204, 204, 255));
        jTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTBuscarKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario (1)_opt.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.black, null, null));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_opt.png"))); // NOI18N
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarea-completada (2).png"))); // NOI18N
        jButton3.setText("LISTADO");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_opt.png"))); // NOI18N
        jLabel2.setText("BUSCAR : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jLabel1.setText("PRODUCTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Producto producto = new Producto();

            int id = Integer.parseInt(jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 0).toString());
            String descripcion = jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 1).toString();
            //int idProveedor = Integer.parseInt(jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 2).toString());
            Float costo = Float.parseFloat(jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 2).toString());
            Float precio_venta = Float.parseFloat(jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 3).toString());
            int cantidad = Integer.parseInt(jTableProducto.getValueAt(jTableProducto.getSelectedRow(), 4).toString());

            producto.setId(id);
            producto.setDescripcion(descripcion);
            //producto.setId_proveedor(idProveedor);
            producto.setCosto(costo);
            producto.setPrecio_venta(precio_venta);
            producto.setCantidad(cantidad);

            productoDao.update(producto);

            JOptionPane.showMessageDialog(null, "El Producto fue modificado con éxito");

    }//GEN-LAST:event_jTableProductoKeyReleased
    
    }
    private void jTBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscarKeyTyped
        String[] nombres = {"Codigo", "descripcion", "costo", "precio_venta", "cantidad"};
        String[] registro = new String[30];
        String valor = jTBuscar.getText();

        DefaultTableModel model = new DefaultTableModel(null, nombres);

        try {
            resultado = productoDao.search(valor);

            while (resultado.next()) {
                registro[0] = resultado.getString("id");
                registro[1] = resultado.getString("descripcion");
                registro[2] = resultado.getString("costo");
                registro[3] = resultado.getString("precio_venta");
                registro[4] = resultado.getString("cantidad");
                model.addRow(registro);
            }
            jTableProducto.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(ListaDeProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTBuscarKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int fila = jTableProducto.getSelectedRow();

        String valor = jTableProducto.getValueAt(fila, 0).toString();

        try {
            Conexion cc = new Conexion();
           
            Connection cn = cc.ConectarBasedeDatos();
            String sql = "UPDATE productos SET estado  = '0' WHERE id = '" + valor + "' ";
            PreparedStatement eliminar = cn.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "El producto fue eliminado con exito");

        } catch (SQLException e) {
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscar;
    private javax.swing.JTable jTableProducto;
    // End of variables declaration//GEN-END:variables
}
