
package state;

import model.Funcionario;

public class FuncionarioDemitido implements FuncionarioEstado{


    public String getEstado(Funcionario f) {
        return "Demitido";
    }


    public String Cadastrado(Funcionario f) { 
        return "Cadastro não realizado uma vez que demitido";
    }


    public String Demitido(Funcionario f) {
        return "Funcionario(a) já demitido.";
    }

}
