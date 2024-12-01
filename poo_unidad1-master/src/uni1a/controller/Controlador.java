package uni1a.controller;

import uni1a.model.*;
import uni1a.view.Vista;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controlador {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public List<Exportable> crearContenidos() {
        List<Exportable> contenidos = new ArrayList<>();

        // Crear y agregar una película
        Actor actor = new Actor("Sam Worthington");
        Pelicula pelicula = new Pelicula("Avatar", 200, "Acción", "20th Century Studios", actor);
        contenidos.add(pelicula);

        // Crear y agregar una serie de TV
        Temporada temporada1 = new Temporada(1, 10);
        Temporada temporada2 = new Temporada(2, 8);
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", Arrays.asList(temporada1, temporada2));
        contenidos.add(serie);

        // Crear y agregar un documental
        Investigador investigador = new Investigador("Neil deGrasse Tyson", "Astrophysics");
        Documental documental = new Documental("Cosmos", 45, "Science", investigador);
        contenidos.add(documental);

        // Crear y agregar una noticia
        Noticia noticia = new Noticia("Breaking News", 15, "Noticias", "John Doe", "Un nuevo descubrimiento científico.");
        contenidos.add(noticia);

        // Crear y agregar una obra de teatro
        ObraDeTeatro obraTeatro = new ObraDeTeatro("Hamlet", 180, "Tragedia", "William Shakespeare", "John Smith", "Teatro clásico");
        contenidos.add(obraTeatro);

        return contenidos;
    }

    public void mostrarDetalles(List<Exportable> contenidos) {
        vista.mostrarDetalles(contenidos);
    }

    public void exportarContenidos(List<Exportable> contenidos) {
        String nombreArchivo = vista.obtenerNombreArchivo();
        ArchivoHandler.exportarContenidoAArchivoCSV(contenidos, nombreArchivo);
        vista.mostrarMensaje("Los contenidos han sido exportados a " + nombreArchivo);
    }

    public void ejecutar() {
        List<Exportable> contenidos = crearContenidos();
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            int opcion = vista.obtenerOpcionMenu();
            switch (opcion) {
                case 1:
                    mostrarDetalles(contenidos);
                    break;
                case 2:
                    exportarContenidos(contenidos);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida, intente nuevamente.");
            }
        }
    }
}