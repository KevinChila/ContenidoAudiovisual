package uni1a.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DocumentalTest {

    @Test
    void testMostrarDetalles() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental con un investigador
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que el método mostrarDetalles no lance excepciones
        assertDoesNotThrow(() -> documental.mostrarDetalles(), "El método mostrarDetalles no debe lanzar excepciones");
    }

    @Test
    void testToCSV() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental con un investigador
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que el método toCSV genera el formato adecuado
        String expectedCSV = "Documental,Planeta Tierra,90,Naturaleza," + investigador.toCSV();
        assertEquals(expectedCSV, documental.toCSV(), "El CSV generado no es el esperado");
    }

    @Test
    void testDocumental() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental y verificar que no sea nulo
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        assertNotNull(documental, "El objeto documental no debe ser nulo");
    }

    @Test
    void testContenidoAudiovisual() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental y verificar su id
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        assertTrue(documental.getId() > 0, "El ID debe ser mayor que cero");
    }

    @Test
    void testGetId() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que el ID no sea nulo y sea positivo
        assertNotNull(documental.getId(), "El ID no debe ser nulo");
        assertTrue(documental.getId() > 0, "El ID debe ser mayor que cero");
    }

    @Test
    void testGetTitulo() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que el título sea el esperado
        assertEquals("Planeta Tierra", documental.getTitulo(), "El título del documental no es el esperado");
    }

    @Test
    void testSetTitulo() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Cambiar el título del documental
        documental.setTitulo("Blue Planet");
        
        // Verificar que el título haya sido actualizado correctamente
        assertEquals("Blue Planet", documental.getTitulo(), "El título no se actualizó correctamente");
    }

    @Test
    void testGetDuracionEnMinutos() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que la duración sea la esperada
        assertEquals(90, documental.getDuracionEnMinutos(), "La duración del documental no es la esperada");
    }

    @Test
    void testSetDuracionEnMinutos() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Cambiar la duración del documental
        documental.setDuracionEnMinutos(120);
        
        // Verificar que la duración haya sido actualizada correctamente
        assertEquals(120, documental.getDuracionEnMinutos(), "La duración no se actualizó correctamente");
    }

    @Test
    void testGetGenero() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Verificar que el género sea el esperado
        assertEquals("Naturaleza", documental.getGenero(), "El género del documental no es el esperado");
    }

    @Test
    void testSetGenero() {
        // Crear un objeto de la clase Investigador
        Investigador investigador = new Investigador("David Attenborough", "Naturalista");
        
        // Crear un objeto Documental
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", investigador);
        
        // Cambiar el género del documental
        documental.setGenero("Aventura");
        
        // Verificar que el género haya sido actualizado correctamente
        assertEquals("Aventura", documental.getGenero(), "El género no se actualizó correctamente");
    }
}

