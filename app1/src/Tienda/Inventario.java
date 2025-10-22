package Tienda;
import java.util.ArrayList;



public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario(){
        productos= new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto) {
        if (producto != null && producto.getCodigo() != null && !producto.getCodigo().isEmpty()) {
            productos.add(producto);
            return true;
        }
        return false;
    }
    
    public ArrayList<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(productos);
    }
    
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
    
    public int obtenerCantidadProductos() {
        return productos.size();
    }
    
    public boolean estaVacio() {
        return productos.isEmpty();
    }
}
