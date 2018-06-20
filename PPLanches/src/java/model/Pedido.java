package model;

import java.util.Observable;
import state.PedidoCadastrado;
import state.PedidoEmEntrega;
import state.PedidoEmProducao;
import state.PedidoEntregue;
import state.PedidoEstado;
import state.PedidoFinalizado;

public class Pedido extends Observable {
    
    private int codPed;
    private String descricao;
    private float valorTotal;
    private String status;
    private PedidoEstado pedidoEstado;

  
    
    public Pedido(int codPed, String descricao, float valorTotal , String status) {
        this.codPed = codPed;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Pedido(int codPed) {
        this.codPed = codPed;
    }

    public Pedido() {
        this.pedidoEstado = new PedidoCadastrado();
    }

  

  

    public int getCodPed() {
        return codPed;
    }

    public void setCodPed(int codPed) {
        this.codPed = codPed;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 

    public PedidoEstado getPedidoEstado() {
        return pedidoEstado;
    }

    public void setPedidoEstado(PedidoEstado pedidoEstado) {
       this.pedidoEstado = pedidoEstado;
        setChanged();
        notifyObservers();
    }
    
    
    
    
 public void setEstadoFromString(String estado) {
        if (estado.equals("Pedido cadastrado")) {
            this.pedidoEstado = new PedidoCadastrado();
            
        } else if (estado.equals("Pedido sendo entregue.")) {
            this.pedidoEstado = new PedidoEmEntrega();
            
        } else if (estado.equals("Pedido em produção.")) {
            this.pedidoEstado = new PedidoEmProducao();
            
        } else if (estado.equals("Pedido entregue")) {
            this.pedidoEstado = new PedidoEntregue();
            
        }else if (estado.equals("Pedido já finalizado.")) {
            this.pedidoEstado = new PedidoFinalizado();
    }
 }

   
}
    
    
    

