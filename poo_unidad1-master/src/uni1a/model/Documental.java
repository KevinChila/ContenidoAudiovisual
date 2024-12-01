package uni1a.model;

public class Documental extends ContenidoAudiovisual {
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        mostrarInformacionBasica();
        if (investigador != null) {
            investigador.mostrarDetalles();
        } else {
            System.out.println("No se ha asignado ningún investigador.");
        }
    }

    @Override
    public String toCSV() {
        return "Documental," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + investigador.toCSV();
    }

    private void mostrarInformacionBasica() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }
}