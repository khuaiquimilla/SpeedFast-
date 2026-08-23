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
}
