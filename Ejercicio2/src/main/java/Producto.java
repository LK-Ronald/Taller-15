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


}
