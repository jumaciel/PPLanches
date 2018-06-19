package model;

import state.PedidoCadastrado;
import state.PedidoEstado;

public class Pedido {
    
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
    }
    
    
    
 
    
    
    
}
