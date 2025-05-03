package problema1;

public class Producto {
    private String nombre;
    private double precio;
    private double itbms;

    public Producto(String nombre, double precio, double itbms) {
        this.nombre = nombre;
        this.precio = precio;
        this.itbms = itbms;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getItbms() {
        return itbms;
    }

    public void setItbms(double itbms) {
        this.itbms = itbms;
    }

    public double calcularPrecioFinal(){
        return (precio * itbms) + precio;

    }
}
