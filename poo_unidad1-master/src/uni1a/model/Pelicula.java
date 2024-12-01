package uni1a.model;

public class Pelicula extends ContenidoAudiovisual {
    private Actor actorPrincipal;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String productora, Actor actorPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.actorPrincipal = actorPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        mostrarInformacionBasica();
        actorPrincipal.mostrarDetalles();
    }

    @Override
    public String toCSV() {
        return "Película," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + actorPrincipal.toCSV();
    }

    private void mostrarInformacionBasica() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }
}
