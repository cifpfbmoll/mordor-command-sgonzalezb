package edu.pingpong.mordor.procesadores;

import edu.pingpong.mordor.Status;
import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.TratamientoPedido;

public class Oficina implements Procesador{

    public Oficina() {
        //ad
    }

    @Override
    public boolean procesar(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }


    /*Si el Boolean que pasamos como parámetro printará que el pedido si está Aceptado, si el parametro es False printará rechazado*/
    public String printarStatus(boolean aceptado, Pedido pedido){
        return aceptado? "Su pedido con destino a: "+ pedido.destino() + " ha sido: " + Status.ACEPTADO : "Su pedido con destino a: " + pedido.destino() + " ha sido: " + Status.RECHAZADO;

    }

}
