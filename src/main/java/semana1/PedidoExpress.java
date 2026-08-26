package semana1;

public class PedidoExpress extends Pedido{

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Método sobrescrito

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado");
    }

    // Método sobrecargado

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando repartidor con disponibilidad inmediata... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
