package Evidencia2.src;

public class Biblioteca {
    private Libro[] libros;
    private int cantidad;

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        cantidad = 0;
    }

    public void agregarLibro(Libro libro) {
        if (cantidad < libros.length) {
            libros[cantidad] = libro;
            cantidad++;
        } else {
            System.out.println("La biblioteca está llena.");
        }
    }

    public void mostrarLibros() {
        System.out.println("=== Libros en la biblioteca ===");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + libros[i]);
        }
    }
}