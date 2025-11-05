public class Producto {
    private String nombre;
    private double precio;
    private boolean stock;
    private int cantidad;

    public Producto(String nombre, double precio, boolean stock, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public boolean isStock() {
        return this.stock;
    }

    public int getCantidad() {
        return this.cantidad;
    }


    public double totalPagar(double precio, int cantidad) {
        double total = precio * cantidad;
        return total;
    }

    public void generarRecibo(Producto producto) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Total a pagar: " + totalPagar(producto.getPrecio(), producto.getCantidad()));
    }

    public void imprimirRecibo() {
        System.out.println("Imprimiento recibo...");
    }

}
