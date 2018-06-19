package state;

import model.Pedido;

public class PedidoEntregue implements PedidoEstado {

    @Override
    public String getEstado(Pedido p) {
        return "Pedido entregue";
    }

    @Override
    public String Cadastrado(Pedido p) {
        return "Pedido entregue";
    }

    @Override
    public String EmProducao(Pedido p) {
        return "Pedido entregue";
    }

    public String EmEntrega(Pedido p) {
        return "Pedido entregue";
    }

    public String Entregue(Pedido p) {
        return "Pedido entregue";
    }

    public String Finalizado(Pedido p) {
        p.setPedidoEstado(new PedidoFinalizado());
        return "Pedido finalizado.";
    }

}
