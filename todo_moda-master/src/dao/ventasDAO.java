package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.DetalleVenta;
import modelo.ventas;

public class ventasDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    public String IdVentas() {
        String idv = "";
        String sql = "select max(IdVentas)from ventas";
        try {
            con = cn.ConectarBasedeDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idv = rs.getString(1);
            }
        } catch (Exception e) {

        }
        return idv;
    }

    public int RegistrarVenta(ventas v) {

      ventas ventas = new ventas();

        String sql = "INSERT INTO ventas (idCliente,idVendedor, total) VALUES (?,?,?)";
        try {

            con = cn.ConectarBasedeDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setDouble(3, v.getTotal());
            r= ps.executeUpdate();

        } catch (SQLException e) {
           
        }

        return r;
    }

    public int RegistrarDetalleVentas(DetalleVenta dv)  {
        String sql = "insert into detalle_venta(idVentas,idProducto,cantidad,precio)values (?,?,?,?)";

        try {
            con = cn.ConectarBasedeDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setFloat(4, dv.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }


}

