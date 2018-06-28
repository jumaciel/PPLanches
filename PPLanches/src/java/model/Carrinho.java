package model;

import java.util.Observable;
import state.PedidoCadastrado;
import state.PedidoEmEntrega;
import state.PedidoEmProducao;
import state.PedidoEntregue;
import state.PedidoEstado;
import state.PedidoFinalizado;

public class Carrinho extends Observable {
    
    private int codPed;
    private String descricao;
    private Double valorTotal;
  
    
    public Carrinho(int codPed,String descricao, Double valorTotal) {
        this.codPed = codPed;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public Carrinho(int codPed) {
        this.codPed = codPed;
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
    
    
    

