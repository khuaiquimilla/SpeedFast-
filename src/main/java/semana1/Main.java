package semana1;

public class Main {
    public static void main(String[] args) {

        // 1. Instancia de un objeto de la clase PedidoComida
        PedidoComida pedidoComida = new PedidoComida(1, "Av. Grecia 123", "Comida");

        // Probamos el método sobrescrito
        pedidoComida.asignarRepartidor();
        System.out.println("-----------------------------------");

        // Probamos el método sobrecargado
        pedidoComida.asignarRepartidor("Juan Pérez");
        System.out.println("===================================");

        // 2. Instancia de un objeto de la clase PedidoEncomienda
        PedidoEncomienda pedidoEncomienda = new PedidoEncomienda(2, "Calle 456", "Encomienda");

        // Probamos el método sobrescrito
        pedidoEncomienda.asignarRepartidor();
        System.out.println("-----------------------------------");

        // Probamos el método sobrecargado
        pedidoEncomienda.asignarRepartidor("Pedro Picapiedra");
        System.out.println("===================================");

        // 3. Instancia de un objeto de la clase PedidoExpress
        PedidoExpress pedidoExpress = new PedidoExpress(3, "Avenida 789", "Express");

        // Probamos el método sobrescrito
        pedidoExpress.asignarRepartidor();
        System.out.println("-----------------------------------");

        // Probamos el método sobrecargado
        pedidoExpress.asignarRepartidor("Chino Moreno");
        System.out.println("-----------------------------------");
    }
}