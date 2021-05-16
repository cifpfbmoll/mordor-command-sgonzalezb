package edu.pingpong.mordor.pedidos;

import edu.pingpong.mordor.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {

    private final String id;
    private String destino;
    private int peso;


    public PedidoInternacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString(); /*Genera un ID aleatorio*/
        this.destino = destino;
        this.peso = peso;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }


}
