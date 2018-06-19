package state;

import model.Pedido;

public interface PedidoEstado {

    public String getEstado(Pedido p);

    public String Cadastrado(Pedido p);

    public String EmProducao(Pedido p);

    public String EmEntrega(Pedido p);

    public String Entregue(Pedido p);

    public String Finalizado(Pedido p);

}
