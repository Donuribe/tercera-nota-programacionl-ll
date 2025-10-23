package Unidad2.Actividad3;

public class Producto {
    
    private String Nombre;
    private String Codigo;
    private double Precio;

    public Producto(String Nombre, String Codigo, double Precio){
        this. Nombre= Nombre;
        this. Precio=Precio;
        this. Codigo= Codigo;
    }

    public String getNombre(){
        return Nombre ;
    }

    public void setNombre (String Nombre ){
        this.Nombre = Nombre ;
    }
    
    public String getCodigo(){
        return Codigo;
    }

    public void setCodigo(String Codigo ){
        this.Codigo= Codigo;
    }

    public double getPrecio(){
        return Precio;
    }
    
    public void setPrecio(double Precio){
        this.Precio=Precio;
    }

    @Override
    public String toString() {
        return String.format("Código: %-10s | Nombre: %-20s | Precio: $%.2f", Codigo, Nombre, Precio);
    }

}
