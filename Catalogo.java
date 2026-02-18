
package PooLab.practica_3;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    public Catalogo() {
        this.peliculas = new ArrayList<>();
    }

    // Añade una película
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public String getPeliculas() {
        String resultado = "";
        for (Pelicula p : this.peliculas) {
            resultado += p.getInformacion() + "\n";
        }
        return resultado;
    }

    // Busca por titulo y muestra informacion
    public void buscarPeliculaPorTitulo(String titulo) {
        boolean encontrada = false;

        // Recorremos la lista
        for (Pelicula p : this.peliculas) {

            String infoCompleta = p.getInformacion();

            if (infoCompleta.toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("--- Película Encontrada ---");
                System.out.println(p.getInformacion()); // Muestra su informacion
                encontrada = true;
            }
        }

        if (encontrada == false) {
            System.out.println("No se encontró ninguna película con la palabra: " + titulo);
        }
    }

    @Override
    public String toString() {
        return "Catálogo con " + this.peliculas.size() + " películas.";
    }
}