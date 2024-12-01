package uni1a.model;

public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public void mostrarDetalles() {
        System.out.println("Temporada " + numero + " - Episodios: " + episodios);
    }

    public String toCSV() {
        return "Temporada " + numero + "," + episodios;
    }
}
