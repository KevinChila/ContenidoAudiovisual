package uni1a.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvestigadorTest {

    @Test
    void testInvestigador() {
        // Crea un investigador con nombre y especialidad
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Verifica que el investigador se ha creado correctamente
        assertNotNull(investigador, "El investigador no debe ser nulo");
        assertEquals("Dr. John Smith", investigador.getNombre(), "El nombre del investigador no es el esperado");
        assertEquals("Biología Molecular", investigador.getEspecialidad(), "La especialidad del investigador no es la esperada");
    }

    @Test
    void testGetNombre() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Verifica que el nombre del investigador es correcto
        assertEquals("Dr. John Smith", investigador.getNombre(), "El nombre del investigador no es correcto");
    }

    @Test
    void testSetNombre() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Cambia el nombre del investigador
        investigador.setNombre("Dr. Jane Doe");

        // Verifica que el nombre se ha actualizado correctamente
        assertEquals("Dr. Jane Doe", investigador.getNombre(), "El nombre del investigador no se actualizó correctamente");
    }

    @Test
    void testGetEspecialidad() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Verifica que la especialidad del investigador es correcta
        assertEquals("Biología Molecular", investigador.getEspecialidad(), "La especialidad del investigador no es correcta");
    }

    @Test
    void testSetEspecialidad() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Cambia la especialidad del investigador
        investigador.setEspecialidad("Química Orgánica");

        // Verifica que la especialidad se ha actualizado correctamente
        assertEquals("Química Orgánica", investigador.getEspecialidad(), "La especialidad del investigador no se actualizó correctamente");
    }

    @Test
    void testMostrarDetalles() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Verifica que no se lanza ninguna excepción al mostrar los detalles
        try {
            investigador.mostrarDetalles(); // Esto imprimirá en consola
        } catch (Exception e) {
            fail("El método mostrarDetalles no debe lanzar excepciones: " + e.getMessage());
        }
    }

    @Test
    void testToCSV() {
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Molecular");

        // Verifica que el método toCSV devuelve el formato correcto
        String csv = investigador.toCSV();
        assertEquals("Dr. John Smith,Biología Molecular", csv, "El valor CSV no es el esperado");
    }
}
