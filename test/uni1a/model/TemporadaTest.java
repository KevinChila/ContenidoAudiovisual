package uni1a.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemporadaTest {

    @Test
    void testTemporada() {
        // Crea una temporada con número de temporada y número de episodios
        Temporada temporada = new Temporada(1, 10);

        // Verifica que la temporada se ha creado correctamente
        assertNotNull(temporada, "La temporada no debe ser nula");
    }

    @Test
    void testMostrarDetalles() {
        // Crea una temporada con número de temporada y número de episodios
        Temporada temporada = new Temporada(1, 10);

        // Verifica que el método mostrarDetalles no lanza ninguna excepción
        try {
            temporada.mostrarDetalles(); // Esto imprimirá en consola
        } catch (Exception e) {
            fail("El método mostrarDetalles no debe lanzar excepciones: " + e.getMessage());
        }
    }

    @Test
    void testToCSV() {
        // Crea una temporada con número de temporada y número de episodios
        Temporada temporada = new Temporada(1, 10);

        // Verifica que el método toCSV devuelve el formato correcto
        String csv = temporada.toCSV();
        assertEquals("Temporada 1,10", csv, "El valor CSV no es el esperado");
    }
}