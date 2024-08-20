package com.tiendaderopa.command;

import com.tiendaderopa.decorador.Component;
import com.tiendaderopa.decorador.Producto;
import java.util.ArrayList;
import java.util.List;

public class Carro {
    private List<Component> productos = new ArrayList<>();
    
    public void agregarProducto(Component producto){
        productos.add(producto);
        System.out.println("SE AGREGO AL CARRO: "+producto.getNombre()+" "+producto.getMarca());
    }
    
    public void removerProducto(Component producto){
        productos.remove(producto);
        System.out.println("SE ELIMINO DEL CARRO: "+producto.getNombre()+" "+producto.getMarca());
    }
    
    public void mostrarProductos(){
        System.out.println("PRODUCTOS EN EL CARRO: ");
        for(Component producto: productos){
            System.out.println(producto.getNombre()+" "+producto.getMarca()+" - $"+producto.getPrecio());
        }
    }
    
    public void mostrarTotalCarro(){
        int precioTotal = 0;
        for(Component producto: productos){
            precioTotal += producto.getPrecio();
        }
        System.out.println("PRECIO TOTAL DEL CARRO: $"+precioTotal);
    }
}
