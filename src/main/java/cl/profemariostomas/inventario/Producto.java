/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.profemariostomas.inventario;

/**
 *
 * @author luk0s
 */
public class Producto {
    private String nombre;
    private Integer precio, stock;

    public Producto(String nombre, Integer precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public void aumentarStock(Integer cantidad){
        if (cantidad < 1){
            throw new IllegalArgumentException(
                "La cantidad no puede ser menor a 1"
            );
        }
        this.stock += cantidad;
    }
    
    public void retirarStock(Integer cantidad){
        if (cantidad < 1){
            throw new IllegalArgumentException(
                "La cantidad no puede ser menor a 1"
            );
        }
        
        if (cantidad < this.stock){
            throw new IllegalStateException(
                "La cantidad a retirar no puede ser mayor al stock actual"
            );
        }
        
        this.stock -= cantidad;
    }
    
    public void actualizarPrecio(Integer nuevoPrecio) {
        if (nuevoPrecio < 1){
            throw new IllegalArgumentException(
                "La precio no puede ser menor a 1"
            );
        }
        
        this.precio = nuevoPrecio;
    }
}
