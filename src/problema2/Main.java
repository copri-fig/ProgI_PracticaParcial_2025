package problema2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, nacionalidad, titulo;
        int anioPublicacion;

        Scanner sc = new Scanner(System.in);


        System.out.println("===== Datos del Autor =====");
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la nacionalidad: ");
        nacionalidad = sc.nextLine();
        System.out.println("===== Datos del Libro =====");
        System.out.println("Ingrese el titulo del libro: ");
        titulo = sc.nextLine();
        System.out.println("Ingrese el año de publicacion: ");
        anioPublicacion = sc.nextInt();

        Autor autor = new Autor(nombre, nacionalidad);
        Libro libro = new Libro(titulo, anioPublicacion, autor);

        libro.mostrarDatos();
    }
}
