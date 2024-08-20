package com.tiendaderopa.decorador;

public class DescuentoMarca extends Decorator{
    private int descuentoMarca;
    private String marcaConDescuento;
    
    public DescuentoMarca(Component producto, int descuentoMarca, String marcaConDescuento){
        super(producto);
        this.descuentoMarca = descuentoMarca;
        this.marcaConDescuento = marcaConDescuento;
    }
    
    @Override
    public int getPrecio(){
        if(super.getMarca().equals(marcaConDescuento)){
            return (int) Math.round(super.getPrecio() - (super.getPrecio() * descuentoMarca / 100));
        }
        return super.getPrecio();
    }
}
