package Unidad3.Actividad1;



public class Libro {

    private String Titulo;
    private String Autor;
    private double Precio;

    public Libro(String titulo, String Autor, double Precio) {
        this.Titulo = titulo;
        this.Autor = Autor;
        this.Precio = Precio;
    }

    public String gettitulo() {
        return Titulo;

    }

    public void settutulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setautor(String autor) {
        this.Autor = autor;
    }

    public double getprecio() {
        return Precio;
    }

    public void setprecio(double precio) {
        this.Precio = precio;
    }

    @Override
    public String toString() {
        return String .format("Libro{titulo='%s', autor='%s', precio=%.2f}", Titulo, Autor, Precio);
    }
        

}
