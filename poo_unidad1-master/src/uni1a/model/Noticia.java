package uni1a.model;

public class Noticia extends ContenidoAudiovisual {
    private String periodista;
    private String resumen;

    public Noticia(String titulo, int duracionEnMinutos, String genero, String periodista, String resumen) {
        super(titulo, duracionEnMinutos, genero);
        this.periodista = periodista;
        this.resumen = resumen;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la noticia:");
        mostrarInformacionBasica();
        System.out.println("Periodista: " + periodista);
        System.out.println("Resumen: " + resumen);
    }

    @Override
    public String toCSV() {
        return "Noticia," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + periodista + "," + resumen;
    }

    private void mostrarInformacionBasica() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }
}
