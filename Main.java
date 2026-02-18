package PooLab.practica_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Catalogo miNetflix = new Catalogo();

        // --- CARGA INICIAL (Lo que ya teníamos) ---
        // Esto cumple con el requisito de "Crear al menos 3 objetos" del PDF
        miNetflix.agregarPelicula(new Pelicula("Shrek", "Andrew Adamson", 2001, "Animación", 90));
        miNetflix.agregarPelicula(new Pelicula("Toy Story", "John Lasseter", 1995, "Animación", 81));
        miNetflix.agregarPelicula(new Pelicula("Cars", "John Lasseter", 2006, "Animación", 117));
        miNetflix.agregarPelicula(new Pelicula("Megamente", "Tom McGrath", 2010, "Comedia", 95));

        int opcion = 0;

        // --- MENÚ INTERACTIVO ---
        do {
            System.out.println("\n=== MENÚ DE STREAMING ===");
            System.out.println("1. Ver Catálogo Completo");
            System.out.println("2. Buscar Película");
            System.out.println("3. Agregar Nueva Película"); // <--- ¡NUEVA OPCIÓN!
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // LIMPIEZA OBLIGATORIA DEL ENTER

            switch (opcion) {
                case 1:
                    System.out.println("\n--- LISTA COMPLETA ---");
                    System.out.println(miNetflix.getPeliculas());
                    break;

                case 2:
                    System.out.print("\n¿Qué película buscas?: ");
                    String tituloBuscar = entrada.nextLine();
                    miNetflix.buscarPeliculaPorTitulo(tituloBuscar);
                    break;

                case 3: // <--- AQUÍ USAMOS TU MÉTODO INTERACTIVAMENTE
                    System.out.println("\n--- AGREGANDO NUEVA PELÍCULA ---");

                    System.out.print("Título: ");
                    String titulo = entrada.nextLine();

                    System.out.print("Director: ");
                    String director = entrada.nextLine();

                    System.out.print("Año de Estreno: ");
                    int anio = entrada.nextInt();
                    entrada.nextLine(); // Limpieza después de leer número

                    System.out.print("Género: ");
                    String genero = entrada.nextLine();

                    System.out.print("Duración (minutos): ");
                    int duracion = entrada.nextInt();
                    entrada.nextLine(); // Limpieza final

                    // 1. Creamos la película con los datos que escribiste
                    Pelicula nuevaPeli = new Pelicula(titulo, director, anio, genero, duracion);

                    // 2. La guardamos en el catálogo usando el método que preguntaste
                    miNetflix.agregarPelicula(nuevaPeli);

                    System.out.println("¡Película agregada con éxito!");
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }
}