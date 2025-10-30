package unidad3.actividad1;



public class Libro {

    private String Titulo;
    private String Autor;
    private double Precio;

    public Libro(String titulo, String Autor, double Precio) {
        this.Titulo = titulo;
        this.Autor = Autor;
        this.Precio = Precio;
    }

    public String getTitulo() {
        return Titulo;

    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    @Override
    public String toString() {
        return String .format("titulo:'%-30s', autor:'%-30s', precio:%.2f}", Titulo, Autor, Precio);
    }
        

}
