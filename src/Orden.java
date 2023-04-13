import java.util.ArrayList;
import java.util.List;

public class Orden {
    private double valor;
    private Cliente cliente;
    private List<Productos> productos;

    public Orden(double valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        if(!productos.contains(producto)) {
            productos.add(producto);
        }
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public double getValor() {
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
