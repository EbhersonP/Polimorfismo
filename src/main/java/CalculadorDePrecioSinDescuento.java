
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    
     private double descuento; // porcentaje de descuento

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total * (1 - descuento);
    }
}

public class CalculadorDePrecioSinDescuento implements CalculadorDePrecio {
    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}

public class CalculadorDePrecioPorCategoría implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoría(Categoría categoría) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0.0;
        for (Producto producto : categoria.getProductos()) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    
}
