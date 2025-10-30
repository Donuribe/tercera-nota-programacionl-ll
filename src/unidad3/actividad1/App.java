package unidad3.actividad1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE GESTIÓN DE LIBRERÍA    ║");
        System.out.println("╚════════════════════════════════════════╝\n");

        List<Libro> libros = new ArrayList<>();
        System.out.println("-".repeat(100));
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 25.99));
        libros.add(new Libro("To Kill a Mockingbird", "Harper Lee", 18.50));
        libros.add(new Libro("The Great Gatsby", "F. Scott Fitzgerald", 15.75));

        System.out.println("libros creados ");
        for (Libro libro : libros) {
            System.out.println("|" + libro);
        }
        System.out.println("-".repeat(100));
        ManejoArchivos manejoArchivos = new ManejoArchivos("libros.txt");

        System.out.println("\nGuardando libros en el archivo...");
        manejoArchivos.guardarLibro(libros);

        System.out.println("\nLeyendo libros desde el archivo...");
        manejoArchivos.leerLibros();

        System.out.println("programa lsito ");
    }
}
