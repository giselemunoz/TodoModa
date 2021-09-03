
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Producto;

public class ProductoDAO  implements CRUD{
     Conexion conectar;
     Connection cn;
    

    public ProductoDAO() {
        conectar=new Conexion();
        conectar.ConectarBasedeDatos();
        
        
    }
   

    @Override
    public ResultSet list() {
        try {
             conectar.resultado = conectar.sentencia.executeQuery("SELECT productos.id, productos.descripcion, productos.costo, productos.precio_venta , productos.cantidad FROM productos WHERE estado = 1");
         } catch (SQLException ex) {//
             Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
           return conectar.resultado;
        
    }

    @Override
    public ResultSet search(String param) {
          String sql = "SELECT * FROM productos WHERE estado = true and (descripcion LIKE '%" + param + "%'"
      + "OR idProveedor LIKE '%" + param + "%'"
      + "OR costo LIKE '%" + param + "%'"
      + "OR precio_venta LIKE '%" + param + "%'"
      + "OR cantidad LIKE '%" + param + "%')";
   
         try {
             conectar.resultado = conectar.sentencia.executeQuery(sql);
         } catch (SQLException ex) {
             Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
             System.out.print("no funciona");
         }
       return conectar.resultado;
    }

    @Override
    public void update(Object model) {
       Producto producto=(Producto)model;
       String sql = "UPDATE productos SET descripcion ='" + producto.getDescripcion()+"', costo='" + producto.getCosto()+"',precio_venta ='" + producto.getPrecio_venta()+ "', cantidad ='"+producto.getCantidad() + "' WHERE id = '" + producto.getId() + "' ";
      try {
            conectar.sentencia.executeUpdate(sql);
         } catch (SQLException ex) {
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
      
       
    }
    
}
