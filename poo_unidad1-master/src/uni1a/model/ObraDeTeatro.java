package uni1a.model;

public class ObraDeTeatro extends ContenidoAudiovisual {
    private String autor;
    private String director;
    private String generoObra;

    public ObraDeTeatro(String titulo, int duracionEnMinutos, String genero, String autor, String director, String generoObra) {
        super(titulo, duracionEnMinutos, genero);
        this.autor = autor;
        this.director = director;
        this.generoObra = generoObra;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la obra de teatro:");
        mostrarInformacionBasica();
        System.out.println("Autor: " + autor);
        System.out.println("Director: " + director);
        System.out.println("Género: " + generoObra);
    }

    @Override
    public String toCSV() {
        return "Obra de Teatro," + getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + autor + "," + director + "," + generoObra;
    }

    private void mostrarInformacionBasica() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }
}
