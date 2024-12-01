package uni1a.view;

import uni1a.model.ContenidoAudiovisual;
import uni1a.model.Exportable;
import java.util.List;
import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n--- Menú de Contenidos Audiovisuales ---");
        System.out.println("1. Ver detalles de todos los contenidos");
        System.out.println("2. Exportar contenidos a CSV");
        System.out.println("3. Salir");
    }

    public int obtenerOpcionMenu() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarDetalles(List<Exportable> contenidos) {
        for (Exportable contenido : contenidos) {
            if (contenido instanceof ContenidoAudiovisual) {
                ((ContenidoAudiovisual) contenido).mostrarDetalles();
            }
        }
    }

    public String obtenerNombreArchivo() {
        System.out.print("Ingrese el nombre del archivo CSV (incluya la extensión .csv): ");
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}