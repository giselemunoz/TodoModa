
package modelo;

public class Usuario {
    
   int id;
   String usuario;
   int dni; 

    public Usuario() {
    }

    public Usuario(int id, String usuario, int dni) {
        this.id = id;
        this.usuario = usuario;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   
   
}

