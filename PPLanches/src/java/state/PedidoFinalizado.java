package state;

import model.Pedido;

public class PedidoFinalizado implements PedidoEstado{
    
     @Override
    public String getEstado(Pedido p) {
        return "Pedido já finalizado.";
    }

    @Override
    public String Cadastrado(Pedido p) {
        return "Pedido já finalizado.";
    }

    @Override
    public String EmProducao(Pedido p) {
        return "Pedido já finalizado.";
    }

    public String EmEntrega(Pedido p) {
        return "Pedido já finalizado.";
    }

    public String Entregue(Pedido p) {
        return "Pedido já finalizado.";
    }

    public String Finalizado(Pedido p) {
        return "Pedido já finalizado.";
    }

    
}
