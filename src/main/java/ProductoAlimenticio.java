/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class ProductoAlimenticio extends Producto{
    
    private final String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return nombre + " - Alimenticio con fecha de caducidad: " + fechaDeCaducidad;
    }
    
    
}
