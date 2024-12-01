package uni1a.model;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        mostrarInformacionBasica();
        if (temporadas != null) {
            for (Temporada temporada : temporadas) {
                temporada.mostrarDetalles();
            }
        } else {
            System.out.println("No se han asignado temporadas.");
        }
    }

    @Override
    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie de TV,").append(getTitulo()).append(",").append(getDuracionEnMinutos()).append(",").append(getGenero()).append(",");
        for (Temporada temporada : temporadas) {
            sb.append(temporada.toCSV()).append(";");
        }
        return sb.toString();
    }

    private void mostrarInformacionBasica() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }
}