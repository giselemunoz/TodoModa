/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author famil
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jCambiarUsuario = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenuItem();
        jProveeders = new javax.swing.JMenu();
        jFacturacion = new javax.swing.JMenu();
        MPedidos = new javax.swing.JMenu();
        jProductos = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jMenu.setText("MENU");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        jCambiarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jCambiarUsuario.setText("Cambiar Usuario");
        jCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCambiarUsuarioActionPerformed(evt);
            }
        });
        jMenu.add(jCambiarUsuario);

        jSalir.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenu.add(jSalir);

        jMenuBar1.add(jMenu);

        jProveeders.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProveeders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedores.png"))); // NOI18N
        jProveeders.setText("PROVEEDORES");
        jProveeders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProveedersMouseClicked(evt);
            }
        });
        jMenuBar1.add(jProveeders);

        jFacturacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        jFacturacion.setText("FACTURACIÓN");
        jFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFacturacionMouseClicked(evt);
            }
        });
        jFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFacturacionActionPerformed(evt);
            }
        });
        jMenuBar1.add(jFacturacion);

        MPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden_opt.png"))); // NOI18N
        MPedidos.setText("PEDIDOS");
        MPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPedidosMouseClicked(evt);
            }
        });
        MPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPedidosActionPerformed(evt);
            }
        });
        jMenuBar1.add(MPedidos);

        jProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jProductos.setText("PRODUCTOS");
        jProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductosMouseClicked(evt);
            }
        });
        jProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductosActionPerformed(evt);
            }
        });
        jMenuBar1.add(jProductos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCambiarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCambiarUsuarioActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
      
    }//GEN-LAST:event_jMenuActionPerformed

    private void jProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductosActionPerformed
 
    }//GEN-LAST:event_jProductosActionPerformed

    private void MPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPedidosActionPerformed
        ProveedoresForm prov = new ProveedoresForm();
        VentanaPrincipal.add(prov);
        prov.setVisible(true);
       // CentrarVentana(ped);
    }//GEN-LAST:event_MPedidosActionPerformed

    private void jFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFacturacionActionPerformed
        VentasForm ven = new VentasForm();
        VentanaPrincipal.add(ven);
        ven.setVisible(true);
        //CentrarVentana(prov);
    }//GEN-LAST:event_jFacturacionActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
        
    }//GEN-LAST:event_jSalirActionPerformed

    private void jFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFacturacionMouseClicked
        // TODO add your handling code here:
         VentasForm ven = new VentasForm();
         VentanaPrincipal.add(ven);
        ven.setVisible(true);
        //CentrarVentana(prov);
    }//GEN-LAST:event_jFacturacionMouseClicked

    private void MPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPedidosMouseClicked
        // TODO add your handling code here:
         VentasForm ven = new VentasForm();
        VentanaPrincipal.add(ven);
        ven.setVisible(true);
        //CentrarVentana(prov);
    }//GEN-LAST:event_MPedidosMouseClicked

    private void jProveedersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedersMouseClicked
        ListaDeProveedores listopro = new ListaDeProveedores();
        VentanaPrincipal.add (listopro);
        listopro.setVisible(true);
        
    }//GEN-LAST:event_jProveedersMouseClicked

    private void jProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductosMouseClicked
        Productoa listoproducto = new Productoa();
        VentanaPrincipal.add (listoproducto);
        listoproducto.setVisible(true);
    }//GEN-LAST:event_jProductosMouseClicked
 
    void CentrarVentana (JInternalFrame frame){
       VentanaPrincipal.add(frame);
       Dimension dimension= VentanaPrincipal.getSize();
       Dimension dframe = frame.getSize();
       frame.setLocation((dimension.width - dframe.width)/2,(dimension.height - dframe.height) /2);
       frame.show();
    }
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MPedidos;
    public javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem jCambiarUsuario;
    private javax.swing.JMenu jFacturacion;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jProductos;
    private javax.swing.JMenu jProveeders;
    private javax.swing.JMenuItem jSalir;
    // End of variables declaration//GEN-END:variables
}
