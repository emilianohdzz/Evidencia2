package Evidencia2.src;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);

        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));
        biblioteca.agregarLibro(new Libro("Pedro Páramo", "Juan Rulfo", 1955));

        biblioteca.mostrarLibros();
    }
}