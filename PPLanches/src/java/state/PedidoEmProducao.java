package state;

import model.Pedido;

public class PedidoEmProducao implements PedidoEstado {

    @Override
    public String getEstado(Pedido p) {
        return "Pedido em produção.";
    }

    @Override
    public String Cadastrado(Pedido p) {
        return "Pedido em Produção. Aguarde.";
    }

    @Override
    public String EmProducao(Pedido p) {        
        return "Pedido em Produção. Aguarde.";
    }

    public String EmEntrega(Pedido p) {
        p.setPedidoEstado(new PedidoEmEntrega());
        return "Pedido sendo entregue.";
    }

    public String Entregue(Pedido p) {
        return "Pedido em Produção. Aguarde.";
    }

    public String Finalizado(Pedido p) {
        return "Pedido em Produção. Aguarde.";
    }

}
