package com.tiendaderopa.App;

import com.tiendaderopa.command.AgregarAlCarro;
import com.tiendaderopa.command.Carro;
import com.tiendaderopa.command.Command;
import com.tiendaderopa.command.ManejadorDelCarro;
import com.tiendaderopa.command.RemoverDelCarro;
import com.tiendaderopa.decorador.Component;
import com.tiendaderopa.decorador.DescuentoDiezPorciento;
import com.tiendaderopa.decorador.DescuentoMarca;
import com.tiendaderopa.decorador.Producto;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ManejadorDelCarro manejadorDelCarro = new ManejadorDelCarro();
        
        // CREO VARIOS PRODUCTOS
        Producto poleraPolo = new Producto("Polera", 7500, "Polo");
        Producto poleraMaui = new Producto("Polera", 8990, "Maui");
        Producto jeansCK = new Producto("Jeans", 35990, "Calvin Klein");
        Producto pantalonDockers = new Producto("Pantalon", 27990, "Dockers");
        Producto zapatillasAdidas = new Producto("Zapatillas", 69990, "Adidas");
        Producto zapatillasNike = new Producto("Zapatillas", 57990, "Nike");
        
        // APLICO DESCUENTOS
        // DESCUENTO DE 10% A POLERAS
        Component poleraPoloDescuento = new DescuentoDiezPorciento(poleraPolo);
        Component poleraMauiDescuento = new DescuentoDiezPorciento(poleraMaui);
        // DESCUENTO A ZAPATILLAS PERO SOLO DE LA MARCA ADIDAS DEL 40%
        Component zapatillasAdidasDescuento = new DescuentoMarca(zapatillasAdidas, 40, "Adidas");
        Component zapatillasNikeDescuento = new DescuentoMarca(zapatillasNike, 40, "Adidas");
        
        // GENERO COMANDOS
        Command agregarPoleraPolo = new AgregarAlCarro(carro, poleraPoloDescuento);
        Command agregarPoleraMaui = new AgregarAlCarro(carro, poleraMauiDescuento);
        Command agregarJeansCK = new AgregarAlCarro(carro, jeansCK);
        Command agregarPantalonDockers = new AgregarAlCarro(carro, pantalonDockers);
        Command agregarZapatillasNike = new AgregarAlCarro(carro, zapatillasNikeDescuento);
        Command agregarZapatillasAdidas = new AgregarAlCarro(carro, zapatillasAdidasDescuento);
        Command removerPantalonDockers = new RemoverDelCarro(carro, pantalonDockers);
        
        // AGREGO LOS COMANDOS AL MANEJADOR
        manejadorDelCarro.agregarComando(agregarPoleraPolo);
        manejadorDelCarro.agregarComando(agregarPoleraMaui);
        manejadorDelCarro.agregarComando(agregarJeansCK);
        manejadorDelCarro.agregarComando(agregarPantalonDockers);
        manejadorDelCarro.agregarComando(agregarZapatillasNike);
        manejadorDelCarro.agregarComando(agregarZapatillasAdidas);
        manejadorDelCarro.agregarComando(removerPantalonDockers);
        
        // EJECUTAR LOS COMANDOS
        manejadorDelCarro.ejecutarComandos();
        
        // MUESTRO CONTENIDO DEL CARRO
        carro.mostrarProductos();
        carro.mostrarTotalCarro();
    }
}
