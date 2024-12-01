package uni1a.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoticiaTest {

    @Test
    void testNoticia() {
        // Crear una noticia de prueba
        Noticia noticia = new Noticia("Últimas noticias del clima", 10, "Actualidad", "Juan Pérez", "Resúmen sobre el clima.");

        // Verificar que el constructor asigna correctamente los valores
        assertNotNull(noticia, "La noticia no debe ser nula");
        assertEquals("Últimas noticias del clima", noticia.getTitulo(), "El título de la noticia no es el esperado");
        assertEquals(10, noticia.getDuracionEnMinutos(), "La duración en minutos no es la esperada");
        assertEquals("Actualidad", noticia.getGenero(), "El género no es el esperado");
      
    }

    @Test
    void testMostrarDetalles() {
        // Crear una noticia de prueba
        Noticia noticia = new Noticia("Últimas noticias del clima", 10, "Actualidad", "Juan Pérez", "Resúmen sobre el clima.");

        // Verificar que el método mostrarDetalles no lance excepciones y que la salida esté correcta
        assertDoesNotThrow(() -> noticia.mostrarDetalles(), "No debería lanzar ninguna excepción");

        // Capturar la salida de consola o verificar visualmente si es necesario
        // Aquí simplemente verificamos que no haya excepción al ejecutar el método
    }

    @Test
    void testToCSV() {
        // Crear una noticia de prueba
        Noticia noticia = new Noticia("Últimas noticias del clima", 10, "Actualidad", "Juan Pérez", "Resúmen sobre el clima.");

        // Verificar que el método toCSV devuelve el formato esperado
        String expectedCSV = "Noticia,Últimas noticias del clima,10,Actualidad,Juan Pérez,Resúmen sobre el clima.";
        assertEquals(expectedCSV, noticia.toCSV(), "El CSV generado no es el esperado");
    }

    @Test
    void testMostrarDetallesSinResumen() {
        // Crear una noticia sin resumen
        Noticia noticia = new Noticia("Últimas noticias del clima", 10, "Actualidad", "Juan Pérez", "");

        // Verificar que el método mostrarDetalles funciona correctamente incluso sin resumen
        assertDoesNotThrow(() -> noticia.mostrarDetalles(), "No debería lanzar ninguna excepción");
    }

    // Agregar más pruebas según sea necesario
}
