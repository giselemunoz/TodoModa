
package modelo;


public class Producto {
    
    int id;
    String descripcion;
    int id_proveedor;
    int id_rubro;
    float costo;
    float precio_venta;
    int cantidad;

    public Producto() {
    }

    public Producto(int id, String descripcion, int id_proveedor, int id_rubro, float costo, float precio_venta, int cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.id_proveedor = id_proveedor;
        this.id_rubro = id_rubro;
        this.costo = costo;
        this.precio_venta = precio_venta;
        this.cantidad = cantidad;
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

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", id_proveedor=" + id_proveedor + ", id_rubro=" + id_rubro + ", costo=" + costo + ", precio_venta=" + precio_venta + ", cantidad=" + cantidad + '}';
    }

    public void setprov(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getDescripcion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}