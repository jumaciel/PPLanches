package state;

import model.Pedido;

public class PedidoCadastrado implements PedidoEstado{

    @Override
    public String getEstado(Pedido p) {
        return "Pedido cadastrado";
    }

    @Override
    public String Cadastrado(Pedido p) {
        return "Seu pedido já foi cadastrado.";
    }

    @Override
    public String EmProducao(Pedido p) {
        p.setPedidoEstado(new PedidoEmProducao());
        return "Seu pedido começou a ser produzido.";
    }

    public String EmEntrega(Pedido p) {
        return "Aguarde. Pedido cadastrado.";
    }

    public String Entregue(Pedido p) {
        return "Aguarde. Pedido cadastrado.";
    }

    public String Finalizado(Pedido p) {
        return "Aguarde. Pedido cadastrado.";
    }
    
}