package state;

import model.Pedido;

public class PedidoEmEntrega implements PedidoEstado{
    
    @Override
    public String getEstado(Pedido p) {
        return "Pedido sendo entregue.";
    }

    @Override
    public String Cadastrado(Pedido p) {
        return "Pedido sendo entregue.";
    }

    @Override
    public String EmProducao(Pedido p) {        
        return "Pedido sendo entregue.";
    }

    public String EmEntrega(Pedido p) {
        return "Pedido sendo entregue.";
    }

    public String Entregue(Pedido p) {
        p.setPedidoEstado(new PedidoEntregue());
        return "Pedido entregue";
    }

    public String Finalizado(Pedido p) {
        return "Pedido entregue";
    }

}
