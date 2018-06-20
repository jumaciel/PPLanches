/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import state.PedidoEstado;

/**
 *
 * @author anacarolyne.franca
 */
public class TesteObserver {
     public static void main(String[] args) {
    Pedido pedido = new Pedido();
    PedidoEstado entregue = null;
    pedido.setPedidoEstado(entregue);
    }
}


