package semana2;

public abstract class Pedido {

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

}
