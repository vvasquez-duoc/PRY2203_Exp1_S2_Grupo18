package com.tiendaderopa.decorador;

public class DescuentoDiezPorciento extends Decorator{
    public DescuentoDiezPorciento(Component producto){
        super(producto);
    }
    
    @Override
    public int getPrecio(){
        return (int) Math.round(super.getPrecio() * 0.9);
    }
}
