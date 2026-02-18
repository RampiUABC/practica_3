package PooLab.practica_3;

public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion; // En minutos

    public Pelicula(String titulo, String director, int anio, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anio;
        this.genero = genero;
        this.duracion = duracion;
    }

    public Boolean esClasica() {

        int antiguedad = 2026 - this.anioEstreno; // se calcula restando

        if (antiguedad > 25) {
            return true;
        } else {
            return false;
        }
    }

    public String getInformacion() {
        return "Título: " + this.titulo + " | Director: " + this.director + " | Año: " + this.anioEstreno
                + " | Género: " + this.genero + " | Clásica: " + this.esClasica();
    }

    @Override
    public String toString() {
        return this.titulo + " (" + this.anioEstreno + ")";
    }
}
