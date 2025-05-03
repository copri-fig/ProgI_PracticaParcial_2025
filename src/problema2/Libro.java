package problema2;

public class Libro {
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String titulo, int anioPublicacion, Autor autor) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDatos(){
        System.out.println("==========");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Año de publicacion: " + this.anioPublicacion);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("==========");

    }
}
