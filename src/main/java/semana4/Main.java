package semana4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciamos los pedidos (2 por cada repartidor)
        Pedido p1 = new PedidoComida(101, "Av. Grecia 123", 4.0);
        Pedido p2 = new PedidoComida(104, "Pasaje Las Rosas 22", 1.5);

        Pedido p3 = new PedidoExpress(102, "Av. Providencia 111", 3.0);
        Pedido p4 = new PedidoExpress(105, "Calle Larga 89", 5.5);

        Pedido p5 = new PedidoEncomienda(103, "Av. Matta 789", 5.0);
        Pedido p6 = new PedidoEncomienda(106, "Plaza Central 1", 7.2);

        // 2. Se crean las listas de asignación para cada repartidor
        List<Pedido> listaCamila = Arrays.asList(p1, p2);
        List<Pedido> listaLuis = Arrays.asList(p3, p4);
        List<Pedido> listaPedro = Arrays.asList(p5, p6);

        // 3. Se instancian los 3 repartidores solicitados
        Repartidor rep1 = new Repartidor("Camila", listaCamila);
        Repartidor rep2 = new Repartidor("Luis", listaLuis);
        Repartidor rep3 = new Repartidor("Pedro", listaPedro);

        // 4. Se inicia la ejecución concurrente con ExecutorService
        System.out.println("=== Iniciando jornada de despachos SpeedFast ===\n");
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(rep1);
        executor.execute(rep2);
        executor.execute(rep3);

        // 5. Se apaga el executor y esperamos a que todos los hilos terminen
        executor.shutdown();
        try {
            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("\n=== Todos los repartidores han terminado sus entregas ===");
    }
}