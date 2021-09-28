
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Conexion;


public class ClienteDAO implements CRUD {
    Conexion conectar;
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
   
     public Cliente listarID(int idCliente){
         Cliente c= new Cliente();
         String sql="select * from cliente where idCliente=? ";
         try{
             cn= conectar.ConectarBasedeDatos();
             ps = cn.prepareStatement(sql);
             ps.setInt(1,idCliente);
             rs= ps.executeQuery();
             while(rs.next()){
                 c.setIdCliente(rs.getInt(1));
                 c.setNombre(rs.getString(2));
                
                 
             }
             
         }catch(SQLException e){
             
         }
           return c;
     }

    
    public ClienteDAO(){
        conectar= new Conexion();
        conectar.ConectarBasedeDatos();
    }
   
       
    @Override
    public ResultSet list() {
          try {
             conectar.resultado = conectar.sentencia.executeQuery("SELECT idCliente, nombre, apellido, cuit FROM cliente WHERE activo = true ");
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
           return conectar.resultado;
    }

    @Override
    public ResultSet search(String param) {
      String sql = "SELECT * FROM cliente WHERE activo = true and (idCliente LIKE '%" + param + "%' "
      + "OR nombre LIKE '%" + param + "%'"
      + "OR apellido LIKE '%" + param + "%'"
      + "OR cuit LIKE '%" + param + "%')";
   
         try {
             conectar.resultado = conectar.sentencia.executeQuery(sql);
         } catch (SQLException ex) {
             Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
       return conectar.resultado;
    }

    @Override
    public void update(Object model) {
       Cliente cli = (Cliente)model;
       String sql = "UPDATE cliente SET  nombre = '" + cli.getNombre()+"', apellido ='" + cli.getApellido()+"',cuit = '" + cli.getCuit()+"'  WHERE idCliente = '" + cli.getIdCliente()+ "' ";
      try {
            conectar.sentencia.executeUpdate(sql);
         } catch (SQLException ex) {
           Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }
    
}
