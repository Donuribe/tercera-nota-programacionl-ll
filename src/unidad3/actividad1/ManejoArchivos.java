package unidad3.actividad1;

import java.io.*;
import java.util.List;

public class ManejoArchivos {
    private String nombreArchivo;

    public ManejoArchivos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarLibro(List<Libro> libros) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {

            for (Libro libro : libros) {
                // Formato: título|autor|precio
                String linea = libro.getTitulo() + "|" +
                        libro.getAutor() + "|" +
                        libro.getPrecio();
                escritor.write(linea);
                escritor.newLine();
            }

            System.out.println("\n✓ Libros guardados exitosamente en: " + nombreArchivo);

        } catch (IOException e) {
            System.err.println("\n✗ Error al guardar los libros: " + e.getMessage());
        } finally {
            System.out.println("Operación de guardado finalizada.");
        }
    }

    // Método para leer libros desde archivo
    public void leerLibros() {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {

            System.out.println("\n========== LIBROS DESDE ARCHIVO ==========");
            System.out.println("-".repeat(100));

            String linea;
            int contador = 0;

            while ((linea = lector.readLine()) != null) {
                // Dividir la línea por el separador |
                String[] partes = linea.split("\\|");

                if (partes.length == 3) {
                    String titulo = partes[0];
                    String autor = partes[1];
                    double precio = Double.parseDouble(partes[2]);

                    Libro libro = new Libro(titulo, autor, precio);
                    System.out.println(libro);
                    contador++;
                }
            }

            System.out.println("-".repeat(100));
            System.out.println("Total de libros leídos: " + contador);

        } catch (FileNotFoundException e) {
            System.err.println("\n✗ Archivo no encontrado: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("\n✗ Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("\n✗ Error en el formato del precio: " + e.getMessage());
        } finally {
            System.out.println("Operación de lectura finalizada.");
        }
    }

}
