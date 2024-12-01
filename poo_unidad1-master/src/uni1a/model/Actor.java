package uni1a.model;

public class Actor implements Exportable {
    private String nombre;

    public Actor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Actor: " + nombre);
    }

    @Override
    public String toCSV() {
        return nombre;
    }
}