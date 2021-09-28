
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Producto;

public class ProductoDAO  implements CRUD{
     Conexion conectar;
     Connection cn;
     ResultSet rs;
     PreparedStatement ps;
     Producto prod = new Producto ();
     
     public Producto listarID(int idProducto){
         Producto p= new Producto ();
         String sql="select * from productos where idProducto=? ";
         try{
             cn= conectar.ConectarBasedeDatos();
             ps = cn.prepareStatement(sql);
             ps.setInt(1,idProducto);
             rs= ps.executeQuery();
             while(rs.next()){
                 p.setidProducto(rs.getInt(1));
                 p.setDescripcion(rs.getString(2));
                 p.setId_proveedor(rs.getInt(3));
                 p.setId_rubro(rs.getInt(4));
                 p.setCosto(rs.getFloat(5));
                 p.setPrecio_venta(rs.getFloat(6));
                 p.setCantidad(rs.getInt(8));
                // p.setEstado(rs.getString(9));
                      
                 
             }
             
         }catch(Exception e){
             
         }
         return p;
     }
    

    public ProductoDAO() {
        conectar=new Conexion();
        conectar.ConectarBasedeDatos();
        
    }
   

    @Override
    public ResultSet list() {
        try {
             conectar.resultado = conectar.sentencia.executeQuery("SELECT productos.idProducto, productos.descripcion, productos.costo, productos.precio_venta , productos.cantidad FROM productos WHERE estado = 1");
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
       String sql = "UPDATE productos SET descripcion ='" + producto.getDescripcion()+"', costo='" + producto.getCosto()+"',precio_venta ='" + producto.getPrecio_venta()+ "', cantidad ='"+producto.getCantidad() + "' WHERE idProducto = '" + producto.getidProducto() + "' ";
      try {
            conectar.sentencia.executeUpdate(sql);
         } catch (SQLException ex) {
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
      
       
    }
    
}
