package es.laarboleda.tiendaLibros;

public class Libro {

    //ATRIBUTOS
    private String titulo;
    private String autor;
    private float precio;

    //CONSTRUCTOR
    public Libro(String titulo, String autor, float precio) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    //GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}