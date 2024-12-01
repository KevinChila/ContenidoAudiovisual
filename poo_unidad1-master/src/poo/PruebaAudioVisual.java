package poo;

import uni1a.controller.Controlador;
import uni1a.view.Vista;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        controlador.ejecutar();
    }
}