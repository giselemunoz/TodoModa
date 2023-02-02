
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;




public class Prove {
    Conexion conectar;
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
    int id;
    String descripcion;

    public Prove() {
    }

    public Prove(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
  /*  public void ConsultarProveedor(JComboBox<Prove> proveedor){
      String sql = "SELECT idProveedor, razonSocial FROM proveedor";
        try {
            cn = conectar.ConectarBasedeDatos();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor.addItem (new Prove(
                                rs.getInt("idProveedor"),
                                rs.getString("razonSocial")
                        )
                );
                      
            }
        } catch (SQLException e) {
            System.out.println("no funciona!!!!");
        }
    }*/
    @Override
    public String toString(){
        return descripcion;
    }
}
