package biblio;
import java.util.Scanner;
/**
 *
 * @author Estiven Ramirez
 */
 class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // El libro está disponible al inicio
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto y está disponible.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible.");
        }
    }

    // Método para consultar la disponibilidad
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' esta disponible para prestamo.");
        } else {
            System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
        }
    }

    // Métodos getters para obtener información sobre el libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
public class Biblio {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Crear alguno1s libros
        Libro libro1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // Menú de opciones
        while (true) {
            System.out.println("\n--- Gestion de Biblioteca ---");
            System.out.println("1. Consultar disponibilidad de un libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Libros disponibles");
                    System.out.println("Cien anios de soledad Gabriel Garcia Marquez");
                      System.out.println("Don Quijote de la Mancha Miguel de Cervantes");
                    System.out.println("Ingrese el titulo del libro a consultar: ");
                    String tituloConsulta = scanner.nextLine();
                    if (libro1.getTitulo().equalsIgnoreCase(tituloConsulta)) {
                        libro1.consultarDisponibilidad();
                    } else if (libro2.getTitulo().equalsIgnoreCase(tituloConsulta)) {
                        libro2.consultarDisponibilidad();
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el titulo del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    if (libro1.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                        libro1.prestar();
                    } else if (libro2.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                        libro2.prestar();
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el titulo del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    if (libro1.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                        libro1.devolver();
                    } else if (libro2.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                        libro2.devolver();
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}   
    
    

