package state;

import model.Funcionario;

public interface FuncionarioEstado {

    public String getEstado(Funcionario f);

    public String Cadastrado(Funcionario f);

    public String Demitido(Funcionario f);

}
