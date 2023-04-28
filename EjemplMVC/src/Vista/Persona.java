package Vista;

public class Persona {
    String usuario;

    public Persona(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Persona{" + "usuario=" + usuario + '}';
    }
    
    
}
