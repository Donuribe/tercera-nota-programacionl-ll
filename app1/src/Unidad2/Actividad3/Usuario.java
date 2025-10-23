package Unidad2.Actividad3;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private Scanner scanner;
    private Inventario gestor;

    public Usuario() {
        scanner = new Scanner(System.in);
        gestor = new Inventario();
    }

    public void ejecutar() {
        int opcion;

        do {
            MostrarMenu();
            opcion = LeerOpcion();
            procesarOpcion(opcion);

            if (opcion != 5) {
                pausar();
            }
        } while (opcion != 5);
        cerrar();
    }

    private void MostrarMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN DE INVENTARIO    ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar todos los productos");
        System.out.println("3. Buscar producto por código");
        System.out.println("4. Salir");
        System.out.println("-".repeat(42));
    }

    private int LeerOpcion() {
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarProducto();
                break;
            case 2:
                mostrarProductos();
                break;
            case 3:
                buscarProducto();
                break;
            case 4:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private void agregarProducto() {
        System.out.println("agrege el codigo del producto:");
        String codigo = scanner.nextLine();

        System.out.println("agrege el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("agrege el precio del producto:");
        double precio = scanner.nextDouble();

        Producto producto = new Producto(codigo, nombre, precio);

        if (gestor.agregarProducto(producto)) {
            System.out.println("\n✓ Producto agregado exitosamente!");
        } else {
            System.out.println("\n✗ Error al agregar el producto.");
        }
    }

    private void mostrarProductos() {
        if (gestor.estaVacio()) {
            System.out.println("\n⚠ No hay productos en el inventario.");
            return;
        }

        System.out.println("\n========== INVENTARIO COMPLETO ==========");
        System.out.println("-".repeat(70));

        ArrayList<Producto> productos = gestor.obtenerTodosLosProductos();
        for (Producto p : productos) {
            System.out.println(p);
        }

        System.out.println("-".repeat(70));
        System.out.println("Total de productos: " + gestor.obtenerCantidadProductos());
    }

    private void buscarProducto() {
        System.out.print("\nIngrese el código a buscar: ");
        String codigo = scanner.nextLine();

        Producto producto = gestor.buscarPorCodigo(codigo);

        if (producto != null) {
            System.out.println("\n✓ Producto encontrado:");
            System.out.println("-".repeat(70));
            System.out.println(producto);
            System.out.println("-".repeat(70));
        } else {
            System.out.println("\n✗ No se encontró ningún producto con el código: " + codigo);
        }
    }

    private void pausar() {
        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
    }

    private void cerrar() {
        scanner.close();
    }
}
