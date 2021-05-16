package edu.pingpong.mordor.procesadores;

import edu.pingpong.mordor.interfaces.TratamientoPedido;

public interface Procesador {
    boolean procesar(TratamientoPedido tratamientoPedido);
}
