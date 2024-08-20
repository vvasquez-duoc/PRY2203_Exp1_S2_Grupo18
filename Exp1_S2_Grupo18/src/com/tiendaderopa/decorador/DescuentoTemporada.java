package com.tiendaderopa.decorador;

public class DescuentoTemporada extends Decorator{
    private int descuentoTemporada;
    
    public DescuentoTemporada(Component producto, int descuentoTemporada){
        super(producto);
        this.descuentoTemporada = descuentoTemporada;
    }
    
    @Override
    public int getPrecio(){
        return (int) Math.round(super.getPrecio() - (super.getPrecio() * descuentoTemporada / 100));
    }
}
