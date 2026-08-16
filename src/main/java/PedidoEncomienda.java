public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Método sobrescrito

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando repartidor con validación de peso y embalaje... OK");
    }

    // Método sobrecargado

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando repartidor con validación de peso y embalaje... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
