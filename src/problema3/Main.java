package problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tituloL1, tituloL2, autor1, autor2, nombreBiblioteca, direccionBiblioteca;

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Datos de Biblioteca=====");
        System.out.println("Ingrese el nombre de la biblioteca: ");
        nombreBiblioteca = sc.nextLine();
        System.out.println("Ingrese el direccion de la biblioteca: ");
        direccionBiblioteca = sc.nextLine();
        System.out.println("===== Datos de Libro=====");
        System.out.println("Ingrese el titulo del libro: ");
        tituloL1 = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        autor1 = sc.nextLine();
        System.out.println("===== Datos de Libro=====");
        System.out.println("Ingrese el titulo del libro: ");
        tituloL2 = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        autor2 = sc.nextLine();

        Libro libro1 = new Libro(tituloL1,autor1);
        Libro libro2 = new Libro(tituloL2,autor2);

        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca, libro1, libro2);

        biblioteca.mostrarInformacion();

    }
}
