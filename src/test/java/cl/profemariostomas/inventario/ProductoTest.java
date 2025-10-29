/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cl.profemariostomas.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luk0s
 */
public class ProductoTest {
    
    private Producto productoBase;
    
    public ProductoTest() {
        this.productoBase = new Producto("pan", 100, 1);
    }

    @Test
    public void testGetNombre() {
        Producto instance = this.productoBase;
        String expResult = "pan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        String nombre = "Fanta";
        Producto instance = this.productoBase;
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetPrecio() {
        Producto instance = this.productoBase;
        Integer expResult = 100;
        Integer result = instance.getPrecio();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPrecio() {
        Integer precio = 999;
        Producto instance = this.productoBase;
        instance.setPrecio(precio);
        assertEquals(precio, instance.getPrecio());
    }

    @Test
    public void testGetStock() {
        Producto instance = this.productoBase;
        Integer expResult = 1;
        Integer result = instance.getStock();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStock() {
        Integer stock = 99;
        Producto instance = this.productoBase;
        instance.setStock(stock);
        assertEquals(stock, instance.getStock());
    }

    @Test
    public void testAumentarStock() {
        Integer cantidad = 100;
        Producto instance = this.productoBase;
        instance.aumentarStock(cantidad);
        assertEquals(101, instance.getStock());
    }
    
    @Test
    public void testAumentarStockError() {
        Integer cantidad = -100;
        Producto instance = this.productoBase;
        assertThrows(IllegalArgumentException.class, () -> instance.aumentarStock(cantidad));
    }

    @Test
    public void testRetirarStock() {
        Integer cantidad = 1;
        Producto instance = this.productoBase;
        instance.retirarStock(cantidad);
        assertEquals(0, instance.getStock());
    }
    
    @Test
    public void testRetirarStockErrorNegativo() {
        Integer cantidad = -1;
        Producto instance = this.productoBase;
        assertThrows(IllegalArgumentException.class, () -> instance.retirarStock(cantidad));
    }
    
    @Test
    public void testRetirarStockErrorMayorASaldo() {
        Integer cantidad = 99999;
        Producto instance = this.productoBase;
        assertThrows(IllegalStateException.class, () -> instance.retirarStock(cantidad));
    }

    @Test
    public void testActualizarPrecio() {
        Integer nuevoPrecio = 999;
        Producto instance = this.productoBase;
        instance.actualizarPrecio(nuevoPrecio);
        assertEquals(nuevoPrecio, instance.getPrecio());
    }
    
    @Test
    public void testActualizarPrecioError() {
        Integer nuevoPrecio = -999;
        Producto instance = this.productoBase;
        assertThrows(IllegalArgumentException.class, () -> instance.actualizarPrecio(nuevoPrecio));
    }
    
}
