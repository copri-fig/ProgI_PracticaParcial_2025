package problema3;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Libro libro1;
    private Libro libro2;

    public Biblioteca(String nombre, String direccion, Libro libro1, Libro libro2) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libro1 = libro1;
        this.libro2 = libro2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Libro getLibro1() {
        return libro1;
    }

    public void setLibro1(Libro libro1) {
        this.libro1 = libro1;
    }

    public Libro getLibro2() {
        return libro2;
    }

    public void setLibro2(Libro libro2) {
        this.libro2 = libro2;
    }

    public void mostrarInformacion() {
        System.out.println("==========");
        System.out.println("===== Información de la Biblioteca =====");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("===== Libros =====");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("==========");
    }
}
