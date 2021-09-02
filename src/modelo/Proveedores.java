
package modelo;


public class Proveedores {
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

    @Override
    public String toString() {
        return "Proveedores{" + "id=" + id + ", cuit=" + cuit + ", razonSocial=" + razonSocial + ", telefono=" + telefono + ", direccion=" + direccion + ", activo=" + activo + '}';
    }
    
    
    

}
   