
package modelo;

/**
 *
 * @author Gisel Muñoz
 */
public class DetalleVenta {
    int idDetalleVentas;
    int idVentas;
    int idProducto;
    int cantidad;
    float precio;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVentas, int idVentas, int idProducto, int cantidad, float precio) {
        this.idDetalleVentas = idDetalleVentas;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(int idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVentas=" + idDetalleVentas + ", idVentas=" + idVentas + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

   
    
    
}
