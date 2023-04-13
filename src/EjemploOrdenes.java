import java.util.Date;
import java.util.List;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Productos producto1 = new Productos("San Fernando", "Pollo", 5.4);
        Productos producto2 = new Productos("Segoviana", "Salchicha Aumada", 2.2);
        Productos producto3 = new Productos("Laive", "queso", 1.1);
        Productos producto4 = new Productos("Rossoto", "Carne", 4.5);


        Cliente cliente1 = new Cliente("Cesar", "Alva");
        Cliente cliente2 = new Cliente("Cesar", "Alva");
        Cliente cliente3 = new Cliente("Cesar", "Alva");


        OrdenCompra orden1 = new OrdenCompra("Primera Orden");

        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra("Segunda Orden");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto1);
        orden2.addProducto(producto2);
        orden2.addProducto(producto3);
        orden2.addProducto(producto4);

        OrdenCompra orden3 = new OrdenCompra("Tercera Orden");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto1);
        orden3.addProducto(producto2);
        orden3.addProducto(producto3);
        orden3.addProducto(producto4);

        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);


        public static void imprimirOrden (Orden orden){
            System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
            System.out.println("Valor: " + orden.getValor());
            System.out.println("Productos:");

            List<Productos> productos = orden.getProductos();
            double total = 0.0;

            for (Productos producto : productos) {
                total += producto.getPrecio();
                System.out.println(producto.getFabricante() + " " + producto.getNombre() + " " + producto.getPrecio());
            }

            System.out.println("Total: " + total);
            System.out.println();
        }
    }
}
}

