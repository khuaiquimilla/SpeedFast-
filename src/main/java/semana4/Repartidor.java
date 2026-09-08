package semana4;

import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidosAsignados;
    private Random random = new Random();

    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        for (Pedido pedido : pedidosAsignados) {
            try {
                // Imprime el mensaje inicial usando el nombre de la clase hija.
                System.out.println("[Repartidor: " + nombre + "] Entregando " + pedido.getClass().getSimpleName() + " #" + pedido.getIdPedido() + "...");

                // Simula el tiempo de viaje con un retraso aleatorio entre 1 y 4 segundos
                int tiempoEntrega = 1000 + random.nextInt(3000);
                Thread.sleep(tiempoEntrega);

                // Imprime el mensaje de finalización
                System.out.println("[Repartidor: " + nombre + "] Pedido #" + pedido.getIdPedido() + " entregado.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("[Repartidor: " + nombre + "] El trayecto fue interrumpido.");
            }
        }
    }
}