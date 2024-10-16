package models;

public class Persona {
    private String nombre;
    private String telefono;
    private String corre;

    public Persona(String nombre, String telefono, String corre) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.corre = corre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", corre='" + corre + '\'' +
                '}';
    }
}
