package semana5;

public class Pedido {

    // Atributos
    private int id;
    private String direccionEntrega;
    private EstadoPedido estado; // Usamos el enum que acabamos de crear

    // Constructor
    public Pedido(int id, String direccionEntrega) {
        this.id = id;
        this.direccionEntrega = direccionEntrega;
        this.estado = EstadoPedido.PENDIENTE; // Todo pedido nace como PENDIENTE
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    // Método setter
    public void setEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pedido #" + id + " Destino: " + direccionEntrega;
    }
}