package semana3;

public class PedidoExpress extends Pedido{

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    // Método abstracto

    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 10;
        if (getDistanciaKm()> 5) {
            tiempoBase += 5;
        }
        return tiempoBase;
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
        System.out.println("Cancelando Pedido Express #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");
    }

}
