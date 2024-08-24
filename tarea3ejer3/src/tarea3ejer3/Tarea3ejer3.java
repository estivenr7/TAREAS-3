package tarea3ejer3;

/**
 *
 * @author Estiven Ramirez
 */
 abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void agregar_cantidad(int cantidad);
    public abstract void vender(int cantidad);

    // Método concreto
    public void consultar_inventario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en inventario: " + cantidad);
    }

    // Métodos getter y setter
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

 class Electronico extends Producto {

    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void agregar_cantidad(int cantidad) {
        // Agrega la cantidad al inventario
        int nuevaCantidad = getCantidad() + cantidad;
        setCantidad(nuevaCantidad);
        System.out.println("Se han agregado " + cantidad + " unidades al inventario.");
    }

    @Override
    public void vender(int cantidad) {
        // Verifica si hay suficiente cantidad para vender
        if (cantidad <= getCantidad()) {
            int nuevaCantidad = getCantidad() - cantidad;
            setCantidad(nuevaCantidad);
            System.out.println("Se han vendido " + cantidad + " unidades.");
        } else {
            System.out.println("No hay suficiente inventario para realizar la venta.");
        }
    }
}

public class Tarea3ejer3 {
 public static void main(String[] args) {
    
        // Crear una instancia de Electronico
        Electronico e = new Electronico("Televisor", 1500.00, 1);
        
        // Consultar el inventario
        e.consultar_inventario();
        
        // Agregar más cantidad
        e.agregar_cantidad(10);
        
        // Consultar el inventario nuevamente
        e.consultar_inventario();
        
        // Vender algunos productos
        e.vender(1);
        
        // Consultar el inventario después de la venta
        e.consultar_inventario();
        
        // Intentar vender más productos de los disponibles
        e.vender(1);
    }
}

    
    

