package semana3;

import java.util.ArrayList;

public class ControladorDeEnvios implements Rastreable {

    // Lista para guardar el historial de entregas
    private ArrayList<String> historial;

    // Constructor
    public ControladorDeEnvios() {
        this.historial = new ArrayList<>();
    }

    // Método  para agregar un registro a la lista
    public void agregarAlHistorial(String registro) {
        historial.add(registro);
    }

    // Implementación del método de la interfaz semana3.Rastreable
    @Override
    public void verHistorial() {
        System.out.println("Historial:");
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}