package semana3;

public class PedidoComida extends Pedido {

    //  Constructor

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    // Método anstracto

    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 15;
        int tiempoExtra = (int) ( 2* getDistanciaKm());
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
        System.out.println("CancelandoPedido Comida #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");
    }

}


