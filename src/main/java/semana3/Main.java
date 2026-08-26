package semana3;

public class Main {
    public static void main(String[] args) {

        ControladorDeEnvios controlador = new ControladorDeEnvios();

        System.out.println("========== CASOS NORMALES (ENTREGADOS) ==========\n");

        // 1. .Pedido Comida (Normal)
        System.out.println("[Pedido Comida]");
        PedidoComida comida1 = new PedidoComida(101, "Calle 123", 4.0);
        System.out.println("Pedido #" + comida1.getIdPedido());
        comida1.mostrarResumen();
        comida1.asignarRepartidor("Luis Díaz");
        System.out.println("Tiempo estimado: " + comida1.calcularTiempoEntrega() + " minutos");
        comida1.despachar();
        controlador.agregarAlHistorial("PedidoComida #" + comida1.getIdPedido() + " – entregado por\nLuis Díaz");
        System.out.println();

        // 2. .Pedido Encomienda (Normal - Exacto al ejemplo)
        System.out.println("[Pedido Encomienda]");
        PedidoEncomienda encomienda1 = new PedidoEncomienda(102, "Av. Santa Rosa 567", 7.0);
        System.out.println("Pedido #" + encomienda1.getIdPedido());
        encomienda1.mostrarResumen();
        encomienda1.asignarRepartidor("Daniela Tapia");
        System.out.println("Tiempo estimado: " + encomienda1.calcularTiempoEntrega() + " minutos");
        encomienda1.despachar();
        controlador.agregarAlHistorial("PedidoEncomienda #" + encomienda1.getIdPedido() + " – entregado por\nDaniela Tapia");
        System.out.println();

        // 3. Pedido Express (Normal)
        System.out.println("[Pedido Express]");
        PedidoExpress express1 = new PedidoExpress(103, "Av. Providencia 890", 4.0);
        System.out.println("Pedido #" + express1.getIdPedido());
        express1.mostrarResumen();
        express1.asignarRepartidor("Carlos Soto");
        System.out.println("Tiempo estimado: " + express1.calcularTiempoEntrega() + " minutos");
        express1.despachar();
        controlador.agregarAlHistorial("PedidoExpress #" + express1.getIdPedido() + " – entregado por\nCarlos Soto");
        System.out.println();

        System.out.println("========== CASOS CANCELADOS ==========\n");

        // 4. Pedido Comida (Cancelado)
        PedidoComida comidaCancelada = new PedidoComida(104, "Pasaje Las Flores 11", 2.0);
        comidaCancelada.cancelar();
        System.out.println();

        // 5. Pedido Encomienda (Cancelado)
        PedidoEncomienda encomiendaCancelada = new PedidoEncomienda(105, "Av. Matta 432", 12.0);
        encomiendaCancelada.cancelar();
        System.out.println();

        // 6. Pedido Express (Cancelado - Exacto al ejemplo)
        PedidoExpress expressCancelado = new PedidoExpress(106, "Avenida 789", 3.0);
        expressCancelado.cancelar();
        System.out.println();

        System.out.println("========== HISTORIAL DE ENTREGAS ==========\n");

        // Muestra el historial registrado
        controlador.verHistorial();
    }
}