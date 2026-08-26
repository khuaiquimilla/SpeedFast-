package semana3;

public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    // Método abstracto

    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 20;
        int tiempoExtra = (int) ( 1.5 * getDistanciaKm());
        return tiempoBase + tiempoExtra;
    }

    // Método sobrescrito
    @Override
    public void asignarRepartidor() {
        System.out.println("Repartidor asignado: Búsqueda automática");
    }

    // Método sobrecargado
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    // Implementación de la interfaz Cancelable
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido Encomienda #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");

    }
}


