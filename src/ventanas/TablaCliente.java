/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import dao.ClienteDAO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import static ventanas.VentasForm.txtCodigoCliente;

/**
 *
 * @author Gisel Muñoz
 */
public class TablaCliente extends javax.swing.JFrame {

    ClienteDAO clienteDAO= new ClienteDAO();
    ResultSet resultado;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public TablaCliente() {
        initComponents();
                 try {
                
                JtLista.setModel(modelo);

                resultado = clienteDAO.list();

                ResultSetMetaData resultadosMd = (ResultSetMetaData) resultado.getMetaData();
                int cantidadDeColumnas = resultadosMd.getColumnCount();

              
                modelo.addColumn("Codigo");
                modelo.addColumn("Nombre");
                modelo.addColumn("Cuit");
                JtLista.setModel(modelo);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JtLista = new javax.swing.JTable();

        setTitle("LISTA DE CLIENTES");

        JtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cuit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtListaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JtLista);
        if (JtLista.getColumnModel().getColumnCount() > 0) {
            JtLista.getColumnModel().getColumn(0).setMinWidth(50);
            JtLista.getColumnModel().getColumn(0).setMaxWidth(55);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtListaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtListaKeyReleased
        // TODO add your handling code here:
         
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           // VentasForm ventas = new VentasForm();
            Cliente clien = new Cliente();
            int codigo =Integer.parseInt( JtLista.getValueAt(JtLista.getSelectedRow(),0).toString());
            String nombre = JtLista.getValueAt(JtLista.getSelectedRow(), 1).toString();
            String cuit = JtLista.getValueAt(JtLista.getSelectedRow(), 2).toString();
            
          // txtCodigoCliente.setText("" +cli.getIdCliente());
          }
          
    }//GEN-LAST:event_JtListaKeyReleased

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
            java.util.logging.Logger.getLogger(TablaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtLista;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
