package edu.pingpong.mordor;

import edu.pingpong.mordor.interfaces.Pedido;
import edu.pingpong.mordor.interfaces.TratamientoPedido;
import edu.pingpong.mordor.pedidos.PedidoNacional;
import edu.pingpong.mordor.procesadores.Oficina;
import edu.pingpong.mordor.tratamientos.TratamientoPedidoMultiple;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("\nSu pedido con multiples bultos está siendo tratado"
                +"\n----------------------------------------\n");
        Oficina oficina = new Oficina();

        Set<Pedido> listaPedidos = new HashSet<>();

        /*Pedido pedido = new PedidoInternacional("Comarca", 10);*/

        Pedido pedido = new PedidoNacional("Comarca",0);
        Pedido pedido2 = new PedidoNacional("Mordor",0);

        listaPedidos.add(pedido2);
        listaPedidos.add(pedido);
        oficina.printarStatus(true, pedido);

//        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
//                (PedidoInternacional) pedido);

        TratamientoPedido tratamientoInt = new TratamientoPedidoMultiple(listaPedidos);

//        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        System.out.println(oficina.printarStatus(oficina.procesar(tratamientoInt),pedido));
        System.out.println(oficina.printarStatus(oficina.procesar(tratamientoInt),pedido2));

//
//        pedido = new PedidoInternacional("Mordor", 10);
//        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);
//
//        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));
//
//        pedido = new PedidoPeligrosoOrden("Cima de los vientos",
//                "No urgarse en las uñas con este puñal");
//        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
//
//        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));
//
//        pedido = new PedidoPeligrosoOrden("Monte del destino",
//                "No ponerselo en el dedo");
//        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
//
//        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        /*
         * Los pedidos multiples se completan en el ultimo de los casos test
         */
    }

    }

