package semana2;

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

}
