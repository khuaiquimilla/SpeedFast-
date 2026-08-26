package semana1;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Método sobrescrito

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando repartidor con mochila térmica... OK");
    }

    // Método sobrecargado

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando repartidor con mochila térmica... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

}
