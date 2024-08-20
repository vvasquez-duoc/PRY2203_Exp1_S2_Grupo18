package com.tiendaderopa.decorador;

public class Producto implements Component {
    private String nombre;
    private int precio;
    private String marca;
    
    public Producto(String nombre, int precio, String marca){
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }
    
    @Override
    public int getPrecio(){
        return this.precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getMarca(){
        return this.marca;
    }
}
