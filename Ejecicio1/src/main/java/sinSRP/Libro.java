package sinSRP;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + this.titulo
                + " Autor: " + this.autor
                + " Precio: $" + this.precio);
    }

    public void informeLibro() {
        System.out.println("Informe del libro: " + this.titulo);
    }

    public void guardarLibro() {
        System.out.println("Guardando libro " + this.titulo + " en la base de datos...");
    }

}
