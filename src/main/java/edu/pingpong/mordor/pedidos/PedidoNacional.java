package edu.pingpong.mordor.pedidos;

import edu.pingpong.mordor.interfaces.Pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido {


    private final String id;
    private String destino; /*Final? En caso de NO serlo en  la clase deberían aparecer los setters para poder modificar, en caso de que fuese necesario, los atributos*/
    private int peso;


    public PedidoNacional(String destino, int peso) {
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
