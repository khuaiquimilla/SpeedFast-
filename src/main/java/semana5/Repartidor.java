package semana5;

public class Repartidor implements Runnable {

    // Atributos
    private String nombre;
    private ZonaDeCarga zonaDeCarga; // Referencia al recurso compartido

    // Constructor
    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    // El método run() es el "motor" del hilo. Todo lo que esté aquí adentro
    // se ejecutará de forma concurrente (en paralelo).
    @Override
    public void run() {
        Pedido pedidoActual;

        // El repartidor intentará retirar un pedido. Si la zona de carga le devuelve un pedido, entra al ciclo a entregarlo.
        while ((pedidoActual = zonaDeCarga.retirarPedido()) != null) {
            try {
                // 1. Mensaje de retiro
                System.out.println("[Repartidor - " + nombre + "] Retirando pedido #" + pedidoActual.getId() + "...");

                // 2. Cambia estado a EN_REPARTO y muestra mensaje
                pedidoActual.setEstado(EstadoPedido.EN_REPARTO);
                System.out.println("[Repartidor - " + nombre + "] Estado: " + pedidoActual.getEstado());

                // 3. Simula la entrega
                System.out.println("[Repartidor - " + nombre + "] Entregando pedido #" + pedidoActual.getId() + "...");
                Thread.sleep(2000); // Duerme el hilo por 2 segundos simulando el viaje

                // 4. Cambia estado a ENTREGADO y muestra mensaje fina
                pedidoActual.setEstado(EstadoPedido.ENTREGADO);
                System.out.println("[Repartidor - " + nombre + "] Estado: " + pedidoActual.getEstado());

            } catch (InterruptedException e) {
                // Manejo de seguridad en caso de que el sistema interrumpa el hilo forzosamente
                System.out.println("El trayecto de " + nombre + " fue interrumpido.");
                Thread.currentThread().interrupt();
            }
        }
    }
}