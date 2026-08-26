package semana2;

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

}
