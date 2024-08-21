/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventario_principal;

/**
 *
 * @author ebers
 */
public class Inventario_Principal {

    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Creación de productos
        Producto producto1 = new ProductoElectrónico("Laptop", 1000, 5, proveedor1, 24);
        Producto producto2 = new ProductoAlimenticio("Leche", 1.5, 100, proveedor2, "2024-12-31");

        // Asignar productos a proveedores
        proveedor1.agregarProducto(producto1);
        proveedor2.agregarProducto(producto2);

        // Creación de categorías
        Categoría categoríaElectrónica = new Categoría("Electrónica");
        Categoría categoríaAlimentos = new Categoría("Alimentos");

        // Asignar productos a categorías
        categoríaElectrónica.agregarProducto(producto1);
        categoríaAlimentos.agregarProducto(producto2);

        // Lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        // Gestor de inventario
        CalculadorDePrecio calculadorDePrecio = new CalculadorDePrecioSinDescuento();
        GestorDeInventario gestorDeInventario = new GestorDeInventario(productos, calculadorDePrecio);

        // Calcular precio total del inventario
        double precioTotal = gestorDeInventario.calcularPrecioTotalInventario();
        System.out.println("Precio total del inventario: " + precioTotal);

        // Aplicar descuento y recalcular precio
        Descuento descuento = new Descuento(0.1); // 10% de descuento
        GestorDeDescuentos gestorDeDescuentos = new GestorDeDescuentos();
        double precioConDescuento = gestorDeDescuentos.aplicarDescuentoAProductos(productos
                }
}
