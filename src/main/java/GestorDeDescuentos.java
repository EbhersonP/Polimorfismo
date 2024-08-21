
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class GestorDeDescuentos {
    public double aplicarDescuentoAProductos(List<Producto> productos, Descuento descuento) {
        double total = 0.0;
        for (Producto producto : productos) {
            total += descuento.aplicarDescuento(producto.getPrecio()) * producto.getCantidad();
        }
        return total;
    }
    
}
