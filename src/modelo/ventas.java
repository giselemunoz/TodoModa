
package modelo;

/**
 *
 * @author Gisel Muñoz
 */
public class ventas {
    int codigo;
    String descripcion;
    int cantidad;
    float precio;
    String fecha;

    public ventas() {
    }

    public ventas(int codigo, String descripcion, int cantidad, float precio, String fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ventas{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precio=" + precio + ", fecha=" + fecha + '}';
    }
    
    
    
}
