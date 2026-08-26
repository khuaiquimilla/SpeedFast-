package semana2;

public class Main {
    public static void main(String[] args) {

        // Objeto de la clase PedidoComida
        PedidoComida pedido1 = new PedidoComida(1, "Calle 123", 4.0);
        System.out.println("PedidoComida #00" + pedido1.getIdPedido());
        pedido1.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: " + pedido1.calcularTiempoEntrega() + " minutos");

        // Objeto de la clase PedidoEncomienda
        PedidoEncomienda pedido2 = new PedidoEncomienda(2, "Calle 456", 7.5);
        System.out.println("PedidoEncomienda #00" + pedido2.getIdPedido());
        pedido2.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: " + pedido2.calcularTiempoEntrega() + " minutos");

        // Objeto de la clase PedidoExpress
        PedidoExpress pedido3 = new PedidoExpress(3, "Calle 789", 6.0);
        System.out.println("PedidoExpress #00" + pedido3.getIdPedido());
        pedido3.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: " + pedido3.calcularTiempoEntrega() + " minutos");

    }
}