
package modelo;

/**
 *
 * @author Gisel Muñoz
 */
public class ventas {
    int idVentas;
    int idCliente;
    int idVendedor;
    int numeroFactura;
    double total;
    String fecha;

    public ventas() {
    }

    public ventas(int idVentas, int idCliente, int idVendedor, int numeroFactura, float total, String fecha) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.numeroFactura = numeroFactura;
        this.total = total;
        this.fecha = fecha;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idVentas=" + idVentas + ", idCliente=" + idCliente + ", idVendedor=" + idVendedor + ", numeroFactura=" + numeroFactura + ", total=" + total + ", fecha=" + fecha + '}';
    }

   
    
    
 
}
