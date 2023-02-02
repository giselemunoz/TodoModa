package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class Proveedores {

    Conexion conectar;
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
    int id;
    String cuit;
    String razonSocial;
    int telefono;
    String direccion;
    boolean activo;

    public Proveedores() {
    }

    public Proveedores(int id, String cuit, String razonSocial, int telefono, String direccion, boolean activo) {
        this.id = id;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   /* public void ConsultarProveedor(JComboBox<Proveedores> proveedor) {
        String sql = "SELECT idProveedor,ciut, razonSocial,telefono,direccion,activo FROM proveedor";
        try {
            cn = conectar.ConectarBasedeDatos();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                proveedor.addItem(new Proveedores(rs.getInt("idProveedor"),
                        rs.getString("cuit"),
                        rs.getString("razonSocial"),
                        rs.getInt("telefono"),
                        rs.getString("direccion"),
                        rs.getBoolean("activo")
                 )
                     );

            }
        } catch (SQLException e) {
            System.out.println("no funciona!!!!");
        }

    }*/
    @Override
    public String toString(){
        return razonSocial;
    }
}
