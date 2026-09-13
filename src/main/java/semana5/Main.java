package semana5;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciamos la Zona de Carga (el recurso compartido)
        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        // 2. Agregamos al menos 5 pedidos al sistema
        zonaDeCarga.agregarPedido(new Pedido(1, "Santiago Centro"));
        zonaDeCarga.agregarPedido(new Pedido(2, "Providencia"));
        zonaDeCarga.agregarPedido(new Pedido(3, "Ñuñoa"));
        zonaDeCarga.agregarPedido(new Pedido(4, "Recoleta"));
        zonaDeCarga.agregarPedido(new Pedido(5, "Las Condes"));

        System.out.println("--------------------------------------------------");

        // 3. Creamos los hilos de los repartidores (implementan Runnable)
        Thread hiloJuan = new Thread(new Repartidor("Juan", zonaDeCarga));
        Thread hiloCamila = new Thread(new Repartidor("Camila", zonaDeCarga));
        Thread hiloPedro = new Thread(new Repartidor("Pedro", zonaDeCarga));

        // 4. Iniciamos los 3 hilos para que trabajen en paralelo
        hiloJuan.start();
        hiloCamila.start();
        hiloPedro.start();

        // 5. Esperamos a que todos los hilos terminen su ejecución usando join()
        try {
            hiloJuan.join();
            hiloCamila.join();
            hiloPedro.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal fue interrumpido.");
            Thread.currentThread().interrupt();
        }

        // 6. Mensaje final
        System.out.println("--------------------------------------------------");
        if (zonaDeCarga.estaVacia()) {
            System.out.println("[Zona de carga vacía]");
            System.out.println("Todos los pedidos han sido entregados correctamente.");
        }
    }
}