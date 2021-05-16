package edu.pingpong.mordor.tratamientos;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.TratamientoPedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private final Set<Pedido> listaPedidos;
    private Integer pesoTotal = 0;
    private Long numBultos = 0L;

    public TratamientoPedidoMultiple(Set<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public Long getNumBultos(){
        return this.numBultos;
    }

    public Integer getPesoTotal(){
        return this.pesoTotal;
    }


    public void calcularTotalBultos(){

        this.numBultos = (long) listaPedidos.size();

    }

    public void calcularPesoTotal(){
        this.pesoTotal = listaPedidos.stream().mapToInt(Pedido::peso).sum();
    }

    @Override
    public boolean tratar(){
        calcularTotalBultos();
        calcularPesoTotal();

        return this.pesoTotal > 0 && this.listaPedidos.size() == this.numBultos;


    }
}
