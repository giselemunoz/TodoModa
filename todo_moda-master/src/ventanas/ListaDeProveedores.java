package ventanas;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import dao.ProveedorDAO;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Proveedores;

/**
 *
 * @author Gisel Muñoz
 */
public class ListaDeProveedores extends javax.swing.JInternalFrame {

    ProveedorDAO proveedorDao = new ProveedorDAO();
    ResultSet resultado;
    DefaultTableModel modelo = new DefaultTableModel();
    
    

    public ListaDeProveedores() {
        initComponents();
        
        
            try {
                
                JtProveedores.setModel(modelo);

                resultado = proveedorDao.list();

                ResultSetMetaData resultadosMd = (ResultSetMetaData) resultado.getMetaData();
                int cantidadDeColumnas = resultadosMd.getColumnCount();

              
                modelo.addColumn("Cuit");
                modelo.addColumn("Razon Social");
                modelo.addColumn("Telefono");
                modelo.addColumn("Direccion");
                JtProveedores.setModel(modelo);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        JtProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        jbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PROVEEDORES");

        JtProveedores.setBorder(new javax.swing.border.MatteBorder(null));
        JtProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cuit", "Razon Social", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtProveedoresKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JtProveedores);

        jLabel1.setFont(new java.awt.Font("Century", 2, 11)); // NOI18N
        jLabel1.setText("Proveedores");

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario (1)_opt.png"))); // NOI18N
        Agregar.setText("AGREGAR");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_opt.png"))); // NOI18N
        btnborrar.setText("Eliminar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
            }
        });
        jbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jbuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbuscarKeyTyped(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_opt.png"))); // NOI18N
        jLabel2.setText("BUSCADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar)
                    .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuscarActionPerformed

    private void jbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuscarKeyTyped


    }//GEN-LAST:event_jbuscarKeyTyped

    private void jbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuscarKeyReleased

    }//GEN-LAST:event_jbuscarKeyReleased

    private void jbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuscarKeyPressed
        String[] nombres = {"cuit", "razonSocial", "telefono", "direccion"};
        String[] registro = new String[30];
        String valor = jbuscar.getText();

        DefaultTableModel model = new DefaultTableModel(null, nombres);

        try {
            resultado = proveedorDao.search(valor);

            while (resultado.next()) {
                registro[0] = resultado.getString("cuit");
                registro[1] = resultado.getString("razonSocial");
                registro[2] = resultado.getString("telefono");
                registro[3] = resultado.getString("direccion");
                model.addRow(registro);
            }
            JtProveedores.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(ListaDeProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }//GEN-LAST:event_jbuscarKeyPressed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked


    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Proveedor prov = new Proveedor();
        prov.setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void JtProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtProveedoresKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Proveedores proveedor = new Proveedores();

            String cuit = JtProveedores.getValueAt(JtProveedores.getSelectedRow(), 0).toString();
            String razonSocial = JtProveedores.getValueAt(JtProveedores.getSelectedRow(), 1).toString();
            int telefono = Integer.parseInt(JtProveedores.getValueAt(JtProveedores.getSelectedRow(), 2).toString());
            String direccion = JtProveedores.getValueAt(JtProveedores.getSelectedRow(), 3).toString();

            proveedor.setCuit(cuit);
            proveedor.setRazonSocial(razonSocial);
            proveedor.setTelefono(telefono);
            proveedor.setDireccion(direccion);
            proveedorDao.update(proveedor);
            JOptionPane.showMessageDialog(null, "El Proveedor fue modificado con éxito");

        }
        
         
        
    }//GEN-LAST:event_JtProveedoresKeyReleased

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
       
        int fila = JtProveedores.getSelectedRow();

        String valor = JtProveedores.getValueAt(fila, 0).toString();

        try {
           int confirmado =JOptionPane.showConfirmDialog(null, "¿Desea borrar el proveedor?");
            
            if(JOptionPane.OK_OPTION == confirmado){
            Conexion cc = new Conexion();
            
            Connection cn = cc.ConectarBasedeDatos();
            String sql = "UPDATE proveedor SET  activo  = '0' WHERE cuit = '" + valor + "' ";
            PreparedStatement eliminar = cn.prepareStatement(sql);
            eliminar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ha eliminado con exito al proovedor ");
            }
            

        } catch (SQLException e) {
        }
    
    }//GEN-LAST:event_btnborrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTable JtProveedores;
    private javax.swing.JButton btnborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbuscar;
    // End of variables declaration//GEN-END:variables
}
