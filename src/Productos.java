public class Productos {
    private String fabricante;
    private String nombre;
    private double precio;

    public Productos(String fabricante, String nombre, double precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
