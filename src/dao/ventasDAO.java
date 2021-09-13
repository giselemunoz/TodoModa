
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Conexion;

/**
 *
 * @author Gisel Muñoz
 */
public class ventasDAO implements CRUD{
     Conexion conectar;
     Connection cn;
     PreparedStatement ps;
     ResultSet rs;
    

    public ventasDAO() {
        conectar=new Conexion();
        conectar.ConectarBasedeDatos();
        
        
        
    }

    @Override
    public ResultSet list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
