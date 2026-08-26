package semana3;

public abstract class Pedido implements Despachable, Cancelable{

    // Atributos comunes
    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    // Constructor
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    // Getters

    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }

    // Metodo Concreto

    public void mostrarResumen() {
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    // Método abstracto

    public abstract int calcularTiempoEntrega();

    // Método para asignar un repartidor
    public void asignarRepartidor() {
        System.out.println("Repartidor asignado automáticamente.");
    }

    // Implementación de interfaces Despachable y Cancelable

    @Override
    public void despachar() {
        System.out.println("Pedido despachado correctamente.");
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido #" + idPedido + "...");
        System.out.println("→ Pedido cancelado correctamente.");
    }

}

