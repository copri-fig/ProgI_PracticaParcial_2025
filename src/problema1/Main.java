package problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        double precio;
        double itbms;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Ingrese el itbms: ");
        itbms = sc.nextDouble();


        Producto producto = new Producto(nombre, precio, itbms);

        System.out.println("===== Datos de compra =====");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Subtotal: $" + producto.getPrecio());
        System.out.printf("Precio Final: $%.2f" , producto.calcularPrecioFinal());
    }
}
