package semana5;

import java.util.ArrayList;
import java.util.List;

public class ZonaDeCarga {

    // Almacena los pedidos pendientes usando una List
    private List<Pedido> pedidosPendientes;

    public ZonaDeCarga() {
        this.pedidosPendientes = new ArrayList<>();
        System.out.println("[Zona de carga inicializada]");
    }

    // Método sincronizado para agregar pedidos de forma segura
    public synchronized void agregarPedido(Pedido p) {
        pedidosPendientes.add(p);
        // Imprimimos el mensaje exacto que pide el ejemplo de salida
        System.out.println("Pedido #" + p.getId() + " agregado. Destino: " + p.getDireccionEntrega());
    }

    // Método sincronizado que controla la concurrencia para evitar el retiro doble
    public synchronized Pedido retirarPedido() {
        if (pedidosPendientes.isEmpty()) {
            return null; // Si ya no hay pedidos, retornamos vacío
        }

        // El método remove(0) saca el primer pedido de la lista y lo entrega
        return pedidosPendientes.remove(0);
    }

    // Método extra que nos servirá más adelante para saber si ya se entregó todo
    public synchronized boolean estaVacia() {
        return pedidosPendientes.isEmpty();
    }
}