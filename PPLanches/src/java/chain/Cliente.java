/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;
import chain.TipoCliente;
import java.util.Observable;
import java.util.Observer;
import model.Pedido;
import strategy.ClienteStrategy;

/**
 *
 * @author anacarolyne.franca
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public abstract class Cliente extends ClienteStrategy implements Observer{

    protected int codCliente;
    protected String nome;
    protected String tel;
    protected String cpf;
    private Observable pedido;
   

    public Cliente( int codCliente, String nome, String tel, String cpf, String tipoCliente) {
        
        this.codCliente = codCliente;
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
        this.tipoCliente = tipoCliente;
        pedido.addObserver(this);
    }
    
  
 
  
    public Cliente() {
        
    }

    public Cliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String getTipoCliente();
    
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int cod) {
        this.codCliente = cod;
    }
    
      @Override
    public void update(Observable pedido, Object arg) {
        if (pedido instanceof Pedido) {
            Pedido estado = (Pedido) pedido;
            System.out.println("O estado da entrega foi alterado para " + estado.getPedidoEstado());
        }
    }
    
    public static TipoCliente getObjectFromString(String tipoCliente) {
        
        return null;
    }
     
}
