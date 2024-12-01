package uni1a.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ActorTest {

    @Test
    void testActor() {
        // Crea un actor con un nombre de prueba
        Actor actor = new Actor("Sam Worthington");
        
        // Verifica que el actor se ha creado correctamente
        assertNotNull(actor, "El actor no debe ser nulo");
        assertEquals("Sam Worthington", actor.getNombre(), "El nombre del actor no es el esperado");
    }

    @Test
    void testGetNombre() {
        Actor actor = new Actor("Sam Worthington");
        
        // Verifica que el nombre del actor es correcto
        assertEquals("Sam Worthington", actor.getNombre(), "El nombre del actor no es correcto");
    }

    @Test
    void testSetNombre() {
        Actor actor = new Actor("Sam Worthington");
        
        // Cambia el nombre del actor
        actor.setNombre("Zoe Saldana");
        
        // Verifica que el nombre se ha actualizado correctamente
        assertEquals("Zoe Saldana", actor.getNombre(), "El nombre del actor no se actualizó correctamente");
    }

    @Test
    void testMostrarDetalles() {
        Actor actor = new Actor("Sam Worthington");
        
        // Verifica que no se lanza ninguna excepción al mostrar los detalles
        try {
            actor.mostrarDetalles(); // Esto imprimirá en consola
        } catch (Exception e) {
            fail("El método mostrarDetalles no debe lanzar excepciones: " + e.getMessage());
        }
    }

    @Test
    void testToCSV() {
        Actor actor = new Actor("Sam Worthington");
        
        // Verifica que el método toCSV devuelve el nombre correcto
        String csv = actor.toCSV();
        assertEquals("Sam Worthington", csv, "El valor CSV no es el esperado");
    }
}
