package com.tiendaderopa.decorador;

public abstract class Decorator implements Component{
    protected Component producto;
    
    public Decorator(Component producto){
        this.producto = producto;
    }
    
    @Override
    public int getPrecio(){
        return producto.getPrecio();
    }

    @Override
    public String getMarca(){
        return producto.getMarca();
    }
    
    @Override
    public String getNombre(){
        return producto.getNombre();
    }
}
