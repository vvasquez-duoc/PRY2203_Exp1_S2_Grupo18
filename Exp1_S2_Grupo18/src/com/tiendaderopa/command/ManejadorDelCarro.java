package com.tiendaderopa.command;

import java.util.ArrayList;
import java.util.List;

public class ManejadorDelCarro {
    private List<Command> listaDeComandos = new ArrayList<>();
    
    public void agregarComando(Command comando){
        listaDeComandos.add(comando);
    }
    
    public void ejecutarComandos(){
        for(Command comando : listaDeComandos){
            comando.ejecutar();
        }
        listaDeComandos.clear();
    }
}
