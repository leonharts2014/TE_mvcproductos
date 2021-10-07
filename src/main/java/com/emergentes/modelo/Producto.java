
package com.emergentes.modelo;

public class Producto {
    private int id;
    private String descripcion;
    private int cantidad;
    private String precio;

    public Producto() {
        this.id = 0;
        this.descripcion ="";
        this.cantidad= 0;
        this.precio = "";
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
