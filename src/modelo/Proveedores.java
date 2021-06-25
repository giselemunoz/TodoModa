
package modelo;


public class Proveedores {
    int id;
    char cuit;
    String razonSocial;
    char direccion;
    int telefono;

    public Proveedores() {
    }

    public Proveedores(int id, char cuit, String razonSocial, char direccion, int telefono) {
        this.id = id;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getCuit() {
        return cuit;
    }

    public void setCuit(char cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "id=" + id + ", cuit=" + cuit + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
    
    
}

