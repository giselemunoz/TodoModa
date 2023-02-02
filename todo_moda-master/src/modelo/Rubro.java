
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Gisel Muñoz
 */
public class Rubro {
    Conexion conectar;
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
    int id;
    String nombre;

    public Rubro() {
    }

    public Rubro(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public void ConsultarRubro(JComboBox<Rubro> rubro) {
        String sql = "SELECT idRubro, nombre FROM rubro";
        try {
            cn = conectar.ConectarBasedeDatos();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rubro.addItem(new Rubro(rs.getInt("idRubro"),
                        rs.getString("nombre")));

            }
        } catch (SQLException e) {
            System.out.println("no funciona!!!!");
        }

    }
    @Override
        public String toString(){
            return nombre;
        }
}
