/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Proveedores;

/**
 *
 * @author famil
 */
public class ProveedorDAO implements CRUD{
     Conexion conectar;
     Connection cn;
    

    public ProveedorDAO() {
        conectar=new Conexion();
        conectar.ConectarBasedeDatos();
        
    }
   
    

    @Override
    public ResultSet list() {
         try {
             conectar.resultado = conectar.sentencia.executeQuery("SELECT cuit, razonSocial, telefono, direccion FROM proveedor WHERE activo = true ");
         } catch (SQLException ex) {
             Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
           return conectar.resultado;
        
    }

    @Override
    public ResultSet search(String param) {
      String sql = "SELECT * FROM proveedor WHERE activo = true and (cuit LIKE '%" + param + "%' "
      + "OR razonSocial LIKE '%" + param + "%'"
      + "OR telefono LIKE '%" + param + "%'"
      + "OR direccion LIKE '%" + param + "%')";
   
         try {
             conectar.resultado = conectar.sentencia.executeQuery(sql);
         } catch (SQLException ex) {
             Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
       return conectar.resultado;
    }

    @Override
    public void update(Object model) {
        Proveedores proveedor=(Proveedores)model;
       String sql = "UPDATE proveedor SET  razonSocial = '" + proveedor.getRazonSocial()+"', telefono ='" + proveedor.getTelefono()+"', direccion ='" + proveedor.getDireccion()+"' WHERE cuit = '" + proveedor.getCuit() + "' ";
      try {
            conectar.sentencia.executeUpdate(sql);
         } catch (SQLException ex) {
           Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
      
        
    }

   
}
