public class GenerarRecibos {

    public void generarRecibo(Producto producto, CalcularTotal calcular) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Total a pagar: " + calcular.totalPagar(producto.getPrecio(), producto.getCantidad()));
    }
}
