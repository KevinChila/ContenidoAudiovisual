package uni1a.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class  ArchivoHandler {
    public static void exportarContenidoAArchivoCSV(List<Exportable> contenidos, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Exportable contenido : contenidos) {
                writer.write(contenido.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al exportar el archivo CSV: " + e.getMessage());
        }
    }
}