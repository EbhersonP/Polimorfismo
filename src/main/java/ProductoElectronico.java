/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class ProductoElectronico extends Producto {
    
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantía) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantía;
    }

    @Override
    public String getDetalles() {
        return nombre + " - Electrónico con garantía de " + garantia + " meses.";
    }
    
}
