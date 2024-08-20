package com.tiendaderopa.command;

import com.tiendaderopa.decorador.Component;
import com.tiendaderopa.decorador.Producto;

public class RemoverDelCarro implements Command {
    private Carro carro;
    private Component producto;
    
    public RemoverDelCarro(Carro carro, Component producto){
        this.carro = carro;
        this.producto = producto;
    }
    
    @Override
    public void ejecutar(){
        carro.removerProducto(producto);
    }
}
