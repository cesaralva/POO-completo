import java.util.Date;

public class OrdenCompra {
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Productos[] productos = new Productos[4];
    int identificador;


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public int getIdentificador() {
        return identificador;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrdenCompra addProducto(Productos productos) {
        if (identificador < this.productos.length) {
            this.productos[identificador++] = productos;
        }
        return this;
    }

    public int getGranTotal() {
        int granTotal = 0;
        for (Productos p : productos) {
            if (p != null) {
                granTotal += p.getPrecio();
            }
        }
        return granTotal;
    }


}
